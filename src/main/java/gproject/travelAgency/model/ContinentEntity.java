package gproject.travelAgency.model;


import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class ContinentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public ContinentEntity(String name) {
        this.name = name;
    }

    public ContinentEntity() {

    }


}
