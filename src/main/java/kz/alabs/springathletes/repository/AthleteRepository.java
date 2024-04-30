package kz.alabs.springathletes.repository;

import kz.alabs.springathletes.entity.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AthleteRepository extends JpaRepository<Athlete, Long> {

    void deleteByPhoneNumber(String phoneNumber);
    Athlete findAthleteByPhoneNumber(String phoneNumber);
}
