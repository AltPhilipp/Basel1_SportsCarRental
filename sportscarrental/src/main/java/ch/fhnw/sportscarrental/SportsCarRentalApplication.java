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
@Hidden // Hide this controller from the Swagger UI
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
        car.setCarDetails("V8 engine, 661 hp, 0-60 mph in 3.0 seconds");
        car.setLicensePlate("AG 12345");
        car.setCarRate(500.0);
        car.setCarImageURL("https://cdn.ferrari.com/cms/network/media/img/resize/5d371735c3f9ec0af647572d-ferrari_488pista_intro_socialshare?width=1080");
        car.setAvailable(true);
        carService.addCar(car);

        car = new Car();
        car.setCarName("Lamborghini Huracán");
        car.setCarDetails("V10 engine, 631 hp, 0-60 mph in 2.9 seconds");
        car.setLicensePlate("ZH 54321");
        car.setCarRate(600.0);
        car.setCarImageURL("https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/2023_Lamborghini_Huracan_Tecnica_1.jpg/420px-2023_Lamborghini_Huracan_Tecnica_1.jpg");
        car.setAvailable(true);
        carService.addCar(car);

        car = new Car();
        car.setCarName("Porsche 911 GT3");
        car.setCarDetails("Flat-six engine, 502 hp, 0-60 mph in 3.2 seconds");
        car.setLicensePlate("BE 67890");
        car.setCarRate(400.0);
        car.setCarImageURL("https://cdn.prod.website-files.com/646218c67da47160c64a84d5/64faef04f0101dc9ac9e3fbc_94.png");
        car.setAvailable(true);
        carService.addCar(car);

        car = new Car();   
        car.setCarName("McLaren 720S");
        car.setCarDetails("V8 engine, 710 hp, 0-60 mph in 2.8 seconds");
        car.setLicensePlate("LU 13579");
        car.setCarRate(700.0);
        car.setCarImageURL("https://www.mclaren.com/globalassets/mclaren2020/models/720s/720s-coupe/720s-coupe-2020/720s-coupe-2020-1.jpg");
        car.setAvailable(true);
        carService.addCar(car);

        car = new Car();
        car.setCarName("Audi R8");
        car.setCarDetails("V10 engine, 562 hp, 0-60 mph in 3.4 seconds");
        car.setLicensePlate("SG 24680");
        car.setCarRate(450.0);
        car.setCarImageURL("https://www.audi.com/content/dam/gbp2/experience-audi/models-and-technology/production-models/r8/my2020/1920x1080-gal-prop-tx/1920x1080_desktop_R8_Coupe_V10_performance_quattro_1920x1080.jpg");
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
        racetrackService.addRacetrack(racetrack); // Use instance to call the method

        InsurancePackage insurancePackage = new InsurancePackage();
        insurancePackage.setInsuranceName("Basic");
        insurancePackage.setInsuranceDescription("Our Basic Sports Car Rental Insurance offers essential coverage for your high-performance vehicle rental. This policy provides liability protection, covering damage to other vehicles and property, as well as limited personal injury protection. It also includes collision damage waiver (CDW) to protect against minor damages to the rented sports car. Ideal for those looking for cost-effective peace of mind, this plan ensures you're covered for the essentials while you enjoy your driving experience.");
        insurancePackage.setInsurancePrice(100.0);
        insurancePackage.setInsuranceDeductible(1000.0);
        insurancePackageService.addInsurancePackage(insurancePackage);

        insurancePackage = new InsurancePackage();
        insurancePackage.setInsuranceName("Advanced");
        insurancePackage.setInsuranceDescription("Upgrade to our Advanced Sports Car Rental Insurance for comprehensive protection and added peace of mind. This policy includes all the benefits of our Basic plan, plus additional coverage for theft and vandalism. It also offers extended personal injury protection and higher liability limits. Furthermore, it covers roadside assistance services, including towing and tire replacement, ensuring you're never stranded. Perfect for those seeking a balanced combination of enhanced safety and convenience during their sports car rental experience.");
        insurancePackage.setInsurancePrice(500.0);
        insurancePackage.setInsuranceDeductible(300.0);
        insurancePackageService.addInsurancePackage(insurancePackage);

        insurancePackage = new InsurancePackage();
        insurancePackage.setInsuranceName("Premium");
        insurancePackage.setInsuranceDescription("For the ultimate in coverage and protection, choose our Pro Racer Sports Car Rental Insurance. This premium policy is designed for the avid car enthusiast and professional drivers who demand top-tier protection. In addition to the comprehensive coverage of our Advanced plan, it includes track day insurance for sanctioned events, coverage for aftermarket modifications, and higher liability limits. It also offers personal accident insurance, covering medical expenses and loss of income due to injury. With 24/7 VIP roadside assistance and concierge services, our Pro Racer plan ensures you have everything you need for an exhilarating and worry-free driving experience.");
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
