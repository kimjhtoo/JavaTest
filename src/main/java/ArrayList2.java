import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("김지태");
        list.add("고길동");
        list.add("임꺽정");
        list.add("홍길동");

        int listsize = list.size();

        for (int i = 0; i < listsize; i++) {
            System.out.println("이름 : " + list.get(i));
        }

        for (String name : list) {
            System.out.println("이름 : " + name);
        }

        list.forEach(name -> System.out.println("name : " + name));

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);
        }
    }
}