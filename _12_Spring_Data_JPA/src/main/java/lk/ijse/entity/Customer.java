package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: pasindi
 * Date: 2/11/25
 * Time: 11:55 AM
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Customer {
    @Id
    private int id;
    private String name;
    private String address;
}
