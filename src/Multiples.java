public class Multiples {
    public static void main(String[] args) {
        play(10);
    }
    public static void play(int limit) {
        int count = 2;
        int result_count = 0;
        while (count < limit) {
            if (count % 3 == 0) {
                result_count += 1;
            }
            if (count % 5 == 0) {
                result_count += 1;
            }
            count += 1;
        }
        System.out.println(result_count);

    }
}
