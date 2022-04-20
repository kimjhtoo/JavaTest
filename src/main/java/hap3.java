import java.util.Scanner;

public class hap3 {
    public static void main(String arg[]) {
        int a = 0, i;

        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                a = i;
                System.out.println(a);
            }
        }
    }
}
