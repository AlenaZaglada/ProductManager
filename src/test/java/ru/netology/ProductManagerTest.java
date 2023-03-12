package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductManagerTest {
    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Product product1 = new Product (11, "Мы", 200);
    Product product2 = new Product (245, "Nokia", 7000);
    Product product3 = new Product (312, "Samsung", 22000);

    @BeforeEach
    public void setup() {
        manager.add (product1);
        manager.add (product2);
        manager.add (product3);
    }

    @Test

    public void searchBy() {

        manager.searchBy("Nokia");

        Product[] expected = { product2 };
        Product[] actual = manager.searchBy();

        Assertions.assertArrayEquals(expected, actual);

    }





}