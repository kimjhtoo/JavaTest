import java.util.Scanner;

public class Exam0412 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int inc = num;
        int dec = num;

        for (int i =1; i<-(num*2)-1; i++) {
            for(int j =1; j<-inc; j++) {
                if(j < dec) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            if(inc<num) {
                inc++;
                dec--;
            }else{
                inc --;
                dec++;
            }
        }
    }
}
