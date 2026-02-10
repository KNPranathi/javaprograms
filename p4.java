public class PrimeCheck {

    // Method to check prime
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int num1 = 19;
        int num2 = 49;

        if (isPrime(num1)) {
            System.out.println(num1 + " is a Prime Number");
        } else {
            System.out.println(num1 + " is Not a Prime Number");
        }

        if (isPrime(num2)) {
            System.out.println(num2 + " is a Prime Number");
        } else {
            System.out.println(num2 + " is Not a Prime Number");
        }
    }
}
