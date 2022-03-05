package com.backend.DBSBackend.controller;


import com.backend.DBSBackend.models.appointment;
import com.backend.DBSBackend.dto.appDTO;
import com.backend.DBSBackend.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;


    @PostMapping("/addAppointment")
    public String addAppointment(@RequestBody appDTO a){
        appointmentService.createAppointment(a);

        return "appointment created sucessfully";
    }




    @GetMapping("/getAll/{id}")
    public List<appointment> getAppointmentByWM(@PathVariable String id){

        return appointmentService.getAppointmentByWM(id);
    }

    @GetMapping("/getAllHNI/{id}")
    public List<appointment> getAppointmentByHNI(@PathVariable String id){

        return appointmentService.getAppointmentByHNI(id);
    }

    @PutMapping("/edit")
    public String editAppointmentWM(@RequestBody appDTO a,@PathVariable Long id){
        return appointmentService.editAppointmentByHN(a,id);
    }

}
