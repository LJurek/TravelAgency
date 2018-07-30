package gproject.travelAgency.controller;

import gproject.travelAgency.model.HotelEntity;
import gproject.travelAgency.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HotelController {
    @Qualifier("hotelServiceImpl")
    @Autowired
    private CrudService hotelService;

    @GetMapping("/holel")
    public Iterable getHolelName() {
        return hotelService.findAll();
    }

    @PostMapping("/addHotel")
    public ResponseEntity<HotelEntity> addHotel(@RequestBody HotelEntity hotelEntity) {
        hotelService.add(hotelEntity);
        return ResponseEntity.ok(hotelEntity);
    }

    @GetMapping("/getHotel/{id}")
    public ResponseEntity<HotelEntity> getHotel(@PathVariable int id) {
        HotelEntity hotelEntity = (HotelEntity) hotelService.findOne(id);
        return ResponseEntity.ok(hotelEntity);
    }

    @PutMapping(value = "/updateHotel/")
    public ResponseEntity<HotelEntity> update(@RequestBody HotelEntity hotelEntity) {
        hotelService.modify(hotelEntity);
        return ResponseEntity.ok(hotelEntity);
    }

    @DeleteMapping(value = "/deleteHotel/{id}")
    public void delete(@PathVariable Long id) {

        hotelService.delete(id);
    }

    @GetMapping(value = "/countHotel")
    public Long count() {
        return hotelService.count();
    }
}
