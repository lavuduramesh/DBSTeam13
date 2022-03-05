package com.backend.DBSBackend.models;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
@Data
@ToString
@EqualsAndHashCode
@Entity
public class user {

    @Id
    private Long id;

    private String username;

    private String password;

    private String phone;

    private String email;



}
