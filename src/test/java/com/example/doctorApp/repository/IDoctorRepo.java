package com.example.doctorApp.repository;



import com.example.doctorApp.model.Doctor;
import com.example.doctorApp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDoctorRepo extends JpaRepository<Doctor, Long> {


    Doctor findByDoctorId(Long docId);
}