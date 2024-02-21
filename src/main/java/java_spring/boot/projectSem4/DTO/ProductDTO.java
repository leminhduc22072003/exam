package java_spring.boot.projectSem4.DTO;


import java.text.DecimalFormat;
import java.time.LocalDateTime;


public class ProductDTO {


    private int id;

    private String name;

    private String description;

    private DecimalFormat price;

    private int quantity;

    private  String image;

    private LocalDateTime created_at;

    private  LocalDateTime updated_at;

    private boolean is_deleted;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DecimalFormat getPrice() {
        return price;
    }

    public void setPrice(DecimalFormat price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    public ProductDTO() {
    }

    public ProductDTO(String name, String description, DecimalFormat price, int quantity, String image, LocalDateTime created_at, LocalDateTime updated_at, boolean is_deleted) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.is_deleted = is_deleted;
    }
}
