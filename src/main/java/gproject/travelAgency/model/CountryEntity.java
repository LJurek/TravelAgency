package gproject.travelAgency.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class CountryEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long continentId;

    public CountryEntity(String name, Long continentId) {
        this.name = name;
        this.continentId = continentId;
    }

    public CountryEntity() {
    }
}
