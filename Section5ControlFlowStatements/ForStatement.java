public class ForStatement {
    public static void main(String[] args) {
        // for(init; termination; increment) {}
        // init = code initialized once at the start of a loop
        // termination = tell the for loop how we want to exit.. has to evaluate to false, then loop will exit
        // increment = invoked after each iteration of the loop
        // for(int i = 0; i < 9; i++) {
        //     // string format to get 2 decimal points only
        //     System.out.println(String.format("%.2f",calculateInterest(10000, i)));
        // }

        // for(int i = 9; i > 0; i--) {
        //     // string format to get 2 decimal points only
        //     System.out.println(String.format("%.2f",calculateInterest(10000, i)));
        // }
        int totalPrimes = 0;

        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                totalPrimes++;
            }
            if (totalPrimes >= 10) {
                break;
            }
        }
        System.out.println("total primes found " + totalPrimes);
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate/100);
    }

    public static boolean isPrime(int n) {
        if (n==1) return false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            };
        };
        return true;
    };



    

}
