package com.example.ce4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ce4.model.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer>{
   
}