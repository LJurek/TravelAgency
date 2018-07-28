package gproject.travelAgency.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "Trip")
@Data
public class TripEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "DepartureAirport")
    private String airportFrom;

    @Column(name = "ArrivalAirport")
    private String airportTo;

    @Column(name = "ArrivalHotel")
    private String hotelTo;

    @Column(name = "ArrivalCity")
    private String cityTo;

    @Column(name = "DepartureDate")
    private String departureDate;

    @Column(name = "ReturnDate")
    private String returnDate;

    @Column(name = "CountOfDays")
    private Integer countOfDays;

    @Column(name = "AlimentationType")
    private String alimentationType;

    @Column(name = "PriceForAdult")
    private BigDecimal priceForAdult;

    @Column(name = "PriceForChild")
    private BigDecimal priceForChild;

    @Column(name = "Promotion")
    private BigDecimal promotion;

    @Column(name = "Count_of_person")
    private Long countOfPerson;

    @Column(name = "Description")
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