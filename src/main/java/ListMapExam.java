import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMapExam {
    public static void main(String[] args) {

        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        //김지태 정보 저장
        map.put("name", "김지태");
        map.put("email", "2220110012@gspace.kopo.ac.kr");
        map.put("addr", "서울");
        map.put("dept", "데이터분석과");

        list.add(map); // 앞서 등록한 김지태의 정보를 list에 저장

        map = null; // 메모리에 데이터를 지우는 방식으로 김지태의 정보를 삭제하기
        //----------------------------------------------------------------//

        //기존 map 객체의 값을 새롭게 생성하기
        map = new HashMap<>();

        //홍길동 정보 저장하기
        map.put("name", "홍길동");
        map.put("email", "g.d.hong@kopo.ac.kr");
        map.put("addr", "경기");
        map.put("dept", "시각디자인과");

        list.add(map); // 앞서 등록한 홍길동의 정보를 list에 저장하기

        map = null; // 메모리에 데이터를 지우는 방식으로 홍길동 정보를 삭제하기
        //list의 데이터 수 구하기
        int listsize = list.size();

        // List 객체에 저장된 값 출력하기
        // 여러 데이터가 저장되기 때문에 내용을 확인하기 위해서는 반복문을 사용함

        // for문을 사용한 출력방법
        for (int i = 0; i < listsize; i++) {

            Map rMap = list.get(i);
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("addr : " + rMap.get("addr"));
            System.out.println("dept : " + rMap.get("dept"));

            //foreach문으로 조회 / 자바 1.8버전 부터 활용 가능

            /*  for (Map<String, String> rMap : list) {

                System.out.println("name : " + rMap.get("name"));
                System.out.println("email : " + rMap.get("email"));
                System.out.println("addr : " + rMap.get("addr"));
                System.out.println("dept : " + rMap.get("dept"));
                */


                //람다식 출력

                /*list.forEach(rMap -> {
                            System.out.println("name : " + rMap.get("name"));
                            System.out.println("email : " + rMap.get("email"));
                            System.out.println("addr : " + rMap.get("addr"));
                            System.out.println("dept : " + rMap.get("dept"));
                        }
                )
            }*/
        }
    }
}