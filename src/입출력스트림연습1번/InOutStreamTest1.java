package 입출력스트림연습1번;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.*;

// 파일을 읽어서 총점을 구하고 총점이 높은 사람 순으로 정렬(총점이 같은 경우 이름순 정렬)
// 파일을 만들어서 특정 위치에 저장
// FileInputStream 을 이용해서 파일에 대한 스트림 생성
// 파일의 내용은 스캐너를 사용해서 읽어 들이고, 문자열을 split(" ")으로 잘라서 문자열 배열에 저장
// 성적은 Integer.parseInt()를 이용해 변환
// 여기서 필요한게 학생과 성적을 입력 받을 클래스를 만들고 split() 생성된 문자열을 클래스 부터 생성된 객체에 저장
// 클래스를 만들 때 정렬 위해서 Comparable 이나 Comparator 상속 받아 정렬 조건 구현 필요
// TreeSet 컬렉션 사용 필요.
public class InOutStreamTest1 {
    public InOutStreamTest1() {

    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/입출력스트림연습1번/test.txt1");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fis); // 스캐너의 입력으로 파일을 읽어 들임
        while (sc.hasNext()) {
            String line = sc.nextLine();
            list.add(line);
        }
        Set<Student> ts = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            int sum = 0;
            String[] str = list.get(i).split(" ");
            for (int j = 1; j < str.length; j++) {
                sum += Integer.parseInt(str[j]);
            }
            ts.add(new Student(str[0], sum));
        }

        ts.stream().forEach(e->System.out.println(e.name + e.sum));
    }
}
class Student implements Comparable<Student> {
    String name;
    int sum;

    public Student(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public int compareTo(Student o) {
        if(this.sum == o.sum)  { //
            return this.name.compareTo(o.name); // 이름을 기준으로 사전순 정렬
        } else if(this.sum > o.sum) return  -1;
        else return 1;
    }
}

