package gproject.travelAgency.repository;

import gproject.travelAgency.model.AirportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AirportRepository extends JpaRepository<AirportEntity, Long> {
    Optional<AirportEntity> findById(Long Id);
}