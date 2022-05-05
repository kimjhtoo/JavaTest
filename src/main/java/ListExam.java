import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("김지태");
        list.add("이지태");
        list.add("박지태");
        list.add("유지태");
        list.add("홍지태");

        int listsize = list.size();

        for (int i =0; i<listsize; i++) {
            System.out.println("이름 : " + list.get(i));
        }

    }
}
