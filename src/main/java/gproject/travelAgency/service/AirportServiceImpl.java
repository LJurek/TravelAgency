package gproject.travelAgency.service;

import gproject.travelAgency.model.AirportEntity;
import gproject.travelAgency.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AirportServiceImpl extends CrudServiceBaseImpl<AirportEntity> implements AirportService{

    private AirportRepository airportJpaRepository;

    @Autowired
    public AirportServiceImpl(AirportRepository repository) {
        super(repository);
        this.airportJpaRepository = repository;
    }
}
