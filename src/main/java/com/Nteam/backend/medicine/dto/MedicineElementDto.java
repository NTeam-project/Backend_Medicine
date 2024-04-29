package com.Nteam.backend.medicine.dto;

import com.Nteam.backend.medicine.entity.Medicine;
import com.Nteam.backend.medicine.entity.MedicineCategory;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MedicineElementDto {
    private Long medicine_id;

    private String medicine_name;

    private MedicineCategory medicineCategory;

    public MedicineElementDto(Medicine medicine) {
        this.medicine_id = medicine.getMedicine_id();
        this.medicine_name = medicine.getMedicine_name();
        this.medicineCategory = medicine.getMedicineCategory();
    }
}
