package com.Nteam.backend.medicine.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
public class Medicine {
    @Id
    private Long medicine_id;

    private String medicine_name;

//    private MedicineCategory medicineCategory;

    private String medicine_efficacy;

    private String instructions;

    private String medicine_caution;

    private String medicine_side_effect;
}