package demo6;

public class Main {
    public static void main(String[] args) throws  Exception {
        try{
            int x= 10;
            int y = 0;
            if (y<5){
                throw new Exception("không đúng giá trị");//chủ đọng phát ra lỗi
            }
            int z=x/y;
            demoException();
            System.out.println("z=" +z);

        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("done");
    }
    public static void demoException() throws Exception{

    }
}
