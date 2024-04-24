package com.Nteam.backend.medicine.entity;

import com.Nteam.backend.medicine.entity.Medicine_category;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medicine_id;

    private String medicine_name;

    @ManyToOne
    @JoinColumn(name="medicine_category_id")
    private Medicine_category medicineCategory;

    private String medicine_efficacy;

    private String instructions;

    private String medicine_caution;

    private String medicine_side_effect;
}