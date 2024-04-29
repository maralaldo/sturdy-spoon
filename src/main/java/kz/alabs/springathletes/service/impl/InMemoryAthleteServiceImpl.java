package kz.alabs.springathletes.service.impl;

import kz.alabs.springathletes.entity.Athlete;
import kz.alabs.springathletes.repository.InMemoryAthleteDAO;
import kz.alabs.springathletes.service.AthleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryAthleteServiceImpl implements AthleteService {
    private final InMemoryAthleteDAO repository;
    @Override
    public List<Athlete> findAllAthlete() {
            return repository.findAllAthlete();
        }

    @Override
    public Athlete saveAthlete(Athlete athlete) {
        return repository.saveAthlete(athlete);
    }

    @Override
    public Athlete findByPhoneNumber(String phoneNumber) {
        return repository.findByPhoneNumber(phoneNumber);
    }

    @Override
    public Athlete updateAthlete(Athlete athlete) {
        return repository.updateAthlete(athlete);
    }

    @Override
    public void deleteAthlete(String phoneNumber) {
        repository.deleteAthlete(phoneNumber);
    }

}
