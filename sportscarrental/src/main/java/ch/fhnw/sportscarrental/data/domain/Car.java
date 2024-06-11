package ch.fhnw.sportscarrental.data.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String carName;
    private String carDetails;
    private String licensePlate;
    private double  carRate;
    private String carImageURL;
    private boolean available;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCarName() {
        return carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }
    public String getCarDetails() {
        return carDetails;
    }
    public void setCarDetails(String carDetails) {
        this.carDetails = carDetails;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public double getCarRate() {
        return carRate;
    }
    public void setCarRate(double carRate) {
        this.carRate = carRate;
    }
    public String getCarImageURL() {
        return carImageURL;
    }
    public void setCarImageURL(String carImageURL) {
        this.carImageURL = carImageURL;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
