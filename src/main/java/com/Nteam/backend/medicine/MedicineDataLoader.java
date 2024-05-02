package com.Nteam.backend.medicine;

import com.Nteam.backend.medicine.entity.Medicine;
import com.Nteam.backend.medicine.entity.MedicineCategory;
import com.Nteam.backend.medicine.repository.MedicineCategoryRepository;
import com.Nteam.backend.medicine.repository.MedicineRepository;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

@Component
public class MedicineDataLoader implements CommandLineRunner {

    @Autowired
    private MedicineRepository medicineRepository;
    @Autowired
    private MedicineCategoryRepository medicineCategoryRepository;

    @Override
    public void run(String... args) throws Exception {
        // Medicine API json 파일
        String medicineAPIPath = "MedicineAPI.json";

        try {
            // Medicine 저장
            InputStream medicineInputStream = new ClassPathResource(medicineAPIPath).getInputStream();
            ObjectMapper medicineObjectMapper = new ObjectMapper();
            JsonNode medicineRootNode = medicineObjectMapper.readTree(medicineInputStream);
            JsonNode medicinesNode = medicineRootNode.isArray() ? medicineRootNode : medicineRootNode.get("medicines");
            if (medicinesNode != null && medicinesNode.isArray()) {
                for (JsonNode medicineNode : medicinesNode) {
                    Medicine medicine = new Medicine();
                    medicine.setMedicine_id(medicineNode.get("medicine_id").asLong());
                    medicine.setMedicine_name(medicineNode.get("medicine_name").asText());
                    medicine.setMedicine_image(medicineNode.get("medicine_image").asText());
                    medicine.setMedicine_efficacy(medicineNode.get("medicine_efficacy").asText());
                    medicine.setInstructions(medicineNode.get("instructions").asText());
                    medicine.setMedicine_caution(medicineNode.get("medicine_caution").asText());
                    medicine.setMedicine_side_effect(medicineNode.get("medicine_side_effect").asText());

                    // MedicineCategory 참조 설정
                    JsonNode categoryNode = medicineNode.get("medicineCategory");
                    if (categoryNode != null) {
                        String categoryName = categoryNode.get("category_name").asText();
                        MedicineCategory category = medicineCategoryRepository.findByCategoryName(categoryName);
                        if (category == null) {
                            // 카테고리가 존재하지 않으면 새로운 카테고리를 생성하여 저장
                            category = new MedicineCategory();
                            category.setCategoryName(categoryName);
                            category = medicineCategoryRepository.save(category);
                        }
                        medicine.setMedicineCategory(category);
                    }

                    medicineRepository.save(medicine);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
