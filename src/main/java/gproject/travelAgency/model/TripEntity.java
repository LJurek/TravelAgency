package gproject.travelAgency.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
public class TripEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany
    private List<PurchasedTripEntity> purchasedTrip;
    private String airportFrom;
    private String airportTo;
    private String hotelTo;
    private String cityTo;
    private String departureDate;
    private String returnDate;
    private Integer countOfDays;
    private String alimentationType;
    private BigDecimal priceForAdult;
    private BigDecimal priceForChild;
    private BigDecimal promotion;
    private Long countOfPerson;
    private String description;

    public TripEntity(String airportFrom, String airportTo, String hotelTo, String cityTo, String departureDate, String returnDate, Integer countOfDays, String alimentationType, BigDecimal priceForAdult, BigDecimal priceForChild, BigDecimal promotion, Long countOfPerson, String description) {
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
        this.hotelTo = hotelTo;
        this.cityTo = cityTo;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.countOfDays = countOfDays;
        this.alimentationType = alimentationType;
        this.priceForAdult = priceForAdult;
        this.priceForChild = priceForChild;
        this.promotion = promotion;
        this.countOfPerson = countOfPerson;
        this.description = description;
    }

    public TripEntity() {
    }
}