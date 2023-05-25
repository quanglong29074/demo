package bt5;

public class main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Product 1", 5, 1000);
        Product product2 = new Product(2, "Product 2", 2, 2000);
        product1.checkQty();
        product2.checkQty();

        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.setCity("HoChiMinh");
        cart.calculateTotal();
        System.out.println(cart.getGrandTotal());
    }
}
