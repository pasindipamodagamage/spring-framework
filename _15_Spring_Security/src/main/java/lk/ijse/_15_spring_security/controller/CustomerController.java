package lk.ijse._15_spring_security.controller;

import jakarta.servlet.http.HttpServletRequest;
import lk.ijse._15_spring_security.Customer;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private List<Customer> customers = new ArrayList<Customer>(
            List.of(new Customer("pasi",20),
                    new Customer("pasidi",30))
    );

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customers;
    }

    @PostMapping
    public void saveCustomer(@RequestBody Customer customer) {
        customers.add(customer);
    }

    @GetMapping("csrf")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
