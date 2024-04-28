package com.Nteam.backend.medicine.controller;

import com.Nteam.backend.medicine.entity.Medicine;
import com.Nteam.backend.medicine.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medicines")
public class MedicineController {

    @Autowired
    private MedicineRepository medicineRepository;


    // 상비약 전체 불러오기
    @GetMapping("")
    public List<Medicine> getAllMedicines() {
        return medicineRepository.findAll();
    }

    // medicine_id 로 특정 상비약 정보 불러오기
    @GetMapping("/{medicine_id}")
    public Optional<Medicine> getMedicine(@PathVariable Long medicine_id) {
        return medicineRepository.findById(medicine_id);
    }
}