import java.util.ArrayList;
import java.util.List;

public class Listex1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //List 객체에 데이터 추가하기
        list.add("김지태");
        list.add("이지태");
        list.add("박지태");
        list.add("유지태");

        //List의 데이터 수 구하기
        int listSize = list.size();

        // List 객체에 지정된 값 출력하기
        // 여러 데이터가 저장되기 때문에 내용을 확인하기 위해서는 반복문을 사용함

        // 알고있는 for 문 예시
        for (int i = 0; i <listSize; i++) {
            System.out.println("이름 : " + list.get(i));


        }
    }
}
