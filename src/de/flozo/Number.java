package de.flozo;

public class Number {

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
        // 0 and 1 are not prime
        if (number < 2) {
            return false;
        }
        // Test all numbers > 1 and <= sqrt(number)
        for (int i = 2; i <= (Math.sqrt(number)); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeSqrtOdd(int number) {
        // 0 and 1 are not prime
        if (number < 2) {
            return false;
        }
        // 2 is prime
        if (number == 2) {
            return true;
        }
        // check if 2 is divisor
        if (number % 2 == 0) {
            return false;
        }
        // Test all odd numbers > 2 and <= sqrt(number)
        for (int i = 3; i <= (Math.sqrt(number)); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}
