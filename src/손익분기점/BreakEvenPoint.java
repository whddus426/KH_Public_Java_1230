package 손익분기점;
// 손익분기점이란? 초 수입이 총 비용보다 많아져 이익이 발생하는 지점을 의미
// A(고정비용), B(가변비용), C(판매가격)
// 이익이 나는 지점의 생산 댓수 출력하기
// 손익분기점이 존재하지 않으면 -1 출력
import java.util.Scanner;
public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int fixcost = sc.nextInt();
        int varcost = sc.nextInt();
        int sellPrice = sc.nextInt();
        if (varcost >= sellPrice) {
            System.out.println("-1");
            return;
        }
        while (true) {
            if(fixcost + (varcost * cnt) < sellPrice * cnt) break;
            cnt++;
        }
        System.out.println(cnt);
    }
}
