package com.movie.movie.pojo;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}
