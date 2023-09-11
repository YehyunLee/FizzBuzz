public class Reduce {
    public static void main(String[] args) {
        play(100);
    }

    public static void play(int n) {
        int count = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n = n / 2;
                count += 1;
            }
            else {
                n -= 1;
                count += 1;
            }
        }
        System.out.println(count);
    }
}
