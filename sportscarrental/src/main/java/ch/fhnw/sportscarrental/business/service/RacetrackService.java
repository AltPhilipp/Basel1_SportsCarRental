package ch.fhnw.sportscarrental.business.service;

import ch.fhnw.sportscarrental.data.domain.Racetrack;
import ch.fhnw.sportscarrental.data.repository.RacetrackRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RacetrackService {
    @Autowired
    private RacetrackRepository racetrackRepository;

    public List<Racetrack> getAllRacetracks() {
        return racetrackRepository.findAll();
    }

    public Racetrack getRacetrackById(Long id) {
        return racetrackRepository.findById(id).orElse(null);
    }

    public Racetrack saveRacetrack(Racetrack racetrack) {
        return racetrackRepository.save(racetrack);
    }

    public void deleteRacetrack(Long id) {
        racetrackRepository.deleteById(id);
    }

    public void addRacetrack(Racetrack racetrack) {
        racetrackRepository.save(racetrack);
    }
}
