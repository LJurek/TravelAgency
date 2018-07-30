package gproject.travelAgency.controller;

import gproject.travelAgency.model.CountryEntity;
import gproject.travelAgency.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CountryController {
    @Qualifier("countryServiceImpl")
    @Autowired
    private CrudService countryService;

    @GetMapping("/country")
    public Iterable getCountryName() {
        return countryService.findAll();
    }

    @PostMapping("/addCountry")
    public ResponseEntity<CountryEntity> addCountry(@RequestBody CountryEntity countryEntity) {
        countryService.add(countryEntity);
        return ResponseEntity.ok(countryEntity);
    }

    @GetMapping("/getCountry/{id}")
    public ResponseEntity<CountryEntity> getCountry(@PathVariable int id) {
        CountryEntity countryEntity = (CountryEntity) countryService.findOne(id);
        return ResponseEntity.ok(countryEntity);
    }

    @PutMapping(value = "/updateCountry/")
    public ResponseEntity<CountryEntity> update(@RequestBody CountryEntity countryEntity) {
        countryService.modify(countryEntity);
        return ResponseEntity.ok(countryEntity);
    }

    @DeleteMapping(value = "/deleteCountry/{id}")
    public void delete(@PathVariable Long id) {

        countryService.delete(id);
    }

    @GetMapping(value = "/countCountry")
    public Long count() {
        return countryService.count();
    }
}
