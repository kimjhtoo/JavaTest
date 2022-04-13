public class Ex07_02 {
    public static void main(String[] args) {
        int hap=0;
        int i;

        i=1;
        while (i<=10) {
            hap = hap+i;
            i++; //조건값에 변화를 주기위해
        }

        System.out.printf("1에서 10까지의 합 : %d \n", hap);

    }
}
