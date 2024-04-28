package com.Nteam.backend.medicine.dto;

import com.Nteam.backend.medicine.entity.Medicine;
import com.Nteam.backend.medicine.entity.MedicineCategory;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MedicineDto {
    private Long medicine_id;

    private String medicine_name;

    private MedicineCategory medicineCategory;

    private String medicine_efficacy;

    private String instructions;

    private String medicine_caution;

    private String medicine_side_effect;

    public static MedicineDto MedicineDTO(Medicine medicine){
        MedicineDto memberDTO = new MedicineDto();
        memberDTO.setMedicine_id(medicine.getMedicine_id());
        memberDTO.setMedicine_name(medicine.getMedicine_name());
        memberDTO.setMedicineCategory(medicine.getMedicineCategory());
        memberDTO.setMedicine_efficacy(medicine.getMedicine_efficacy());
        memberDTO.setInstructions(medicine.getInstructions());
        memberDTO.setMedicine_caution(medicine.getMedicine_caution());
        memberDTO.setMedicine_side_effect(medicine.getMedicine_side_effect());

        return memberDTO;
    }
}

