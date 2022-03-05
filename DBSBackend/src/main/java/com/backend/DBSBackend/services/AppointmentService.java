package com.backend.DBSBackend.services;

import com.backend.DBSBackend.dto.appDTO;

import com.backend.DBSBackend.models.appointment;
import com.backend.DBSBackend.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    public void createAppointment(appDTO aDTO) {
        appointment a = new appointment();
        a.setDate(Instant.now());
        a.setHni_id(aDTO.getHni_id());
        a.setWm_id("1111");
        a.setPlace(aDTO.getPlace());
        appointmentRepository.save(a);
    }




    public List<appointment> getAppointmentByWM(String id) {
        List<appointment> list = appointmentRepository.findAllBywm_id(id);
        return list;
    }

    public Optional<appointment> getAppointment(Long id){
        return appointmentRepository.findById(id);
    }


    public List<appointment> getAppointmentByHNI(String id) {
        List<appointment> list = appointmentRepository.findAllByhni_id(id);
        return list;
    }

    public String editAppointmentByHN(appDTO aDTO,Long id) {
        appointment a = appointmentRepository.getById(id);
        a.setDate(Instant.now());
        a.setPlace(aDTO.getPlace());
        appointmentRepository.save(a);
        return "suessfull changed";
    }
}
