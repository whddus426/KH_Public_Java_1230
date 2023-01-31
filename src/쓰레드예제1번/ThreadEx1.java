package 쓰레드예제1번;
// 멀티쓰레드란? 한개의 프로그램이 여러가지 일을 동시에 처리 하는 것 (반복분이 여러개가 동시에 도는 것과 비슷)
// Main Thread : 모든 자바 Application은 Main Thread가 main()메소드를 실행하면서 시작 됨
// 멀티쓰레드에서는 메인 쓰레드가 종료되더라고 실행중인 쓰레드가 있으면 프로그램은 종료되지 않습니다.
public class ThreadEx1 {
    public static void main(String[] args) {
        Thread test = new TestThread();
        test.start();
        int sum = 0;
        for(int i = 0; i <= 100; i ++) {
            sum += i;
            System.out.println("Main : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}
class TestThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i <= 100; i ++) {
            sum += i;
 //           System.out.println("Sub);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}