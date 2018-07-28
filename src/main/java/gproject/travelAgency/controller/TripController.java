package gproject.travelAgency.controller;

import gproject.travelAgency.model.ContinentEntity;
import gproject.travelAgency.repository.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.NoSuchElementException;

@RestController
public class TripController {

    @Autowired
    public ContinentRepository continentRepository;


    @GetMapping("/getContinents")
    public ContinentEntity getContinentByName(@PathVariable String Name) {
        return continentRepository.findByName(Name).orElseGet(() -> new ContinentEntity());
    }

    @PostMapping("/addContinent")
    public ContinentEntity addContinent(@Valid @RequestBody ContinentEntity continent) {
        return continentRepository.save(continent);
    }

    @PutMapping("/continent/{Id}")
    public ContinentEntity updateContinent(@PathVariable Long Id,
                                           @Valid @RequestBody ContinentEntity continentRequest) {
        return continentRepository.findById(Id)
                .map(name -> {
                    name.setName(continentRequest.getName());
                    return continentRepository.save(name);
                }).orElseThrow(() -> new NoSuchElementException("Question not found with id " + Id));
    }

}
