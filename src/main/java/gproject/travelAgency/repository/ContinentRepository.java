package gproject.travelAgency.repository;

import gproject.travelAgency.model.ContinentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ContinentRepository extends JpaRepository<ContinentEntity, Long> {
    Optional<ContinentEntity> findById(Long Id);

    Optional<ContinentEntity> findByName(String Name);
}
