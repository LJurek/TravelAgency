package gproject.travelAgency.service;

import gproject.travelAgency.model.TripEntity;

import java.util.List;

public interface TripService extends CrudService<TripEntity, Long> {

    List<TripEntity> searchByCity(String city);
}
