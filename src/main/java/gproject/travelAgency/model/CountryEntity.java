package gproject.travelAgency.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Country")
@Data
public class CountryEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "CountryName")
    private String name;

    @Column(name = "ContinentId")
    private Long continentId;

    public CountryEntity(String name, Long continentId) {
        this.name = name;
        this.continentId = continentId;
    }

    public CountryEntity() {
    }
}
