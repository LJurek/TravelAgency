package gproject.travelAgency.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class CountryEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long continentId;

    @OneToOne
    private ContinentEntity continentEntity;

    @OneToMany(mappedBy ="countryEntity")
    private Set<CityEntity> cityEntities;

    public CountryEntity(String name, Long continentId) {
        this.name = name;
        this.continentId = continentId;
    }

    public CountryEntity() {
    }
}
