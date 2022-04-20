import java.util.Scanner;

public class Star5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 중앙 별 갯수
        int k=0; //별을 찍는 횟수

        for (int i =0; i<2*n; i++) {
            if (i<n) {
                k++;
            }else{
                k--;
            }
            for(int j=0; j<k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
