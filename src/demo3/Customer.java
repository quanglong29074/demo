package demo3;

public class Customer {
    int id=10;
    String name;
    int age;
    String address;

    public Customer(){
        //hàm khởi tạo-constructor
        //tên giống hệt tên lớp
        //không có kiểu dữ liệu trả về
        //tự động khởi chạy khi tạo đối tượng
        System.out.println("Đã tạo ra một đối tượng Customer");
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //getter setter
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }

    void buyCart(){

    }

    void sayHello(String msg){
        System.out.println("Hellp"+msg);
    }

    void printfInfo(){
        System.out.println("Name:"+this.name);
        System.out.println("age:"+this.age);
    }
}
