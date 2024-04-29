package com.Nteam.backend.medicine.repository;

import com.Nteam.backend.medicine.entity.Medicine;
import com.Nteam.backend.medicine.entity.MedicineCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicineCategoryRepository extends JpaRepository<MedicineCategory, Long> {
    MedicineCategory findByCategoryName(String categoryName);

}