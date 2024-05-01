package kz.alabs.springathletes.entity;

import jakarta.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Transient;

import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
@Table(name = "athletes")
public class Athlete {
    @Getter
    @Setter
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surName;
    private LocalDate birthDate;
    @Transient
    private int age;
    private String profile;
    @Column(unique = true)
    private String phoneNumber;
    private String password;

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
