package demo5;

public class Main {
    public static void main(String[] args){
        //IMale ii = new iMale();
        IMale im = new IMale() {
            @Override
            public void drink() {

            }
        };
        //up casting - down casting
        //lamda expression
        IMale im2 = ()->{
            System.out.println("Drink Beer");
        };
    }
}
