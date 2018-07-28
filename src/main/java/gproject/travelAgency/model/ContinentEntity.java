package gproject.travelAgency.model;


import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Continents")
@Data
public class ContinentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Name")
    private String name;

    public ContinentEntity(String name) {
        this.name = name;
    }

    public ContinentEntity() {

    }


}
