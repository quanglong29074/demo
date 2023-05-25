package demo3;

public class main {
    public static void main(String args[]){
        int x= 10;
        Customer c = new Customer();
        Customer k = new Customer();
        c.setId(100);
        k.setId(90);
        System.out.println(c.getId());
        c.buyCart();
        k.buyCart();
        c.sayHello("HaNoi");
        k.sayHello("HCM");
        c.printfInfo();
        k.printfInfo();
    }
}
