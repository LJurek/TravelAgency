package gproject.travelAgency.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Citys")
@Data
public class CityEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "CityName")
    private String name;

    @Column(name = "CountryId")
    private Long countryId;

    public CityEntity(String name, Long countryId) {
        this.name = name;
        this.countryId = countryId;
    }

    public CityEntity() {
    }
}
