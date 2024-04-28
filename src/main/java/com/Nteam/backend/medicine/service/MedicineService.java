package com.Nteam.backend.medicine.service;

import com.Nteam.backend.medicine.dto.MedicineDto;
import com.Nteam.backend.medicine.entity.Medicine;
import com.Nteam.backend.medicine.repository.MedicineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service //스프링이 관리해주는 객체 == 스프링 빈
@RequiredArgsConstructor //controller와 같이. final 멤버변수 생성자 만드는 역할
public class MedicineService {
    private final MedicineRepository medicineRepository;

    public void save(MedicineDto medicineDto) {
        // repsitory의 save 메서드 호출
        Medicine medicineEntity = Medicine.toMedicine(medicineDto);
        medicineRepository.save(medicineEntity);
        //Repository의 save메서드 호출 (조건. entity객체를 넘겨줘야 함)

    }

}
