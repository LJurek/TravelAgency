package gproject.travelAgency.controller;

import gproject.travelAgency.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirportController {
    @Qualifier("airportServiceImpl")
    @Autowired
    private CrudService airportService;

    @GetMapping("/airport")
    public Iterable getAirportName() {
        return airportService.findAll();
    }
//TODO next metods
}
