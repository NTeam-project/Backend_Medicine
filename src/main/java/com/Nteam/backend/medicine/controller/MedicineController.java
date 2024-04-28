package com.Nteam.backend.medicine.controller;

import com.Nteam.backend.medicine.entity.Medicine;
import com.Nteam.backend.medicine.repository.MedicineRepository;
import com.Nteam.backend.medicine.service.MedicineService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MedicineController {
    private final MedicineService medicineService;

    @Autowired
    private MedicineRepository medicineRepository;


    // 상비약 전체 불러옴
    @GetMapping("/medicines")
    public List<Medicine> getAllMedicines() {
        return medicineRepository.findAll();
    }
}