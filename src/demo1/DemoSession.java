package demo1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DemoSession {
    public static void main(String args[]){
        int x = 10;
        x++;
        int y = 0;
        for(int i=0; i<10; i++){

        }
        int arr[] = new int [5];//mảng 5 s nguyên
        arr[0] = 10;
        arr[1] = 2;
        arr[2] = 21;
        arr[3] = 11;
        arr[4] = 56;

        for(int i=0;i<5;i++);
        {

        //arr[i]
        }
        //foreach
        for(int a : arr){
            //System.out.println(a);
        }
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập 1 số từ bafn phím:");
        n = sc.nextInt();
       // System.out.println("số vừa nhp:" +n);
       int u=0;
       for(int i = 1; i <=n; i++){
           if(n%i==0){
               u++;
           }
       }
       //Đã đếm xong số ước
        if(checkSNT(n)){
            System.out.println(n+ "là số nguyên tố");
        }else{
            System.out.println(n+ "không phải là số nguyên tố");
        }
    }
    public static boolean checkSNT(int a){
        if(a<2) return false;
        if(a<4) return true;
        for(int i=2; i<=a/2;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
