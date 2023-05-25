package demo4;

public class Main {
    public static void main(String[] args){
        Car c = new Car();
        c.setBrand("Car");
        System.out.println(c.getBrand());
        Toyota t = new Toyota();
        t.run();

        Car.type = "Moto and Car";

        Human human = new Human() {
            @Override
            public void eat() {

            }

            @Override
            public void work() {

            }
        };


    }
}
