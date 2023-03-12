package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    Product product1 = new Product (11, "Мы", 200);
    Product product2 = new Product (245, "Nokia", 7000);
    Product product3 = new Product (312, "Samsung", 22000);



    @Test
    public void testRemoveById () {

        ProductRepository repo = new ProductRepository();
        repo.save(product1);
        repo.save(product2);
        repo.save(product3);
        repo.removeById(product2.getId());

        Product[] expected = {product1, product3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals( expected, actual);
    }



}