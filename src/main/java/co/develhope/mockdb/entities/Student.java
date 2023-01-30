package co.develhope.mockdb.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Student", uniqueConstraints = {
        @UniqueConstraint(columnNames = { "email" })
})
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName, lastName, email;



}
