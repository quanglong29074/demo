package demo7;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
        LocalDate ld1 = LocalDate.now();//ngày của máy tính chạy phàn mềm
        System.out.println(ld1);
        LocalDate ld2 = ld1.plusDays(2);//cộng thêm hai ngày từ ld1
        System.out.println(ld2);
        LocalDate ld3 = ld1.minusDays(3);//trừ i 3 ngày kể từ ld1
        System.out.println(ld3);

        String bth = "2004-07-30";
        LocalDate ld4 = LocalDate.parse(bth);
        System.out.println(ld4.getDayOfWeek());//in ra thứ trong tuần
        LocalDate ld5 = LocalDate.of(2004,7, 29);

        LocalDateTime lt1 = LocalDateTime.now();
        LocalDateTime lt2 = lt1.plusMinutes(5);//+5'
        LocalDateTime lt3 = lt1.minusMinutes(5);//-5'

    }
}
