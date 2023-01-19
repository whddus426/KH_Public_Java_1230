package 자동차만들기;

import 매개변수의다형성.Driver;

import java.util.Scanner;

public class CarTotalExMain {
    public static void main(String[] args) {
//        Driver driver = new Driver();
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역을 선택 하세요 (1. 부산, 2. 대전, 3. 강릉, 4. 광주) : ");
        int location = sc.nextInt();
//        driver.setLocation(location);

        System.out.print("이동할 승객 수를 입력 하세요 ( 1 ~ 100사이) : ");
        int passenger = sc.nextInt();

        System.out.print("이동할 차량을 선택 하세요. (1. 스포츠카 2. 승용차, 3. 버스 : ");
        int carKind = sc.nextInt();

        System.out.print("부가기능을 사용하시겠습니까 (y/n) : ");
        String func = sc.next();


    }
}
