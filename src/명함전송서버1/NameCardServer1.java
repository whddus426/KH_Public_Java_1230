package 명함전송서버1;
// 1. 명함 정보를 담을 클래스 생성 (이름, 전화번호, 이메일, 주소)
// 2. List 생성 후 10명에 대한 명함 정보 입력
// 3. 서버는 accept() 에서 클라이언트 연결을 기다리다가 연결 요청이 오면 연결을 수락하고
// 명함 전송 여부를 물어본 (전송 하시겠습니까? (Yes / No)
// 4. 클라이언트에서 명함을 수신하면 출력하기

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameCardServer1 {
    static List<NameCard1> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        int port = 6657;
        ServerSocket serverSocket = new ServerSocket(port);
        Scanner sc = new Scanner(System.in);
        while(true) {
            Socket socket = serverSocket.accept();
            System.out.println("[클라이언트 : " + socket.getRemoteSocketAddress() + "연결");
            System.out.print("클라이언트로 명함을 전송 하시겠습니까?(yes / no) : ");
            String confirm = sc.next();
            if(confirm.equalsIgnoreCase("yes")) {
                OutputStream os = socket.getOutputStream();
                ObjectOutputStream oss = new ObjectOutputStream(os);
                oss.writeObject(writeNameCard());
                oss.flush();
                oss.close();
                os.close();
            }
        }
    }
    static List<NameCard1> writeNameCard() {
        list.add(new NameCard1("장원영", 010-4567-7894, "jang@gmail.com","아이브", "스타쉽"));
        list.add(new NameCard1("장원영", 010-4567-7894, "jang@gmail.com","아이브", "스타쉽"));
        list.add(new NameCard1("장원영", 010-4567-7894, "jang@gmail.com","아이브", "스타쉽"));
        list.add(new NameCard1("장원영", 010-4567-7894, "jang@gmail.com","아이브", "스타쉽"));
        list.add(new NameCard1("장원영", 010-4567-7894, "jang@gmail.com","아이브", "스타쉽"));
        list.add(new NameCard1("장원영", 010-4567-7894, "jang@gmail.com","아이브", "스타쉽"));
        list.add(new NameCard1("장원영", 010-4567-7894, "jang@gmail.com","아이브", "스타쉽"));
        list.add(new NameCard1("장원영", 010-4567-7894, "jang@gmail.com","아이브", "스타쉽"));
        list.add(new NameCard1("장원영", 010-4567-7894, "jang@gmail.com","아이브", "스타쉽"));
        list.add(new NameCard1("장원영", 010-4567-7894, "jang@gmail.com","아이브", "스타쉽"));
        return list;

    }
}
