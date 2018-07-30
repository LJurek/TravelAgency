package gproject.travelAgency.controller;

import gproject.travelAgency.model.ContinentEntity;
import gproject.travelAgency.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ContinentController {
    @Qualifier("continentServiceImpl")
    @Autowired
    private CrudService continentService;

    @GetMapping("/continent")
    public Iterable getContinentName() {
        return continentService.findAll();
    }

    @PostMapping("/addContinent")
    public ResponseEntity<ContinentEntity> addContinent(@RequestBody ContinentEntity continentEntity){
        continentService.add(continentEntity);
        return ResponseEntity.ok(continentEntity);
    }

    @GetMapping("/getContinent/{id}")
    public ResponseEntity<ContinentEntity> getContinent(@PathVariable int id){
        ContinentEntity continentEntity =(ContinentEntity) continentService.findOne(id);
        return ResponseEntity.ok(continentEntity);
    }
    @PutMapping(value = "/updateContinent/")
    public ResponseEntity<ContinentEntity> update(@RequestBody ContinentEntity continentEntity) {
        continentService.modify(continentEntity);
        return ResponseEntity.ok(continentEntity);
    }
    @DeleteMapping(value = "/deleteContinent/{id}")
    public void delete(@PathVariable Long id) {

        continentService.delete(id);
    }

    @GetMapping(value = "/countContinent")
    public Long count() {
        return continentService.count();
    }

}
