import java.util.Scanner;

public class ieedan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 2; i<10; i++) {
            System.out.println(N + "*" + i + "=" + (i*N));
            }
        }
    }

