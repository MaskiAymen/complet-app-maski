package ma.maski.costomerappthymeleaf.web;

import ma.maski.costomerappthymeleaf.entities.Customer;
import ma.maski.costomerappthymeleaf.repository.CustomerRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CustomerController {

    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers")
    public String customers(Model model){
        List<Customer> customerList= customerRepository.findAll();
        model.addAttribute("customers",customerList);
        return "customers";
    }
    @GetMapping("/products")
    public String products(Model model){

        return "products";
    }
    @GetMapping("/auth")
    public Authentication authentication(Authentication authentication){
        return authentication;
    }
    @GetMapping("/")
    public String home(){

        return "home";
    }
    @GetMapping("/notAutorized")
    public String notAutorized() {
        return "notAuthorized";
    }



}
