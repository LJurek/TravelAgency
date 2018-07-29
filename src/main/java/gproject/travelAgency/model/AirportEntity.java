package gproject.travelAgency.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class AirportEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long cityId;

    public AirportEntity(String name, Long cityId) {
        this.name = name;
        this.cityId = cityId;
    }

    public AirportEntity() {
    }
}
