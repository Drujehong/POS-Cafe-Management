/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.Collection;
import java.util.HashSet;
import domain.Product;
import java.math.BigDecimal;

/**
 *
 * @author Andrew John
 */
public class ProductCollectionsDAO {
    
    /**
     * private data fields for ProductCollectionDAO
     */
    private static Collection<Product> products = new HashSet<>();
    private static Collection<String> productIds = new HashSet<>();
    private static Collection<String> categories = new HashSet<>();
    private static boolean testDataAdded = true;
    private static final boolean DEBUGGING = true;
    
    /**
     * Default constructor
     */
    public ProductCollectionsDAO() {
        if(DEBUGGING) {
            Product product1 = new Product("S001", "Cheesy Tortillas", "Homemade tortillas with cheesy sauce", "Sides", new BigDecimal("7.99"));
            Product product2 = new Product("S002", "Spicy Nachos", "Homemade nachos with specially grinded spices", "Sides", new BigDecimal("7.99"));
            Product product3 = new Product("B001", "Matcha Latte", "Freshly grinded matcha with fresh milk", "Beverages", new BigDecimal("5.99"));
            
            if(testDataAdded) {
                
                saveProduct(product1);
                saveProduct(product2);
                saveProduct(product3);
                
                System.out.println("ProductCollectionsDAO: Test Data successfully added.");
                testDataAdded = false;
            }
        }
    }
    
    public void saveProduct(Product product) {
        products.add(product);
        productIds.add(product.getProductId());
        categories.add(product.getCategory());
        if(DEBUGGING) {
            System.out.println("ProductCollectionsDAO: " + products.toString());
        }
    }
    
    public void removeProduct(Product product) {
        if(products.remove(product)) {
            productIds.remove(product.getProductId());
            
            HashSet<String> remainingCategories = new HashSet<>();
            for(Product rp : products) {
                remainingCategories.add(rp.getCategory());
            }
            
            this.categories = remainingCategories;
            
            System.out.println("ProductCollectionsDAO: Product removed successfully.");
        } else {
            System.out.println("ProductCollectionsDAO: Product not found in the collection.");
        }
    }
    
    public Product searchProductById(String searchProductId) {
        Product returnedProduct = null;
        if(searchProductId.equals("")) {
            System.out.println("ProductCollectionsDAO: There is nothing in searchProductId.");
        } else {
            for(Product p : products) {
                if(p.getProductId().equals(searchProductId)) {
                    returnedProduct = p;
                }
            }
        }
        return returnedProduct;
    }
    
    public Collection<Product> getProducts() {
        return products;
    }
    
    public Collection<String> getProductIds() {
        return productIds;
    }
    
    public Collection<String> getCategories() {
        return categories;
    }
}
