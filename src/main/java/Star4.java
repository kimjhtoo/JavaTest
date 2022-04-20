import java.util.Scanner;

public class Star4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();

        for (int i= N; i>0; i--) {
            for( int j = N; j>0; j--) {
                if (i<j) {
                    System.out.print(" ");
                }else{
                    System.out.println("*");
                }
            }
        }
    }
}
