import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class An01 {
    public static void main(String[] args) {
            List<Map<String, String> > list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        map.put("name" , "김지태");
        map.put("dept" , "데이터분석");

        list.add(map);

        map = null;

        map = new HashMap<>();
        map.put("name" , "홍길동");
        map.put("dept" , "정보보안");

        list.add(map);

        map = null;
    }
}
