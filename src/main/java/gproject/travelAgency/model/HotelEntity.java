package gproject.travelAgency.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class HotelEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String standard;
    private String description;
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
