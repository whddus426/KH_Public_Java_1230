package 기본for문;
// for(초기식; 조건식; 증감식;) {}
public class ForEx1 {
    public static void main(String[] args) {
        for (int i =1; i <= 100; i++) {
            System.out.printf("%4d", i);
            if (i % 10 == 0) System.out.println();
        }
        System.out.println();
    }
}
