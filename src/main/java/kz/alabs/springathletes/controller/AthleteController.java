package kz.alabs.springathletes.controller;

import kz.alabs.springathletes.entity.Athlete;
import kz.alabs.springathletes.service.AthleteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/athletes")
@AllArgsConstructor
public class AthleteController {

    private final AthleteService service;

    @GetMapping
    public List<Athlete> findAllAthlete() {
        //todo
        return service.findAllAthlete();
    }
    @PostMapping("/save_athlete")
    public Athlete saveAthlete(@RequestBody Athlete athlete) {
        return service.saveAthlete(athlete);
    }

    @GetMapping("/{phoneNumber}")
    public Athlete findByPhoneNumber(@PathVariable String phoneNumber) {
        return service.findByPhoneNumber(phoneNumber);
    }

    @PutMapping("/update_athlete")
    public Athlete updateAthlete(Athlete athlete) {
        return service.updateAthlete(athlete);
    }

    @DeleteMapping("/delete_athlete/{phoneNumber}")
    public void deleteAthlete(@PathVariable String phoneNumber) {
        service.deleteAthlete(phoneNumber);
    }
}
