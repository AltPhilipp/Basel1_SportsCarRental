package ch.fhnw.sportscarrental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import ch.fhnw.sportscarrental.business.service.CarService;
import ch.fhnw.sportscarrental.data.domain.Car; 
import io.swagger.v3.oas.annotations.Hidden;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
@RestController
@Hidden // Hide this controller from the Swagger UI
public class SportsCarRentalApplication {

    @Autowired
    private CarService carService;

    public static void main(String[] args) {
        SpringApplication.run(SportsCarRentalApplication.class, args);
    }

    // Use this method to initialize placeholder data without using Postman
    @PostConstruct
    private void initPlaceholderData() throws Exception {
        Car car = new Car();
        car.setCarName("Ferrari 488");
        car.setCarDetails("V8 engine, 661 hp, 0-60 mph in 3.0 seconds");
        carService.addCar(car);

        car = new Car();
        car.setCarName("Lamborghini Huracan");
        car.setCarDetails("V10 engine, 630 hp, 0-60 mph in 2.9 seconds");
        carService.addCar(car);
    }

}
