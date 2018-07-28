package gproject.travelAgency.repository;
import gproject.travelAgency.model.TripEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TripRepository extends JpaRepository<TripEntity, Long> {
    List<TripEntity> findByIdAndCityTo(Long Id, String cityTo);
}
