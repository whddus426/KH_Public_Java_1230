package 입출력스트림연습0번;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

//public class InOutStreamTest0 {
//    public static <StudentInfo> void main(String[] args) {
//        FileInputStream is = null;
//        TreeSet<StudentInfo> ts = new TreeSet<>();
//        try {
//            is = new FileInputStream("src/입출력스트림연습1번/test.txt1");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//
//        }
//        Scanner sc = new Scanner(is);
//
//        while (sc.hasNextLine()) {
//            String line = sc.nextLine();
//            String[] strArr = line.split(" ");
//            ts.add(new StudentInfo(strArr[0],
//                    Integer.parseInt(strArr[1]),
//                    Integer.parseInt(strArr[2]),
//                    Integer.parseInt(strArr[3])));
//        }
//        for(StudentInfo e : ts) {
//            System.out.println(e.getname() + " : " + e.getTotal());
//        }
//        is.close();
//    }
//}
