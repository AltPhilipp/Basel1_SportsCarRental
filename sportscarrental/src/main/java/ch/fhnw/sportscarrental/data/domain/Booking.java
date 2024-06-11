package ch.fhnw.sportscarrental.data.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingID;
    private String bookingDate;
    private String bookingTime;
    private String bookingCarName;
    private String bookingRacetrackName;
    private String bookingInsurancePackageName;
    private String bookingFirstName;
    private String bookingLastName;
    private String bookingDriverLicenseID;

    // Getters and setters
    public Long getBookingID() {
        return bookingID;
    }

    public void setBookingID(Long bookingID) {
        this.bookingID = bookingID;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public String getBookingCarName() {
        return bookingCarName;
    }

    public void setBookingCarName(String bookingCarName) {
        this.bookingCarName = bookingCarName;
    }

    public String getBookingRacetrackName() {
        return bookingRacetrackName;
    }

    public void setBookingRacetrackName(String bookingRacetrackName) {
        this.bookingRacetrackName = bookingRacetrackName;
    }

    public String getBookingInsurancePackageName() {
        return bookingInsurancePackageName;
    }

    public void setBookingInsurancePackageName(String bookingInsurancePackageName) {
        this.bookingInsurancePackageName = bookingInsurancePackageName;
    }

    public String getBookingFirstName() {
        return bookingFirstName;
    }

    public void setBookingFirstName(String bookingFirstName) {
        this.bookingFirstName = bookingFirstName;
    }

    public String getBookingLastName() {
        return bookingLastName;
    }

    public void setBookingLastName(String bookingLastName) {
        this.bookingLastName = bookingLastName;
    }

    public String getBookingDriverLicenseID() {
        return bookingDriverLicenseID;
    }

    public void setBookingDriverLicenseID(String bookingDriverLicenseID) {
        this.bookingDriverLicenseID = bookingDriverLicenseID;
    }
}