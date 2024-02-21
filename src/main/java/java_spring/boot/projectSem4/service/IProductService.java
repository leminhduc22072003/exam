package java_spring.boot.projectSem4.service;

import java_spring.boot.projectSem4.DTO.ProductDTO;
import java_spring.boot.projectSem4.Entity.Category;
import java_spring.boot.projectSem4.Entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IProductService {
    List<Product> getALLProduct();
    Optional<Product> getProductById(Integer id);
    void createProduct(Product product);
    void updateProduct(Integer id,Product product);

    void deleteProduct(Integer id);
}
