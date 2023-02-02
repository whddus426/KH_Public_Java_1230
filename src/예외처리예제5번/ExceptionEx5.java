package 예외처리예제5번;

import java.io.IOException;

// 예외처리 미루기 : 해당 메소드안에서 예외처리 대한 부분을 메소드를 호출한 상위로 떠넘기는 것
public class ExceptionEx5 {
    public void main(String[] args) {
        IOSample ioSample = new IOSample();
        try {
            ioSample.input();
            ioSample.output();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class IOSample {
    private int num;

    public void input() throws IOException { // 예외  퍼리를 호출한 곳으로 던져 보냄
        num = System.in.read();
    }
    public void output() {
        System.out.println(num);
    }
}
