import java.util.Scanner;

public class Codeup1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b) {
            System.out.printf(String.valueOf(a-b));
        }else if (b>a){
            System.out.printf(String.valueOf(b-a));
        }else{
            System.out.println("");
        }
    }
}