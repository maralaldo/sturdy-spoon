package kz.alabs.springathletes.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Data
@Builder

public class Athlete {
    private String name;
    private String surName;
    private LocalDate birthDate;
    private int age;
    private String phoneNumber;

}
