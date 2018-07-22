package gproject.TravelAgency.repository;

import gproject.TravelAgency.model.ContinentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelAgencyJpaRepository extends JpaRepository<ContinentEntity,Long> {

}
