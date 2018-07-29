package gproject.travelAgency.service;

import gproject.travelAgency.model.ContinentEntity;
import gproject.travelAgency.repository.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContinentServiceImpl extends CrudServiceBaseImpl<ContinentEntity> implements ContinentService {

    private ContinentRepository continentJpaRepository;

    @Autowired
    public ContinentServiceImpl(ContinentRepository repository) {
        super(repository);
        this.continentJpaRepository = repository;
    }


}
