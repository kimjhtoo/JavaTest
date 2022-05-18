public class Ex09_01 {
    public static void main(String[] args) {
        String str = ("IT CookBook , Java");
        int len;

        len = str.length();

        System.out.printf("문자열 : %s \n", str);
        System.out.printf("문자열 길이 : %d", len);
        // 공백까지 자리를 포함하여 출력한다.

        /* 값이 있는지 없는지 체크할때
        ex) str 변수에 값이 있는지 없는 지 찾을때

                if(str.length()>0) {
                    System.out.println("str 변수에 값이 존재한다.");
                }else{
                    System.out.println("str 변수에 값이 존재하지 않는다.");
                }*/
    }
}
