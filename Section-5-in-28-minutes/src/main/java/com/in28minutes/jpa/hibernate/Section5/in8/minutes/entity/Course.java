package com.in28minutes.jpa.hibernate.Section5.in8.minutes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
