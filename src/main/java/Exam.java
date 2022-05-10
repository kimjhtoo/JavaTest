public class Exam {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 50; i < 101; i++) {
            if (i % 3 == 0) {
            } else if (i % 7 == 0) {
            } else if (i % 11 == 0) {
            } else {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
