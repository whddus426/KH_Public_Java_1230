package 명함전송클라이언트;

import 명함전송서버1.NameCard1;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

public class NameCardClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket("localhost", 8990);
        System.out.println("서버 접속 성공");
        InputStream is = socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        List<NameCard1> nameCards = (List<NameCard1>) ois.readObject();
        viewNameCards(nameCards);
    }
    static void viewNameCards(List<NameCard1> nameCards) {
        for(NameCard1 e : nameCards) {
            System.out.println("==== 명함 정보 출력 ====");
            System.out.println("이름 : " + e.getName());
            System.out.println("회사 : " + e.getCompany());
            System.out.println("전화 : " + e.getNumber());
            System.out.println("메일 : " + e.getEmail());
        }
    }
}
