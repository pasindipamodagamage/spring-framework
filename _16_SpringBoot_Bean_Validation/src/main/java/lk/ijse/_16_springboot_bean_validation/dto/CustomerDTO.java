package lk.ijse._16_springboot_bean_validation.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class CustomerDTO {
    @NotBlank(message = "Name is required")
    @Pattern(regexp = "^[A-Za-z]*$", message = "Name should only contain letters")
    @Size(min = 3, max = 30, message = "Name should contain 3-50 characters")
    private String name;

    @Email(message = "Invalid Email Format")
    private String email;

    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number should only contain 10 numbers")
    private String phoneNumber;
}