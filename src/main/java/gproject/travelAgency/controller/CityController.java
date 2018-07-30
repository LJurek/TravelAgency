package gproject.travelAgency.controller;

import gproject.travelAgency.model.CityEntity;
import gproject.travelAgency.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CityController {
    @Qualifier("cityServiceImpl")
    @Autowired
    private CrudService cityService;

    @GetMapping("/city")
    public Iterable getCityName() {
        return cityService.findAll();
    }

    @PostMapping("/addCity")
    public ResponseEntity<CityEntity> addCity(@RequestBody CityEntity cityEntity) {
        cityService.add(cityEntity);
        return ResponseEntity.ok(cityEntity);
    }

    @GetMapping("/getCity/{id}")
    public ResponseEntity<CityEntity> getCity(@PathVariable int id) {
        CityEntity airportEntity = (CityEntity) cityService.findOne(id);
        return ResponseEntity.ok(airportEntity);
    }

    @PutMapping(value = "/updateCity/")
    public ResponseEntity<CityEntity> update(@RequestBody CityEntity cityEntity) {
        cityService.modify(cityEntity);
        return ResponseEntity.ok(cityEntity);
    }

    @DeleteMapping(value = "/deleteCity/{id}")
    public void delete(@PathVariable Long id) {

        cityService.delete(id);
    }

    @GetMapping(value = "/countCity")
    public Long count() {
        return cityService.count();
    }
}
