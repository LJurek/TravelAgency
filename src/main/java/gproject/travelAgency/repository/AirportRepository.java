package gproject.travelAgency.repository;

import gproject.travelAgency.model.AirportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<AirportEntity, Long> {
}