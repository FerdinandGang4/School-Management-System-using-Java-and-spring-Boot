package com.ferdi.assignment10b.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;// : long (Primary Key)

    @Column(nullable = false)
   private String studentNumber;

    @Column(nullable = false)
   private String firstName;

   private String middleName;

   @Column(nullable = false)
   private String lastName ;

   private Double cgpa;

   private LocalDateTime dateOfEnrollment;


}
