package ch.fhnw.sportscarrental.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.fhnw.sportscarrental.data.domain.Car;

@Repository
// JpaRepository should be typed to the domain class and an ID type
public interface CarRepository extends JpaRepository<Car, Long> {
    Car findByCarName(String carName);
    List<Car> findAllByCarDetailsContainsIgnoreCase(String detail);
}
