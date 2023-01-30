package co.develhope.mockdb.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName, lastName;
    @Column(unique = true, name = "emailUser")
    private String email;



}
