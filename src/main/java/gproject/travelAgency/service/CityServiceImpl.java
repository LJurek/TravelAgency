package gproject.travelAgency.service;

import gproject.travelAgency.model.CityEntity;
import gproject.travelAgency.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl extends CrudServiceBaseImpl<CityEntity> implements CityService {

    private CityRepository cityJpaRepository;

    @Autowired
    public CityServiceImpl(CityRepository repository) {
        super(repository);
        this.cityJpaRepository = repository;
    }





}
