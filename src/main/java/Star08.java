import java.util.Scanner;

public class Star08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputNum = scan.nextInt();

        int inc = inputNum;
        int dec = inputNum;

        for(int i = 1; i <= (inputNum*2)-1; i++){
            for(int j = 1; j <= inc; j++){
                if(j < dec){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            if(i < inputNum){
                inc++;
                dec--;
            } else {
                inc--;
                dec++;
            }
        }
    }
}
