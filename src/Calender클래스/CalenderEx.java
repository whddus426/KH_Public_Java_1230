package Calender클래스;
import java.util.Calendar;
// Calender 클래스는 추상 클래스이므로 객체를 생성 할 수 없음, 정적메소드인 gerInstance() 메소드로 운영체제의 시간을 가져 옴
// Calender 클래스 포함된 모든 필드는 정적 변수(클래스 변수) 임.
public class CalenderEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); // Date now = new Date();
//        System.out.println(now.get(Calendar.YEAR));
//        System.out.println(now.get(Calendar.MONTH) + 1); // 달의 정보는 배열의 인덱스를 넘어 오기 때문에 1을 더해야 함
//        System.out.println(now.get(Calendar.DAY_OF_MONTH)); // 달에서 몇번째 날짜
//        System.out.println(now.get(Calendar.DAY_OF_WEEK)); // 주에서 몇번째 날짜(일요일 부터 시작하며 1부터)
//        System.out.println(now.get(Calendar.AM_PM)); // 오전0,  오후 1
//        System.out.println(now.get(Calendar.HOUR));
//        System.out.println(now.get(Calendar.MINUTE));
//        System.out.println(now.get(Calendar.SECOND));

        // yyyy년MM월dd HH시mm분ss초 형태를 Calender를 이용해 출력 해보기
        int year = now.get(Calendar.YEAR);
        int mon = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int isPm = now.get(Calendar.AM_PM);
        int hour = now.get(Calendar.HOUR);
        int min = now.get(Calendar.MINUTE);
        int sec = now.get(Calendar.SECOND);
        if(isPm == 1) hour += 12;
        System.out.printf("%d년%02d월%02d일 %02d시%02d분%02d초\n", year, mon, day, hour, min, sec);

     }
}
