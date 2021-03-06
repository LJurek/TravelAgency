package gproject.travelAgency.service;
import gproject.travelAgency.model.TripEntity;
import gproject.travelAgency.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TripServiceImpl extends CrudServiceBaseImpl<TripEntity> implements TripService {

    private TripRepository tripJpaRepository;

    @Autowired
    public TripServiceImpl(TripRepository repository) {
        super(repository);
        this.tripJpaRepository = repository;
    }
    @Override
    public List<TripEntity> searchByCity(String city) {
        List<TripEntity> list = tripJpaRepository.findAll()
                .stream()
                .filter(trip -> trip.getCityTo().equals(city))
                .collect(Collectors.toList());
        return list;
    }
}
