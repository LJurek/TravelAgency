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

    @Column(name = "Departure_Airport")
    private String airportFrom;

    @Column(name = "Arrival_Airport")
    private String airportTo;

    @Column(name = "Arrival_Hotel")
    private String hotelTo;

    @Column(name = "Arrival_City")
    private String cityTo;

    @Column(name = "Departure_Date")
    private String departureDate;

    @Column(name = "Return_Date")
    private String returnDate;

    @Column(name = "Count_of_days")
    private Integer countOfDays;

    @Column(name = "Alimentation_type")
    private String alimentationType;

    @Column(name = "Price_for_adult")
    private BigDecimal priceForAdult;

    @Column(name = "Price_for_child")
    private BigDecimal priceForChild;

    @Column(name = "Promotion")
    private BigDecimal promotion;

    @Column(name = "Count_of_person")
    private Long countOfPerson;

    @Column(name = "Description")
    private String description;
}