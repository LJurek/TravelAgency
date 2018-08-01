package gproject.travelAgency.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
public class PurchasedTripEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long tripId;
    private BigDecimal amount;
    private String owner;

    @ManyToMany(mappedBy = "purchasedTrip")
    private List<TripEntity> trips;

    public PurchasedTripEntity(Long tripId, BigDecimal amount, String owner) {
        this.tripId = tripId;
        this.amount = amount;
        this.owner = owner;
    }

    public PurchasedTripEntity() {
    }
}
