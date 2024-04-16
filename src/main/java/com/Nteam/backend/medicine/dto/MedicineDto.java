package com.Nteam.backend.medicine.dto;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MedicineDto {
    private Long medicine_id;

    private String medicine_name;

    private String medicine_category;

    private String medicine_efficacy;

    private String instructions;

    private String medicine_caution;

    private String medicine_side_effect;
}

