package com.Nteam.backend.medicine.repository;

import com.Nteam.backend.medicine.dto.MedicineDto;
import com.Nteam.backend.medicine.dto.MedicineElementDto;
import com.Nteam.backend.medicine.entity.Medicine;
import com.Nteam.backend.medicine.entity.MedicineCategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {

    List<Medicine> findAll();

//    Optional<Medicine> findByMedicineCategoryCategory_id(Long category_id);
}