package ch.fhnw.sportscarrental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import ch.fhnw.sportscarrental.business.service.BookingService;
import ch.fhnw.sportscarrental.business.service.CarService;
import ch.fhnw.sportscarrental.business.service.InsurancePackageService;
import ch.fhnw.sportscarrental.business.service.RacetrackService;
import ch.fhnw.sportscarrental.data.domain.Booking;
import ch.fhnw.sportscarrental.data.domain.Car;
import ch.fhnw.sportscarrental.data.domain.InsurancePackage;
import ch.fhnw.sportscarrental.data.domain.Racetrack;
import io.swagger.v3.oas.annotations.Hidden;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
@RestController
@Hidden // Hide this controller from the Swagger UI!
public class SportsCarRentalApplication {

    @Autowired
    private CarService carService;
    
    @Autowired
    private RacetrackService racetrackService;

    @Autowired
    private InsurancePackageService insurancePackageService;

    @Autowired
    private BookingService bookingService;


    public static void main(String[] args) {
        SpringApplication.run(SportsCarRentalApplication.class, args);
    }

    @PostConstruct
    private void initPlaceholderData() throws Exception {
        Car car = new Car();
car.setCarName("Ferrari 488");
car.setCarDetails("The Ferrari 488 features a 3.9-liter twin-turbocharged V8 engine producing 661 horsepower, allowing it to accelerate from 0 to 60 mph in just 3.0 seconds. This supercar combines exceptional performance with Italian luxury and cutting-edge technology, making it a standout in its class.");
car.setLicensePlate("NR 12345");
car.setCarRate(500.0);
car.setCarImageURL("https://cdn.ferrari.com/cms/network/media/img/resize/5d371735c3f9ec0af647572d-ferrari_488pista_intro_socialshare?width=1080");
car.setAvailable(true);
carService.addCar(car);

car = new Car();
car.setCarName("Lamborghini Huracán");
car.setCarDetails("The Lamborghini Huracán is powered by a naturally aspirated 5.2-liter V10 engine with 631 horsepower, enabling it to go from 0 to 60 mph in an astonishing 2.9 seconds. This Italian masterpiece is known for its aggressive design, advanced aerodynamics, and thrilling driving dynamics.");
car.setLicensePlate("NR 54321");
car.setCarRate(600.0);
car.setCarImageURL("https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/2023_Lamborghini_Huracan_Tecnica_1.jpg/420px-2023_Lamborghini_Huracan_Tecnica_1.jpg");
car.setAvailable(true);
carService.addCar(car);

car = new Car();
car.setCarName("Porsche 911 GT3");
car.setCarDetails("The Porsche 911 GT3 boasts a 4.0-liter naturally aspirated flat-six engine, delivering 502 horsepower. It can sprint from 0 to 60 mph in 3.2 seconds. Renowned for its precision handling and track-oriented performance, this model continues the legacy of the iconic 911 series with modern enhancements.");
car.setLicensePlate("NR 67890");
car.setCarRate(400.0);
car.setCarImageURL("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Porsche_996_GT3_-_Flickr_-_Alexandre_Pr%C3%A9vot_%283%29.jpg/2880px-Porsche_996_GT3_-_Flickr_-_Alexandre_Pr%C3%A9vot_%283%29.jpg");
car.setAvailable(true);
carService.addCar(car);

car = new Car();   
car.setCarName("McLaren 720S");
car.setCarDetails("The McLaren 720S is equipped with a 4.0-liter twin-turbocharged V8 engine that produces an impressive 710 horsepower. This supercar achieves 0 to 60 mph in just 2.8 seconds, blending breathtaking speed with sophisticated design and cutting-edge aerodynamics.");
car.setLicensePlate("NR 13579");
car.setCarRate(700.0);
car.setCarImageURL("https://cdn.motor1.com/images/mgl/eLjbP/s1/2020-mclaren-720s-spider.webp");
car.setAvailable(true);
carService.addCar(car);

car = new Car();
car.setCarName("Audi R8");
car.setCarDetails("The Audi R8 is powered by a 5.2-liter V10 engine that delivers 562 horsepower, enabling it to accelerate from 0 to 60 mph in 3.4 seconds. This supercar combines Audi’s Quattro all-wheel-drive system with a luxurious interior and a striking exterior design.");
car.setLicensePlate("NR 24680");
car.setCarRate(450.0);
car.setCarImageURL("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/R8_Coupe_V10_performance-1.jpg/2560px-R8_Coupe_V10_performance-1.jpg");
car.setAvailable(true);
carService.addCar(car);

car = new Car();
car.setCarName("Mercedes-AMG GT");
car.setCarDetails("The Mercedes-AMG GT features a 4.0-liter twin-turbocharged V8 engine with 523 horsepower, achieving 0 to 60 mph in 3.7 seconds. This grand tourer combines dynamic performance with the elegance and luxury expected from Mercedes-Benz, offering a thrilling driving experience.");
car.setLicensePlate("NR 97531");
car.setCarRate(350.0);
car.setCarImageURL("https://hips.hearstapps.com/hmg-prod/images/2024-mercedes-amg-gt-131-654bc96f8591b.jpg?crop=0.506xw:0.380xh;0.255xw,0.284xh&resize=640:*");
car.setAvailable(true);
carService.addCar(car);

car = new Car();
car.setCarName("BMW M8");
car.setCarDetails("The BMW M8 is equipped with a 4.4-liter twin-turbocharged V8 engine that produces 617 horsepower, allowing it to accelerate from 0 to 60 mph in 3.0 seconds. This high-performance coupe combines luxury, advanced technology, and aggressive styling for an exhilarating driving experience.");
car.setLicensePlate("NR 86420");
car.setCarRate(500.0);
car.setCarImageURL("https://images.pistonheads.com/nimg/42204/BMW_M8.jpg");
car.setAvailable(true);
carService.addCar(car);


        
        Racetrack racetrack = new Racetrack();
        racetrack.setTrackName("Nürburgring - Grand Prix Track");
        racetrack.setTrackDescription("The Nürburgring is a motorsport complex around the village of Nürburg, Rhineland-Palatinate, Germany. This is the Grand Prix track.");
        racetrack.setTrackLocation("Nürburg, Germany");
        racetrack.setTrackLength(5.2);
        racetrackService.addRacetrack(racetrack);

        racetrack = new Racetrack();
        racetrack.setTrackName("Nürburgring - Nordschleife");
        racetrack.setTrackDescription("The Nürburgring is a motorsport complex around the village of Nürburg, Rhineland-Palatinate, Germany. This is the Nordschleife track.");
        racetrack.setTrackLocation("Nürburg, Germany");
        racetrack.setTrackLength(20.8);
        racetrackService.addRacetrack(racetrack);

        InsurancePackage insurancePackage = new InsurancePackage();
        insurancePackage.setInsuranceName("Basic");
        insurancePackage.setInsuranceDescription("Our Basic Sports Car Rental Insurance offers essential coverage for your high-performance vehicle rental. This policy provides liability protection, covering damage to other vehicles and property, as well as limited personal injury protection.");
        insurancePackage.setInsurancePrice(100.0);
        insurancePackage.setInsuranceDeductible(1000.0);
        insurancePackageService.addInsurancePackage(insurancePackage);

        insurancePackage = new InsurancePackage();
        insurancePackage.setInsuranceName("Advanced");
        insurancePackage.setInsuranceDescription("Upgrade to our Advanced Sports Car Rental Insurance for comprehensive protection and added peace of mind. This policy includes all the benefits of our Basic plan, plus additional coverage for theft and vandalism.");
        insurancePackage.setInsurancePrice(500.0);
        insurancePackage.setInsuranceDeductible(300.0);
        insurancePackageService.addInsurancePackage(insurancePackage);

        insurancePackage = new InsurancePackage();
        insurancePackage.setInsuranceName("Premium");
        insurancePackage.setInsuranceDescription("For the ultimate in coverage and protection, choose our Pro Racer Sports Car Rental Insurance. This premium policy is designed for the avid car enthusiast and professional drivers who demand top-tier protection.");
        insurancePackage.setInsurancePrice(800.0);
        insurancePackage.setInsuranceDeductible(0.0);
        insurancePackageService.addInsurancePackage(insurancePackage);

        Booking booking = new Booking();
        booking.setBookingDate("2021-12-24");
        booking.setBookingTime("10:00");
        booking.setBookingCarName("Ferrari 488");
        booking.setBookingRacetrackName("Nürburgring - Grand Prix Track");
        booking.setBookingInsurancePackageName("Basic");
        booking.setBookingFirstName("John");
        booking.setBookingLastName("Doe");
        booking.setBookingDriverLicenseID("1234567890");
        bookingService.addBooking(booking);
    }
}
