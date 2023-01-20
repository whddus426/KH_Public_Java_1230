package 중첩인터페이스;
// 중첩 인터페이스는 클래스 내부의 선언한 인터페이스 입니다.
// 중첩 인터페이스는 주로 UI 프로그래밍에서 사용 됩니다.
public class NestedInterface {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(new CallListener());
        button.touch();
        button.setOnClickListener(new MessageListener());
        button.touch();
    }
}
