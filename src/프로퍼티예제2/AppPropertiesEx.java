package 프로퍼티예제2;
import java.util.Properties;

public class AppPropertiesEx {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("timeout", "30");
        properties.setProperty("language", "kr");
        properties.setProperty("size", "10");
        properties.setProperty("capacity", "10");

        Member member = new Member();
        member.getMemberProperty();

        System.out.println("timeout : " + properties.getProperty("timeout"));
        System.out.println("timeout : " + properties.getProperty("language"));
        System.out.println("timeout : " + properties.getProperty("size"));
        System.out.println("timeout : " + properties.getProperty("capacity"));



    }
}

class Member {
    public void getMemberProperty() {

//        System.out.println("timeout : " + properties.getProperty("timeout"));
//        System.out.println("timeout : " + properties.getProperty("language"));
//        System.out.println("timeout : " + properties.getProperty("size"));
//        System.out.println("timeout : " + properties.getProperty("capacity"));

    }
}