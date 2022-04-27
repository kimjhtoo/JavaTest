import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        for (int i = 1; i < n + 1; i++) {
            if (i % 2 != 0) {
                a *= i;
            }
        }
        System.out.println(a);
    }
}
//1부터 입력받은 정수까지의 곱 홀수만 곱한 값을 구하는 소스코드