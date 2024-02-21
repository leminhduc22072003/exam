package java_spring.boot.projectSem4.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name ="categories" )
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String name;
    private String icon;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private boolean is_deleted;
}
