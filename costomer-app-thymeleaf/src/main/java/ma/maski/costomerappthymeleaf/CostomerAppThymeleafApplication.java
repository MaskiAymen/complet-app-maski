package ma.maski.costomerappthymeleaf;

import ma.maski.costomerappthymeleaf.entities.Customer;
import ma.maski.costomerappthymeleaf.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CostomerAppThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(CostomerAppThymeleafApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("MASKI").email("maski@gmail.com").build());
            customerRepository.save(Customer.builder().name("Ahmed").email("ahmed@gmail.com").build());
            customerRepository.save(Customer.builder().name("Ayoub").email("ayoub@gmail.com").build());
        };
    }

}
