package kz.alabs.springathletes.service;

import kz.alabs.springathletes.dto.AthleteView;
import kz.alabs.springathletes.entity.Athlete;
import java.util.List;

public interface AthleteService {
    List<Athlete> findAllAthlete();
    Athlete saveAthlete(Athlete athlete);
    AthleteView findByPhoneNumber(String phoneNumber);
    Athlete updateAthlete(Athlete athlete);
    void deleteAthlete(String phoneNumber);
}
