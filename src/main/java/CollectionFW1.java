import java.util.ArrayList;

public class CollectionFW1 {
    public static void main(String[] args) {
        String[] arrayobj = new String[2]; /*
        2개의 방에 들어갈 수 있는 데이터 타입은 스트링 ,
        방이 2개인 이유는 new String[2]라고 적어주었기 때문*/
        arrayobj[0] = "one"; //첫번째 방에는 one 이라는 데이터 타입이 들어감
        arrayobj[1] = "two"; //두번째 방에는 two 라는 데이터 타입이 들어감
        //arrayobj[2] = "three"; // 오류가 발생한다. 왜?? 존재하지않는 방에
        // 'three'라는 값을 추가할라고 하니까 발생
        for (int i = 0; i< arrayobj.length; i++) { //arrayobj.length라는 변수값을 사용
            System.out.println(arrayobj[i]); // arrayobj[i]라는 함수로 데이터를 가져옴
        }

        ArrayList<String> al = new ArrayList<String>(); //ArrayList 컬렉션 프레임워크 안에 들어가잇는 기능중 하나
        // al이라하는 arraylist에 추가되는값이 String 데이터 타입 이라는것을 generic을 통해 지정해준것
        al.add("one"); // = arrayobj[0] 과 같은 의미 , ArrayList의 add 메소드는 어떤 데이터형태도 수용할 수 있는 메소드이다.
        al.add("two"); // = arrayobj[1] 과 같은 의미 , one,two,three의 데이터타입이 object 여야한다. object는 모든 데이터 타입의 조상급
        al.add("three"); // = arrayobj[2] 와 같은 의미
        for (int i=0; i<al.size(); i++) {//ArrayList는 length가 아니라 size라는 메소드를 호출
            String value = (String) al.get(i);
            System.out.println(value); //ArrayList는 al.get[i]을 통해 데이터를 가져옴
        }
        // System.out.println(al,get(0)); = one 을 출력
        // System.out.println(al,get(1)); = two 를 출력
        // System.out.println(al,get(2)); = three 를 출력
    }
}