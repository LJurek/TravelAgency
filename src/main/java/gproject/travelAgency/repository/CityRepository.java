package gproject.travelAgency.repository;

import gproject.travelAgency.model.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Long> {
    Optional<CityEntity> findById(Long Id);

    Optional<CityEntity> findByName(String Name);
}
