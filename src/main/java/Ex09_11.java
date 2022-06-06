import java.util.Scanner;

public class Ex09_11 {
    public int coffee_machine(int button) { // public 대신 prviate(나만 쓰겟다)도 가능 대신에 cm.coffee_machine에서 에러가남 / 범위가 제한되기 때문에
        System.out.printf("\n# 1.(자동으로) 뜨거운 물을 준비한다 \n");
        System.out.printf("# 2.(자동으로) 종이컵을 준비한다 \n");

        switch (button) {
            case 1:
                System.out.printf("# 3.(자동으로) 보통커피를 탄다 \n");
                break;
            case 2:
                System.out.printf("# 3.(자동으로) 설탕커피를 탄다 \n");
                break;
            case 3:
                System.out.printf("# 3.(자동으로) 블랙커피를 탄다 \n");
                break;
            default:
                System.out.printf("# 3.(자동으로) 아무거나 탄다 \n");
                break;
        }

        System.out.printf("# 4.(자동으로) 물을 붓는다 \n");
        System.out.printf("# 5.(자동으로) 스푼으로 저어서 녹인다\n\n");

        return 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int coffee;
        int ret;

        System.out.println("어떤 커피를 드릴까요? (1: 보통 , 2:설탕 , 3:블랙)");
        coffee = s.nextInt();

        CoffeeMachine cm = new CoffeeMachine();
        cm.coffee_machine(coffee);
        System.out.println("손님~ 커피 여기 있습니다. \n");
    }
}
