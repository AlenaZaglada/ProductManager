package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductManagerTest {
    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Product product1 = new Product(11, "Мы", 200);
    Product product2 = new Product(245, "Nokia3210", 7000);
    Product product3 = new Product(312, "Samsung", 22000);

    Product product4 = new Product(215, "NokiaE51", 35800);

    @BeforeEach
    public void setup() {
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.add(product4);
    }

    @Test

    public void searchBySmartphone() {


        Product[] expected = {product3};
        Product[] actual = manager.searchBy("Samsung");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void searchByTwoSmartphone() {


        Product[] expected = {product2, product4};
        Product[] actual = manager.searchBy("Nokia");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void searchByBook() {


        Product[] expected = {product1};
        Product[] actual = manager.searchBy("Мы");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void searchForWathIsNot() {


        Product[] expected = {};
        Product[] actual = manager.searchBy("Хлеб}");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void searchByAnotherLanguage() {


        Product[] expected = {};
        Product[] actual = manager.searchBy("Нокиа}");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void searchBySpace() {


        Product[] expected = {};
        Product[] actual = manager.searchBy ( );

        Assertions.assertArrayEquals(expected, actual);

    }


}