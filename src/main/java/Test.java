public class Test {
    public static void main(String[] args) {
        int sum =0;

        for ( int i =50; i<101; i++) {
            if(i%3==0 || i%7==0 || i%11==0) {
                sum+=i;
                System.out. print(sum);
            }
        }
    }
}