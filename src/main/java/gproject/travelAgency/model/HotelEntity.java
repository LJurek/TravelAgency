package gproject.travelAgency.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Hotel")
@Data
public class HotelEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "HotelName")
    private String name;

    @Column(name = "Standard")
    private String standard;

    @Column(name = "Description")
    private String description;

    @Column(name = "CityId")
    private Long cityId;

    public HotelEntity(String name, String standard, String description, Long cityId) {
        this.name = name;
        this.standard = standard;
        this.description = description;
        this.cityId = cityId;
    }

    public HotelEntity() {
    }
}
