package com.backend.DBSBackend.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.Instant;

@Data
@ToString
@EqualsAndHashCode
public class appDTO {

    private String place;

    private Instant date;

    private String hni_id;
}
