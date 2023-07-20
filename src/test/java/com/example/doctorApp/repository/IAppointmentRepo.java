package com.example.doctorApp.repository;

import com.example.doctorApp.model.Appointment;
import com.example.doctorApp.model.AppointmentKey;
import com.example.doctorApp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepo extends JpaRepository<Appointment, AppointmentKey> {

    public String findByIdAppId(Long id);
}