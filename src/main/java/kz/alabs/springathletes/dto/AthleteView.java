package kz.alabs.springathletes.dto;


import lombok.*;

import java.time.LocalDate;

public interface AthleteView {
    String getName();
    String getSurName();
    LocalDate getBirthDate();
    int getAge();
    String getProfile();
    String getPhoneNumber();
}
