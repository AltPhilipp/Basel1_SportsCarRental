package ch.fhnw.sportscarrental.data.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "insurance_package")
public class InsurancePackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long insuranceID;
    private String insuranceName;
    private String insuranceDescription;
    private Double insurancePrice;
    private Double insuranceDeductible;

    // Getters and setters
    public Long getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(Long insuranceID) {
        this.insuranceID = insuranceID;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getInsuranceDescription() {
        return insuranceDescription;
    }

    public void setInsuranceDescription(String insuranceDescription) {
        this.insuranceDescription = insuranceDescription;
    }

    public Double getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(Double insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public Double getInsuranceDeductible() {
        return insuranceDeductible;
    }

    public void setInsuranceDeductible(Double insuranceDeductible) {
        this.insuranceDeductible = insuranceDeductible;
    }
}