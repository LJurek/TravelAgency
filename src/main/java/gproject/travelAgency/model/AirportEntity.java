package gproject.travelAgency.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="Airport")
@Data
public class AirportEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "AirportName")
    private String name;

    @Column(name = "CityId")
    private Long cityId;

    public AirportEntity(String name, Long cityId) {
        this.name = name;
        this.cityId = cityId;
    }

    public AirportEntity() {
    }
}
