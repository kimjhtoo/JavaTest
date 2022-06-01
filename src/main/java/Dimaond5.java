public class Dimaond5 {
    public static void main(String[] args) {
        //---------------상단 삼각형 출력-------------------//
        for (int i = 1; i <= 4; i++) { // 위에 줄 총 3줄
            for (int j = 1; j <= 4 - i; j++) { // 공백 2개 > 1개
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) { //별 1개 > 3개 > 5개
                System.out.print("*");
            }
            System.out.println(); //상단 삼각형 개행완료
        }
        //--------------하단 삼각형 출력--------------------//

        for (int i = 3; i > 0; i--) { // 밑에 줄 총 2줄
            for (int j = 3; j >= i; j--) { // 공백 1개 < 2개
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) { // 별 3개 > 1개
                System.out.print("*");
            }
            System.out.println(); // 개행
        }
    }
    // 상단 삼각형과 하단 삼각형을 합쳐서 다이아몬드를 출력//
}
