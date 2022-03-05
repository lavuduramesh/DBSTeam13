package com.backend.DBSBackend.models;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "appointments")
@Data
@ToString
@EqualsAndHashCode
public class appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String wm_id;

    private String hni_id;


    private String place;

    private Instant date;



}
