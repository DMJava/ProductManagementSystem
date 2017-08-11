package net.project.productmanager.service;

import net.project.productmanager.model.Product;

import java.util.List;

public interface ProductService {
    public void addProduct(Product product);

    public void updateProduct(Product product);

    public void removeProduct(int id);

    public Product getProductById(int id);

    public List<Product> listProducts();
}
