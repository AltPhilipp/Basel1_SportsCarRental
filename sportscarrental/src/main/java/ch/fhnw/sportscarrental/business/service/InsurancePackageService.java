package ch.fhnw.sportscarrental.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.fhnw.sportscarrental.data.domain.InsurancePackage;
import ch.fhnw.sportscarrental.data.repository.InsurancePackageRepository;

import java.util.List;

@Service
public class InsurancePackageService {

    @Autowired
    private InsurancePackageRepository insurancePackageRepository;

    public List<InsurancePackage> getAllInsurancePackages() {
        return insurancePackageRepository.findAll();
    }

    public InsurancePackage getInsurancePackageById(Long id) {
        return insurancePackageRepository.findById(id).orElse(null);
    }

    public InsurancePackage saveInsurancePackage(InsurancePackage insurancePackage) {
        return insurancePackageRepository.save(insurancePackage);
    }

    public void deleteInsurancePackage(Long id) {
        insurancePackageRepository.deleteById(id);
    }

    public void addInsurancePackage(InsurancePackage insurancePackage) {
        insurancePackageRepository.save(insurancePackage);
    }
}