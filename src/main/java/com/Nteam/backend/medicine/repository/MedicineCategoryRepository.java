package com.Nteam.backend.medicine.repository;

import com.Nteam.backend.medicine.entity.MedicineCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineCategoryRepository extends JpaRepository<MedicineCategory, Long> {
    MedicineCategory findByCategoryName(String categoryName);

}