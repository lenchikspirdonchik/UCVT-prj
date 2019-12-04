package ControlWork;

import java.util.ArrayList;

public class Product {
/*конструктор класса: параметры   id продукта, наименование продукта, цена продукта. В кон-структоре присвоить все значения.
*/
public int id;
public String name;
public int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
