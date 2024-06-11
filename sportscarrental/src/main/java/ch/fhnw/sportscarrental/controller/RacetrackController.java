package ch.fhnw.sportscarrental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ch.fhnw.sportscarrental.business.service.RacetrackService;
import ch.fhnw.sportscarrental.data.domain.Racetrack;

import java.util.List;

@RestController
@RequestMapping("/api/racetracks")
public class RacetrackController {
    @Autowired
    private RacetrackService racetrackService;

    @GetMapping
    public List<Racetrack> getAllRacetracks() {
        return racetrackService.getAllRacetracks();
    }

    @GetMapping("/{id}")
    public Racetrack getRacetrackById(@PathVariable Long id) {
        return racetrackService.getRacetrackById(id);
    }

    @PostMapping
    public Racetrack createRacetrack(@RequestBody Racetrack racetrack) {
        return racetrackService.saveRacetrack(racetrack);
    }

    @PutMapping("/{id}")
    public Racetrack updateRacetrack(@PathVariable Long id, @RequestBody Racetrack racetrack) {
        racetrack.setTrackID(id);
        return racetrackService.saveRacetrack(racetrack);
    }

    @DeleteMapping("/{id}")
    public void deleteRacetrack(@PathVariable Long id) {
        racetrackService.deleteRacetrack(id);
    }
}