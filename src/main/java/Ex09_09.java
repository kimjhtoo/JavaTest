public class Ex09_09 {
    public static void main(String[] args) {
        String str1 = "Java Prograaming";
        String str2 = "Java Prograaming";
        String str3 = new String("Java Prograaming");

        System.out.println("원 문자열1 ==> [" + str1 + "]");
        System.out.println("원 문자열2 ==> [" + str2 + "]");
        System.out.println("원 문자열3 ==> [" + str3 + "]\n");

        System.out.println("문자열1 == 문자열2 결과 :\t " + (str1 == str2));
        System.out.println("문자열1.equals(문자열2) 결과 : " + (str1.equals(str2)));
        System.out.println("문자열1 == 문자열3 결과 :\t " + (str1 == str3));
        System.out.println("문자열1.equals(문자열3) 결과 : " + (str1.equals(str3)));

        System.out.println("문자열 1과 문자열2가 다른지 비교 compareTo 안씀 : " + !str1.equals(str2));
    }
}
