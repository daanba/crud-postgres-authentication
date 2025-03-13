package ba.daan.crud_postgres.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "\"user\"")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;


}