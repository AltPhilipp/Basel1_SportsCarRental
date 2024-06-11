package ch.fhnw.sportscarrental.controller;

import ch.fhnw.sportscarrental.business.service.InsurancePackageService;
import ch.fhnw.sportscarrental.data.domain.InsurancePackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/insurance-packages")
public class InsurancePackageController {

    @Autowired
    private InsurancePackageService insurancePackageService;

    @GetMapping
    public List<InsurancePackage> getAllInsurancePackages() {
        return insurancePackageService.getAllInsurancePackages();
    }

    @GetMapping("/{id}")
    public InsurancePackage getInsurancePackageById(@PathVariable Long id) {
        return insurancePackageService.getInsurancePackageById(id);
    }

    @PostMapping
    public InsurancePackage createInsurancePackage(@RequestBody InsurancePackage insurancePackage) {
        return insurancePackageService.saveInsurancePackage(insurancePackage);
    }

    @PutMapping("/{id}")
    public InsurancePackage updateInsurancePackage(@PathVariable Long id, @RequestBody InsurancePackage insurancePackage) {
        insurancePackage.setInsuranceID(id);
        return insurancePackageService.saveInsurancePackage(insurancePackage);
    }

    @DeleteMapping("/{id}")
    public void deleteInsurancePackage(@PathVariable Long id) {
        insurancePackageService.deleteInsurancePackage(id);
    }
}