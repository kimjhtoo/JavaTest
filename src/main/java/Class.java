public class Class{
    public static void main(String[] args) {
        int N = 0;
        for (int n = 1; n < 1000; n++) {
            if (n % 3 == 0 || n % 5 == 0) {
                N += n;
            }
        }
        System.out.println(N);
    }
}
