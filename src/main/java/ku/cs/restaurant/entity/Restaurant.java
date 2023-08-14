package ku.cs.restaurant.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


import java.util.UUID;


@Data //lombok create get set automatically
@Entity //create table in database
public class Restaurant {


    @Id //primary key
    @GeneratedValue //generate automatically
    private UUID id;

    private String name;
    private double rating;
    private String location;
}
