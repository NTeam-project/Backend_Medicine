package com.Nteam.backend.medicine.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
public class MedicineCategory {
    @Id
    private Long category_id;
    private String category_name;

}
