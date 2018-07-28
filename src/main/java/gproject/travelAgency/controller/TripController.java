package gproject.travelAgency.controller;

import gproject.travelAgency.model.ContinentEntity;
import gproject.travelAgency.repository.ContinentJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class TripController {

    @Autowired
    public ContinentJpaRepository continentJpaRepository;


    @GetMapping("/getContinents")
    public ContinentEntity getContinentByName(@PathVariable String Name) {
        return continentJpaRepository.findByName(Name).orElseGet(() -> new ContinentEntity());
    }

    @PostMapping("/addContinent")
    public ContinentEntity addContinent(@Valid @RequestBody ContinentEntity continent) {
        return continentJpaRepository.save(continent);
    }

    @PutMapping("/continent/{Id}")
    public ContinentEntity updateContinent(@PathVariable Long Id,
                                           @Valid @RequestBody ContinentEntity continentRequest) {
        return continentJpaRepository.findById(Id)
                .map(name -> {
                    name.setName(continentRequest.getName());
                    return continentJpaRepository.save(name);
                }).orElseThrow(() -> new NoSuchElementException("Question not found with id " + Id));
    }
}
