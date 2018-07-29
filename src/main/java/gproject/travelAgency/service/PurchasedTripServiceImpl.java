package gproject.travelAgency.service;

import gproject.travelAgency.model.PurchasedTripEntity;
import gproject.travelAgency.repository.PurchasedTripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchasedTripServiceImpl extends CrudServiceBaseImpl<PurchasedTripEntity> implements PurchasedTripService {

    private PurchasedTripRepository purchasedTripJpaRepository;

    @Autowired
    public PurchasedTripServiceImpl(PurchasedTripRepository repository) {
        super(repository);
        this.purchasedTripJpaRepository = repository;
    }
}
