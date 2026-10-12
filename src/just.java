public class just{
    public static void main(String[] args) {

        // Loop through numbers from 2 to 100
        for (int num = 2; num <= 100; num++) {

            // Assume the number is prime
            boolean isPrime = true;

            // Check if num is divisible by any number from 2 up to num - 1
            for (int i = 2; i < num; i++) {

                // If num is divisible by i, it is not prime
                if (num % i == 0) {
                    isPrime = false;

                    // Stop checking because we already know it is not prime
                    break;
                }
            }

            // If isPrime is still true, print the number
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
