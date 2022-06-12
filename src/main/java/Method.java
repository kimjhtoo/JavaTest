public class Method {
    public static int sum(int i1, int i2) {
        // public = 접근 지정자 (모든 자바 클래스에서 사용할수있게 접근을 허용)
        // static = 함수단위로 메모리에 올리고 싶을때 사용 , 객체를 생성하지않고 실행가능
        /* void = 리턴타입이없는경우 사용 , 있는경우에는 데이터타입에 맞춰 함수사용(String,int,char 등등
        void를 사용안하는경우는 반드시 마무리에 return함수를 써야함 */
        //( int1, inti2) = int변수에 int타입을 받아서 파라미터를 정의 (받아야될 인자값 , 파라미터값
        // { = 실제로 실행된 내용을 중괄호로 표시

        int sum = 0;
        for (int i = i1; i < i2; i++) {
            sum += i;

        }
    return sum; }
}

