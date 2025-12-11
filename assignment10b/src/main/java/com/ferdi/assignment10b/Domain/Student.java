package com.ferdi.assignment10b.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;// : long (Primary Key)

  @Column(nullable = true)
   private String studentNumber;

   @Column(nullable = false)
   private String firstName;

   private String middleName;

   @Column(nullable = false)
   private String lastName ;

   private Double cgpa;

   private LocalDateTime dateOfEnrollment;


}
