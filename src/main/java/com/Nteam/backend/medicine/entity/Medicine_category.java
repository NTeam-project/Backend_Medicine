package com.Nteam.backend.medicine.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Medicine_category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medicine_category_id;

    private String medicine_category_name;
}
