/**
 * Solve the FizzBuzz challenge.
 */
class WhileFizzBuzz {

    public static void main() {
        int count = 0;
        while (count < 99) {
            count = doFizzBuzz(count);
        }
    }

    public static int doFizzBuzz(int count) {
        count += 1;

        // Find out which numbers divide i.
        boolean divisibleBy3 = count % 3 == 0;
        boolean divisibleBy5 = count % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(count);

        }
        return count;
    }
}
