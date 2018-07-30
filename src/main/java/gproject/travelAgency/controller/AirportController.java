package gproject.travelAgency.controller;

import gproject.travelAgency.model.AirportEntity;
import gproject.travelAgency.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AirportController {
    @Qualifier("airportServiceImpl")
    @Autowired
    private CrudService airportService;

    @GetMapping("/airport")
    public Iterable getAirportName() {
        return airportService.findAll();
    }

    @PostMapping("/addAirport")
    public ResponseEntity<AirportEntity> addAirport(@RequestBody AirportEntity airportEntity){
        airportService.add(airportEntity);
        return ResponseEntity.ok(airportEntity);
    }

    @GetMapping("/getAirport/{id}")
    public ResponseEntity<AirportEntity> getAirport(@PathVariable int id){
        AirportEntity airportEntity =(AirportEntity) airportService.findOne(id);
        return ResponseEntity.ok(airportEntity);
    }
    @PutMapping(value = "/updateAirport/")
    public ResponseEntity<AirportEntity> update(@RequestBody AirportEntity airportEntity) {
        airportService.modify(airportEntity);
        return ResponseEntity.ok(airportEntity);
    }
    @DeleteMapping(value = "/deleteAirport/{id}")
    public void delete(@PathVariable Long id) {

        airportService.delete(id);
    }

    @GetMapping(value = "/countAirport")
    public Long count() {
        return airportService.count();
    }
}
