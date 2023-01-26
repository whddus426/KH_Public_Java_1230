package Arrays연습문제;
import java.util.Arrays;
import java.util.Scanner;
// 1000개의 배열을 생성하고, 각 배열에 1000미만의 임의의 수 생성(중복값 제거)
// 찾을 임의의 수 입력
// 배열을 오름 차순 정렬하고 난 후 찾을 수을 이분 검색을 이용해서 값 찾기
// 값을 찾으면 해당값의 위치를 출력(인덱스가 아님)
public class ArraysTestEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1000];
        int val, index = 0;
        int cnt = 0;
        boolean isExist = false;
        while (true) {
            val = (int)((Math.random() * 1001));
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == val) isExist = true;
            }
            if(!isExist) arr[index++] = val;
            if(index == 1000) break;
            isExist = false;
        }

        Arrays.sort(arr);
        for(int i =0; i < arr.length; i++) {
            cnt++;
            System.out.printf("%5d", arr[i]);
            if(i % 10 == 0) System.out.println();
        }

        System.out.print("찾을 수를 입력 하세요 : ");

    }
}
