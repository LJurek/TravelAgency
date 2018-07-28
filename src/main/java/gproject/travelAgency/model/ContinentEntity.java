package gproject.TravelAgency.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "Continent")
public class ContinentEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    @Column(name = "Name")
    String Name;

    public ContinentEntity(String name) {
        Name = name;
    }

    public ContinentEntity() {

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
