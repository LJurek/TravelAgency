package gproject.travelAgency.model;


import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
public class ContinentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy ="continentEntity")
    private Set<CountryEntity> countryEntities;

    public ContinentEntity(String name) {
        this.name = name;
    }

    public ContinentEntity() {

    }


}
