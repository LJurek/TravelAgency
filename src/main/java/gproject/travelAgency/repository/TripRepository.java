package gproject.travelAgency.repository;

import gproject.travelAgency.model.TripEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TripRepository extends JpaRepository<TripEntity, Long> {
    Optional<TripEntity> findById(Long Id);

    Optional<TripEntity> findByName(String Name);
}
