package b3;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Student s = new Student();
        s.learn();
        FPTStudent f = new FPTStudent();
        f.learn();
        f.playFootball();
        ArrayList arrList = new ArrayList();
        arrList.add(100);
        arrList.add("hello");
        arrList.remove("hello");
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("word");
        stringArrayList.remove(0);//vị trí cần xóa
        ArrayList<Student> studentArrayList = new ArrayList<>();
        System.out.println(stringArrayList.get(0));//arr[0]
        for(String st : stringArrayList){
            //st <==> StringArrayList.get(i)
        }
    }
}
