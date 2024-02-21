package java_spring.boot.projectSem4.Controller;

import java_spring.boot.projectSem4.Entity.Product;
import java_spring.boot.projectSem4.service.ProductService;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.List;

@Controller
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService){

        this.productService = productService;
    }
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }
    @GetMapping("/list")
    public String GetProduct(Model model){
        List<Product> products=ProductService.getAllProduct
    }


}

