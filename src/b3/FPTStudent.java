package b3;

public class FPTStudent extends Student{
    String telephone;
    public void playFootball(){
        System.out.println("Play Football");
        super.learn();//super là đối tượng ngầm định của lớp cha trong lớp con
        this.learn();
    }
    @Override
    public void learn(){
        System.out.println("Fpt student learning...");
    }
}
