package gproject.travelAgency.controller;

import gproject.travelAgency.model.TripEntity;
import gproject.travelAgency.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PurchasedTripController {
    @Qualifier("purchasedTripServiceImpl")
    @Autowired
    private CrudService purchasedTripService;

    @GetMapping("/purchasedTrip")
    public Iterable getOwnerName() {
        return purchasedTripService.findAll();
    }

    @PostMapping("/addPurchasedTrip")
    public ResponseEntity<TripEntity> addTrip(@RequestBody TripEntity tripEntity) {
        purchasedTripService.add(tripEntity);
        return ResponseEntity.ok(tripEntity);
    }

    @GetMapping("/getPurchasedTrip/{id}")
    public ResponseEntity<TripEntity> getTrip(@PathVariable int id) {
        TripEntity tripEntity = (TripEntity) purchasedTripService.findOne(id);
        return ResponseEntity.ok(tripEntity);
    }

    @PutMapping(value = "/updatePurchasedTrip/")
    public ResponseEntity<TripEntity> update(@RequestBody TripEntity tripEntity) {
        purchasedTripService.modify(tripEntity);
        return ResponseEntity.ok(tripEntity);
    }

    @DeleteMapping(value = "/deletePurchasedTrip/{id}")
    public void delete(@PathVariable Long id) {

        purchasedTripService.delete(id);
    }

    @GetMapping(value = "/countPurchasedTrip")
    public Long count() {
        return purchasedTripService.count();
    }
}
