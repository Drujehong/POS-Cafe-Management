/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.math.BigDecimal;

/**
 *
 * @author Andrew John
 */
public class Product {
    
    /**
     * Private data fields for Product
     */
    private String productId;
    private String name;
    private String desc;
    private String category;
    private BigDecimal listPrice;
    
    public Product() {}
    
    public Product(String productId, String name, String desc, String category, BigDecimal listPrice) {
        this.productId = productId;
        this.name = name;
        this.desc = desc;
        this.category = category;
        this.listPrice = listPrice;
    }
    
    public String getProductId() {
        return productId;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDesc() {
        return desc;
    }
    
    public String getCategory() {
        return category;
    }
    
    public BigDecimal getPrice() {
        return listPrice;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    public void setPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }
    
    
    @Override
    public String toString() {
        return "ID: " + productId 
                + " ,Name: " + name 
                + " ,Category: " + category 
                + " ,Price: $" + listPrice;
    }
}