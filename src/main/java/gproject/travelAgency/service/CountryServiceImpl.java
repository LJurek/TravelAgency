package gproject.travelAgency.service;

import gproject.travelAgency.model.CountryEntity;
import gproject.travelAgency.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl extends CrudServiceBaseImpl<CountryEntity> implements CountryService {

    private CountryRepository countryJpaRepository;

    @Autowired
    public CountryServiceImpl(CountryRepository repository) {
        super(repository);
        this.countryJpaRepository = repository;
    }
}