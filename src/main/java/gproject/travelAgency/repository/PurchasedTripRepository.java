package gproject.travelAgency.repository;

import gproject.travelAgency.model.PurchasedTripEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PurchasedTripRepository extends JpaRepository<PurchasedTripEntity, Long> {
    Optional<PurchasedTripEntity> findById(Long Id);

    Optional<PurchasedTripEntity> findByName(String Name);
}
