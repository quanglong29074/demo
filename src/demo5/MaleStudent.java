package demo5;

public class MaleStudent extends Student  implements IStudent{

    public MaleStudent(int id, String name, int age) {
        super(id,name,age);
    }

    @Override
    public void playFootball() {

    }

    @Override
    public void learn() {

    }
}
