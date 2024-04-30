package kz.alabs.springathletes.service.impl;

import kz.alabs.springathletes.entity.Athlete;
import kz.alabs.springathletes.repository.AthleteRepository;
import kz.alabs.springathletes.service.AthleteService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class AthleteServiceImpl implements AthleteService {

    private final AthleteRepository repository;
    @Override
    public List<Athlete> findAllAthlete() {
        return repository.findAll();
    }

    @Override
    public Athlete saveAthlete(Athlete athlete) {
        return repository.save(athlete);
    }

    @Override
    public Athlete findByPhoneNumber(String phoneNumber) {
        return repository.findAthleteByPhoneNumber(phoneNumber);
    }

    @Override
    public Athlete updateAthlete(Athlete athlete) {
        return repository.save(athlete);
    }

    @Override
    @Transactional
    public void deleteAthlete(String phoneNumber) {
        repository.deleteByPhoneNumber(phoneNumber);
    }
}
