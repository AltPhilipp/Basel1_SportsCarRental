package ch.fhnw.sportscarrental.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.fhnw.sportscarrental.data.domain.Racetrack;

@Repository
// JpaRepository should be typed to the domain class and an ID type
public interface RacetrackRepository extends JpaRepository<Racetrack, Long> {
    Racetrack findByTrackName(String trackName);
    List<Racetrack> findAllByTrackDescriptionContainsIgnoreCase(String trackDescription);
}
