package gproject.TravelAgency.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name = "Continent")
public class ContinentEntity {

    @Id
    @GeneratedValue
    Long Id;

    String Name;

    public ContinentEntity(String name) {
        Name = name;
    }

    public ContinentEntity(){

    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }
    @Override
    public String toString() {
        return "ContinentEntity{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
