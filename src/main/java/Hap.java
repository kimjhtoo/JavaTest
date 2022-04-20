import java.util.Scanner;

public class Hap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 임의로 수를 줫을때 변수값의 합
        int hap = 0;
        int i;
        int num;

        System.out.printf("값 입력"); {
            num = sc.nextInt();

            for (i = 1; i <= num; i++)
                hap = hap + i;
        }
        System.out.printf("1 에서 %d까지의 합 : %d \n" , num , hap);
    }
}

