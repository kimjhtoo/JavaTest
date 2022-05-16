public class Pyramid2 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) { //출력할 줄의 갯수 (5줄)
            for( int j =i; j<=4; j++) {
                System.out.print(" "); // 공백의 갯수 4>3>2>1
            }
            for (int j=1; j<=(i*2-1); j++) { // 1,3,5순서로 출력해야하기때문에
                System.out.print("*"); // 별의 갯수 1>3>5>7>9
            }
            System.out.println(); // 총 5번을 개행한다.
        }
    }
}
