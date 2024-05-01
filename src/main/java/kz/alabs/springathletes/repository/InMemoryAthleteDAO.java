package kz.alabs.springathletes.repository;

import kz.alabs.springathletes.dto.AthleteView;
import kz.alabs.springathletes.entity.Athlete;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryAthleteDAO {
    private final List<Athlete> ATHLETES = new ArrayList<>();
    private final List<AthleteView> ATHLETES_VIEW = new ArrayList<>();
    public List<Athlete> findAllAthlete() {
        return ATHLETES;
    }

    public Athlete saveAthlete(Athlete athlete) {
//        ATHLETES.add(athlete);
        return athlete;
    }

    public AthleteView findByPhoneNumber(String phoneNumber) {
        return ATHLETES_VIEW.stream()
                .filter(element -> element.getPhoneNumber().equals(phoneNumber))
                .findFirst()
                .orElse(null);
    }

    public Athlete updateAthlete(Athlete athlete) {
        var athleteIndex = IntStream.range(0, ATHLETES.size())
            .filter(index -> ATHLETES.get(index).getPhoneNumber().equals(athlete.getPhoneNumber()))
            .findFirst()
            .orElse( -1);
        if (athleteIndex > -1) {
            ATHLETES.set(athleteIndex, athlete);
            return athlete;
        }
        return null;
    }

    public void deleteAthlete(String phoneNumber) {
        var athlete = findByPhoneNumber(phoneNumber);
        if (athlete != null) {
            ATHLETES.remove(athlete);
        }
    }
}
