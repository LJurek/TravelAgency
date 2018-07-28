package gproject.travelAgency.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "PurchasedTrip")
@Data
public class PurchasedTrip implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "TripId")
    private Long tripId;

    @Column(name = "Amount")
    private BigDecimal amount;

    @Column(name = "Owner")
    private String owner;

    public PurchasedTrip(Long tripId, BigDecimal amount, String owner) {
        this.tripId = tripId;
        this.amount = amount;
        this.owner = owner;
    }

    public PurchasedTrip() {
    }
}
