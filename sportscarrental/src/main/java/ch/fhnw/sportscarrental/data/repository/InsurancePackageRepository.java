package ch.fhnw.sportscarrental.data.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ch.fhnw.sportscarrental.data.domain.InsurancePackage; // Update the import statement

import java.util.List;

@Repository
public interface InsurancePackageRepository extends JpaRepository<InsurancePackage, Long> {
    InsurancePackage findByInsuranceName(String insuranceName);
    List<InsurancePackage> findAllByInsuranceDescriptionContainsIgnoreCase(String description);
}