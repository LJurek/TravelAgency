package gproject.travelAgency.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

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

    @ManyToOne (fetch=FetchType.LAZY)
    @JoinColumn(name = "countryEntity_id")
    private CountryEntity countryEntity;

    public CityEntity(String name, Long countryId) {
        this.name = name;
        this.countryId = countryId;
    }

    public CityEntity() {
    }
}
