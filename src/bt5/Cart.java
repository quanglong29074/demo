package bt5;

import java.util.ArrayList;

public class Cart {
    private int id;
    private String customer;
    private double grandTotal;
    private ArrayList<Product> productList;
    private String city;

    public Cart() {
        productList = new ArrayList<Product>();
        city = "";
    }

    public Cart(String city) {
        productList = new ArrayList<Product>();
        this.city = city;
    }

    public void addProduct(Product product) {
        productList.add(product);
        grandTotal += product.getPrice();
        if (city.equals("Hanoi") || city.equals("Ho Chi Minh City")) {
            grandTotal *= 1.01;
        } else {
            grandTotal *= 1.02;
        }
    }

    public void removeProduct(Product product) {
        productList.remove(product);
        grandTotal -= product.getPrice();
        if (city.equals("Hanoi") || city.equals("Ho Chi Minh City")) {
            grandTotal *= 1.01;
        } else {
            grandTotal *= 1.02;
        }
    }

    public void calculateTotal() {
        grandTotal = 0.0; // Initialize grandTotal to 0.0 before calculating the total
        for (Product product : productList) {
            grandTotal += (product.getPrice() * product.getQty());
        }
        if (city.equals("Hanoi") || city.equals("Ho Chi Minh City")) {
            grandTotal *= 1.01;
        } else {
            grandTotal *= 1.02;
        }
    }


    public void setCity(String city) {
        this.city = city;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public String getCity() {
        return city;
    }
}