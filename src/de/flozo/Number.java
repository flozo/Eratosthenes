package de.flozo;

public class Number {

    private int number;
//    private boolean odd;
//    private int numberOfDivisors;
//    private boolean prime;
//
//    public Number(int number) {
//        this.number = Math.max(number, 0);
////        this.numberOfDivisors = numberOfDivisors;
//    }


    public static boolean isOdd(int number) {
        return (number % 2 != 0);
    }

    public static boolean isPrime(int number) {
        if ((number == 0) || (number == 1)) {
            return false;
        }
        // Test all numbers < number
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static boolean isPrimeHalf(int number) {
        if ((number == 0) || (number == 1)) {
            return false;
        }
        // Test all numbers <= number/2
        for (int i = 2; i <= (number / 2) ; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeSqrt(int number) {
        if ((number == 0) || (number == 1)) {
            return false;
        }
        // Test all numbers <= number/2
        for (int i = 2; i <= (Math.sqrt(number)) ; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}
