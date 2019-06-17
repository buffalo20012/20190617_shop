package kr.hs.dgsw.shop_back.Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Product {
    @Id
    private String product_name;

    private String product_context;
    private Long product_price;
    private String product_category;
    private String product_filepath;
    private String product_filename;

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_context() {
        return product_context;
    }

    public void setProduct_context(String product_context) {
        this.product_context = product_context;
    }

    public Long getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Long product_price) {
        this.product_price = product_price;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    public String getProduct_filepath() {
        return product_filepath;
    }

    public void setProduct_filepath(String product_filepath) {
        this.product_filepath = product_filepath;
    }

    public String getProduct_filename() {
        return product_filename;
    }

    public void setProduct_filename(String product_filename) {
        this.product_filename = product_filename;
    }
}
