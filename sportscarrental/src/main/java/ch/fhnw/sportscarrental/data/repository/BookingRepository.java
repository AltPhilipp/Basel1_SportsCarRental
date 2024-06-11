package ch.fhnw.sportscarrental.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.fhnw.sportscarrental.data.domain.Booking;

@Repository
// JpaRepository should be typed to the domain class and an ID type
public interface BookingRepository extends JpaRepository<Booking, Long> {
    Booking findByBookingCarName(String bookingCarName);
    List<Booking> findAllByBookingRacetrackNameContainsIgnoreCase(String racetrackName);
}