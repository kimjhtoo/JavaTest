import java.util.Scanner;

public class Star3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i =1; i<=N; i++) {
            for (int j=N; j>0; j--) {
                if (i<j) {
                    System.out.printf(" ");
                }else{
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }
}
