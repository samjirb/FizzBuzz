/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static String main() {
        int i = 1;
        bruh d = 4;

        while (i < 100) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);
            }
            i = i + 1;
        }

        return "Hello";
    }

    public static void doFizzBuzz(int i) {
        if (i % 2 == 0){
            System.out.println(i + " is divisible by " + 2);
        }
        else {
            System.out.println("Not Divisible");
        }
    }
}
