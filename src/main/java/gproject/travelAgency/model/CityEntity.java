package gproject.travelAgency.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class CityEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long countryId;

    @ManyToMany
    private List<TripEntity> tripEntities;

    public CityEntity(String name, Long countryId) {
        this.name = name;
        this.countryId = countryId;
    }

    public CityEntity() {
    }
}
