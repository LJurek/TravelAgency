package gproject.travelAgency.model;


import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Entity
@Data
public class ContinentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "continentEntity",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<CountryEntity> countryEntities;

    public ContinentEntity(String name) {
        this.name = name;
    }

    public ContinentEntity() {

    }


}
