package java_spring.boot.projectSem4.dao;

import java_spring.boot.projectSem4.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISProductRepository extends JpaRepository<Product,Integer> {
    void deleteById(Integer id);
}
