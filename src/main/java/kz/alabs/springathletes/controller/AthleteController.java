package kz.alabs.springathletes.controller;

import kz.alabs.springathletes.dto.AthleteView;
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
    public String saveAthlete(@RequestBody Athlete athlete) {
        service.saveAthlete(athlete);
        return "Athlete saved successfully";
    }

    @GetMapping("/{phoneNumber}")
    public AthleteView findByPhoneNumber(@PathVariable String phoneNumber) {
        return service.findByPhoneNumber(phoneNumber);
    }

    @PutMapping("/update_athlete")
    public Athlete updateAthlete(@RequestBody Athlete athlete) {
        return service.updateAthlete(athlete);
    }

    @DeleteMapping("/delete_athlete/{phoneNumber}")
    public void deleteAthlete(@PathVariable String phoneNumber) {
        service.deleteAthlete(phoneNumber);
    }
}
