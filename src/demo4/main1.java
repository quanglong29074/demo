package demo4;
import java.util.Scanner;
public class main1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        bt t= new bt();
       bt m= new bt();
       t.setMs(10);
       m.setMs(5);
        System.out.println(t.getMs());

        bt ps1 = new bt(16,3);
        bt ps2 = new bt(4,8);
        ps1.phanSo();
        ps1.add(ps2);
        ps1.div(ps2);
        ps1.inverse();
        ps1.nul(ps2);
        ps1.rutGon();
        ps1.sub(ps2);
    }
}
