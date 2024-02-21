package java_spring.boot.projectSem4.service;

import java_spring.boot.projectSem4.DTO.ProductDTO;
import java_spring.boot.projectSem4.Entity.Product;
import java_spring.boot.projectSem4.dao.ISProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class ProductService implements IProductService {

    private final ISProductRepository productRepository;

    public ProductService(ISProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getALLProduct() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    @Override
    public Optional<Product> getProductById(Integer id) {
        Optional<Product> product = productRepository.findById(id);
        return product;
    }

    @Override
    public void createProduct(Product product) {
      product.setCreated_at(LocalDateTime.now());
      productRepository.save(product);

    }

    @Override
    public void updateProduct(Integer id, Product product) {
        Optional<Product> existedProduct =productRepository.findById(id);
        if (existedProduct.isPresent()){
            Product newProduct = existedProduct.get();
            newProduct.setName(product.getName());
            newProduct.setDescription(product.getDescription());
            newProduct.setPrice(product.getPrice());
            newProduct.setQuantity(product.getQuantity());
            newProduct.setImage(product.getImage());
            newProduct.setUpdated_at(LocalDateTime.now());
            productRepository.save(newProduct);
        }else {
            product.setCreated_at(LocalDateTime.now());
            product.setId(id);
            productRepository.save(product);
        }

    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);

    }
}
