package ch.fhnw.sportscarrental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import ch.fhnw.sportscarrental.business.service.CarService;
import ch.fhnw.sportscarrental.business.service.InsurancePackageService;
import ch.fhnw.sportscarrental.business.service.RacetrackService;
import ch.fhnw.sportscarrental.data.domain.Car;
import ch.fhnw.sportscarrental.data.domain.InsurancePackage;
import ch.fhnw.sportscarrental.data.domain.Racetrack;
import io.swagger.v3.oas.annotations.Hidden;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
@RestController
@Hidden // Hide this controller from the Swagger UI
public class SportsCarRentalApplication {

    @Autowired
    private CarService carService;
    
    @Autowired
    private RacetrackService racetrackService;

    @Autowired
    private InsurancePackageService insurancePackageService;

    public static void main(String[] args) {
        SpringApplication.run(SportsCarRentalApplication.class, args);
    }

    // Use this method to initialize placeholder data without using Postman
    @PostConstruct
    private void initPlaceholderData() throws Exception {
        Car car = new Car();
        car.setCarName("Ferrari 488");
        car.setCarDetails("V8 engine, 661 hp, 0-60 mph in 3.0 seconds");
        car.setCarImageURL("https://cdn.ferrari.com/cms/network/media/img/resize/5d371735c3f9ec0af647572d-ferrari_488pista_intro_socialshare?width=1080");
        carService.addCar(car);

        car = new Car();
        car.setCarName("Lamborghini Huracan");
        car.setCarDetails("V10 engine, 630 hp, 0-60 mph in 2.9 seconds");
        carService.addCar(car);

        Racetrack racetrack = new Racetrack();
        racetrack.setTrackName("Nürburgring");
        racetrack.setTrackDescription("The Nürburgring is a motorsport complex around the village of Nürburg, Rhineland-Palatinate, Germany. It features a Grand Prix track.");
        racetrack.setTrackLocation("Nürburg, Germany");
        racetrack.setTrackLength(20.8);
        racetrackService.addRacetrack(racetrack); // Use instance to call the method

        InsurancePackage insurancePackage = new InsurancePackage();
        insurancePackage.setInsuranceName("Basic");
        insurancePackage.setInsuranceDescription("Basic insurance package");
        insurancePackage.setInsurancePrice(100.0);
        insurancePackage.setInsuranceDeductible(500.0);
        insurancePackageService.addInsurancePackage(insurancePackage);
    }
}
