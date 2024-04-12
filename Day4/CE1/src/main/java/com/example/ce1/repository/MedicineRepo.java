package com.example.ce1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ce1.model.Medicine;
public interface MedicineRepo extends JpaRepository<Medicine,Integer>{
  
}