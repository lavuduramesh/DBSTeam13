package com.backend.DBSBackend.repository;

import com.backend.DBSBackend.models.appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Repository
public interface AppointmentRepository extends JpaRepository<appointment,Long> {

    @Query(value = "select * from appointments where wm_id=:wmid",nativeQuery = true)
    List<appointment> findAllBywm_id(@PathVariable  String wmid);

    @Query(value = "select * from appointments where hni_id=:hnid",nativeQuery = true)
    List<appointment> findAllByhni_id(@PathVariable String hnid);


}
