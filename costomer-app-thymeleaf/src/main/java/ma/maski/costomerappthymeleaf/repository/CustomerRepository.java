package ma.maski.costomerappthymeleaf.repository;

import ma.maski.costomerappthymeleaf.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
