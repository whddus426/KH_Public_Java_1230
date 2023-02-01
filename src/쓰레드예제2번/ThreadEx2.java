package 쓰레드예제2번;
// 쓰레드 생성 방법 :
// 1. Thread 클래스를 상속 받는 방법 (구현이 쉬움, 스레드를 상속 받았기 때문 다른 클래스 상속 불가)
// 2. Runnable 인터페이스 구현하는 방법
// 3. Runnable 인터페이스 이용한 익명의 객체로 구현
// 4. Runnable 인터페이스 이용한 람다식으로 구현
//public class ThreadEx2 {
//    public static void main(String[] args) throws InterruptedException {
//        Runnable task = new Sample();
//        Thread thread1 = new Thread(task); // 실제 쓰레드가 생성 됨
//        Thread thread2 = new Thread(task);
//        thread1.setPriority(10); //
//        thread1.start(); // start()메소드를 호출 시 자신의 run() 메소드를 실행 합니다.
//        thread2.start();
//
//        Runnable task2 = new Runnable() {
//            @Override
//            public void run() {
//                int sum = 0;
//                for(int i = 0; i <= 10; i++) {
//                    try {
//
//                        //                  } catch (InterruptedException e) {
//                        //                      throw new RuntimeException(e);
//                    }
//
//
//                    System.out.println("" + Thread.currentThread() + sum);
//                }
//                System.out.println(Thread.currentThread() + "합계 : " + sum);
//            }
//        };
//        Thread thread3 = new Thread(task2);
//        thread3.start(); // start()메소드 호출 시 자신의 run() 메소드를 실행 합니다.
//
//        Runnable task3 = () -> {
//
//        };
//
//
//
//        for(int i = 0; i < 100; i++) {
////            sleep(1);
//            System.out.println("$$$$$$여기는 메인 입니다.$$$$$$");
//        }
//    }
//}
//
//class Sample  implements Runnable {
//
//    @Override
//    public void run() {
//        int sum = 0;
//        for(int i = 0; i < 100; i++) {
//            sum += i;
//            System.out.println("" + Thread.currentThread() + sum);
//        }
//        System.out.println(Thread.currentThread() + "합계 : " + sum);
//
//    }
//}
