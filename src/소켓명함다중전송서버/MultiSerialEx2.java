package 소켓명함다중전송서버;
import 명함전송서버1.NameCard1;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 이름, 전화번호, 회사명, 이메일 포함된 10개의 명함 생성 후 다른 컴퓨터로 전송하기
// 연결된 클라이언트의 개수에 상관 없이 모든 클라이언트에게 전송하기
public class MultiSerialEx2 {
    static List<NameCard1> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        int port = 8990;
        ServerSocket serverSocket = new ServerSocket(port);
        Scanner sc = new Scanner(System.in);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("[클라이언트 : " + socket.getRemoteSocketAddress() + "연결");
            System.out.print("클라이언트로 명함을 전송 하시겠습니까?(yes / no) : ");
            String confirm = sc.next();
            if (confirm.equalsIgnoreCase("yes")) {
                Thread nameTh = new NameServerTh(socket);
                nameTh.start();
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

class NameServerTh extends  Thread {
    static ArrayList<Socket> sockets = new ArrayList<>();
    Socket socket;
    public NameServerTh(Socket socket) {
        this.socket =socket;
        sockets.add(socket);
    }
    @Override
    public void run() {
        try {
           for(int i = 0; i < sockets.size(); i++) {
               OutputStream os = sockets.get(i).getOutputStream();
                ObjectOutputStream oss = new ObjectOutputStream(os);
                oss.writeObject(MultiSerialEx2.writeNameCard());
                oss.flush();
                oss.close();
                System.out.println(sockets.get(i).getRemoteSocketAddress().toString() + "에게 전송 완료");
            }
         } catch (IOException e) {}
    }
}

