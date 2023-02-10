package 명함전송서버;
// 1. 명함 정보를 담을 클래스 생성 (이름, 전화번호, 이메일, 주소)
// 2. List 생성 후 10명에 대한 명함 정보 입력
// 3. 서버는 accept() 에서 클라이언트 연결을 기다리다가 연결 요청이 오면 연결을 수락하고
// 명함 전송 여부를 물어본 (전송 하시겠습니까? (Yes / No)
// 4. 클라이언트에서 명함을 수신하면 출력하기

import java.util.ArrayList;
import java.util.List;

public class NameCardServer {
    public static void main(String[] args) {
        List<NameCard> strings=new ArrayList<>();
        strings.add(new NameCard("안유진", 010-1234-5678,"ahn@gamail.com", "지구오락실"));
        strings.add(new NameCard("우영우", 010-4567-8965, "woo@gamil.com", "이상한변호사우영우"));
        strings.add(new NameCard("장원영", 010-5454-8787, "jang@gmail.com", "아이브"));
        strings.add(new NameCard("유나", 010-5454-6666, "yuna@gmail.com", "아이브"));
        strings.add(new NameCard("장원영", 010-5454-8787, "jang@gmail.com", "아이브"));
        strings.add(new NameCard("장원영", 010-5454-8787, "jang@gmail.com", "아이브"));
        strings.add(new NameCard("장원영", 010-5454-8787, "jang@gmail.com", "아이브"));
        strings.add(new NameCard("장원영", 010-5454-8787, "jang@gmail.com", "아이브"));
        strings.add(new NameCard("장원영", 010-5454-8787, "jang@gmail.com", "아이브"));
        strings.add(new NameCard("장원영", 010-5454-8787, "jang@gmail.com", "아이브"));


    }
}
