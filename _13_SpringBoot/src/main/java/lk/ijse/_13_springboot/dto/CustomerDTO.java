package lk.ijse._13_springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: pasindi
 * Date: 2/11/25
 * Time: 4:09 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private int id;
    private String name;
    private String address;
}
