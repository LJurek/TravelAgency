package gproject.travelAgency.service;

import gproject.travelAgency.model.HotelEntity;
import gproject.travelAgency.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl extends CrudServiceBaseImpl<HotelEntity> implements HotelService {

    private HotelRepository hotelJpaRepository;

    @Autowired
    public HotelServiceImpl(HotelRepository repository) {
        super(repository);
        this.hotelJpaRepository = repository;
    }

}
