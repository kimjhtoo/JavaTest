import java.util.ArrayList;
import java.util.List;

public class CLSFW {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add ("김지태");
        list.add ("홍길동");
        list.add ("임꺽정");
        list.add ("고길동");

        int listsize =list.size();

        for (int i=0; i<listsize; i++) {
            System.out.println("이름 :" + list.get(i));
        }
    }
}
