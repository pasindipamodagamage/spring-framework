package org.example.z13_spring_boot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Item {
    @Id
    private int id;
    private String name;
    private String description;
    private String qty;
    private double price;
}
