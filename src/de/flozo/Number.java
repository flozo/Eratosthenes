package de.flozo;

import java.util.ArrayList;

public class Number {

    // Prime check methods

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

    // Divisor methods

    public static boolean isDivisor(int divisorCandidate, int number) {
        return  (number % divisorCandidate == 0);
    }

    // Direct print-out version
    public static void getAllDivisors(int number) {
        System.out.print("Divisors of " + number + ": ");
        int countDivisors = 0;
        if (number > 1) {
//            countDivisors++;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    countDivisors++;
                    System.out.print(i + ", ");
                }
            }
            System.out.println("Found " + countDivisors + " divisors (including 2 trivial divisors).");
        }
    }

    // Direct print-out version
    public static void getNonTrivialDivisors(int number) {
        System.out.print("Non-trivial divisors of " + number + ": ");
        int countDivisors = 0;
        if (number > 1) {
//            countDivisors++;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    countDivisors++;
                    System.out.print(i + ", ");
                }
            }
            System.out.println("Found " + countDivisors + " non-trivial divisors.");
        }
    }



    // ArrayList versions
    public static ArrayList<Integer> getNonTrivialDivisorsList(int number) {
        ArrayList<Integer> divisors = new ArrayList<>();
        int countDivisors = 0;
        if (number > 1) {
            countDivisors++;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    countDivisors++;
                    divisors.add(i);
                }
            }
        }
        return divisors;
    }

    public static ArrayList<Integer> getAllDivisorsList(int number) {
        ArrayList<Integer> divisors = new ArrayList<>();
//        int countDivisors = 0;
        if (number > 1) {
            // Append trivial divisor 1
//            countDivisors++;
            divisors.add(1);
            // Append array of non-trivial divisors
            divisors.addAll(getNonTrivialDivisorsList(number));
            // Append number itself as trivial divisor
            divisors.add(number);
        }
        return divisors;
    }

}
