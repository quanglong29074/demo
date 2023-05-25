package demo4;

public class Car {
    private String brand;
    private double price;
    //class variable
    public static String type = "Car";

    public final String madeIn = "VN";

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice(){
        return price;
    }

    public  void setPrice(double price){
        this.price = price>0?price:0;//tương đương vs nếu price >0 thì this.price = price không thì thí .price = 0

    }
}
