package de.flozo;

import java.util.ArrayList;

public class Number {

    // Prime check methods

    public static boolean isPrime(long number) {
        // 0 and 1 are not prime
        if (number < 2L) {
            return false;
        }
        // Test all numbers < number
        for (long i = 2L; i < number; i++) {
            if (number % i == 0L) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeHalf(long number) {
        // 0 and 1 are not prime
        if (number < 2) {
            return false;
        }
        // Test all numbers <= number/2
        for (long i = 2; i <= (number / 2); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeSqrt(long number) {
        // 0 and 1 are not prime
        if (number < 2) {
            return false;
        }
        // Test all numbers > 1 and <= sqrt(number)
        for (long i = 2; i <= (Math.sqrt(number)); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeSqrtOdd(long number) {
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
        for (long i = 3; i <= (Math.sqrt(number)); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Divisor methods

    public static boolean isDivisor(long divisorCandidate, long number) {
        return (number % divisorCandidate == 0);
    }

    // Direct print-out version
    public static void getAllDivisors(long number) {
        System.out.print("Divisors of " + number + ": ");
        long countDivisors = 0;
        if (number > 1) {
//            countDivisors++;
            for (long i = 1; i <= number; i++) {
                if (number % i == 0) {
                    countDivisors++;
                    System.out.print(i + ", ");
                }
            }
            System.out.println("Found " + countDivisors + " divisors (including 2 trivial divisors).");
        }
    }

    // Direct print-out version
    public static void getNonTrivialDivisors(long number) {
        System.out.print("Non-trivial divisors of " + number + ": ");
        long countDivisors = 0;
        if (number > 1) {
//            countDivisors++;
            for (long i = 2; i < number; i++) {
                if (number % i == 0) {
                    countDivisors++;
                    System.out.print(i + ", ");
                }
            }
            System.out.println("Found " + countDivisors + " non-trivial divisors.");
        }
    }


    // ArrayList versions
    public static ArrayList<Long> getNonTrivialDivisorsList(long number) {
        ArrayList<Long> divisors = new ArrayList<>();
        long countDivisors = 0;
        if (number > 1) {
            countDivisors++;
            for (long i = 2; i < number; i++) {
                if (number % i == 0) {
                    countDivisors++;
                    divisors.add(i);
                }
            }
        }
        return divisors;
    }

    public static ArrayList<Long> getAllDivisorsList(long number) {
        ArrayList<Long> divisors = new ArrayList<>();
//        int countDivisors = 0;
        if (number > 1) {
            // Append trivial divisor 1
//            countDivisors++;
            divisors.add(1L);
            // Append array of non-trivial divisors
            divisors.addAll(getNonTrivialDivisorsList(number));
            // Append number itself as trivial divisor
            divisors.add(number);
        }
        return divisors;
    }

}
