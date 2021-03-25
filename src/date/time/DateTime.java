package date.time;

import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args){
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        int dd = dt.getDayOfMonth();
        int mm = dt.getMonthValue();
        int yy = dt.getYear();
        int h = dt.getHour();
        int m = dt.getMinute();
        int s = dt.getSecond();
        int n = dt.getNano();
        System.out.printf("Date : %d-%d-%d",dd,mm,yy);
        System.out.printf("\nTime : %d:%d:%d:%d",h,m,s,n);
    }
}
