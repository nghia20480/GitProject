package service;

import model.Product;

import java.beans.Customizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements  ProductService{
    private static Map<Integer, Product> product;
    static {
        product=new HashMap<>();
        product.put(1,new Product(1,"a",100,"cd","k"));
        product.put(1,new Product(2,"b",200,"ea","fa"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(product.values());
    }

    @Override
    public Product findByName(String name) {
        return product.get(name);
    }

    @Override
    public void update(int id,Product products) {
        product.put(id,products);
    }

    @Override
    public void remove(int id) {
        product.remove(id);

    }

    @Override
    public void save(Product products) {
        product.put(products.getId(),products);
    }
}
