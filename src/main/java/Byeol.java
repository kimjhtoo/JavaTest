import java.util.Scanner;

public class Byeol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for( int i=0; i<N; i++) {
            for(int j = 0; i>=j; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
