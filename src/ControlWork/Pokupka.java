package ControlWork;


import java.util.ArrayList;
public class Pokupka {
//ответственный за покупку одним клиентом в определенную дату нескольких продуктов.

    public String date;
    public Client client;
    public ArrayList<Product> products = new ArrayList<>();
    public ArrayList<Integer> kolvos = new ArrayList<>();

    public Pokupka(String date, Client client) {
        this.date = date;
        this.client = client;
    }
    public void addProduct(Product product, int kolvo){
        products.add(product);
        kolvos.add(kolvo);
    }

}
