public class CoffeeMachine {

    int coffee_machine(int button) {
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
}
