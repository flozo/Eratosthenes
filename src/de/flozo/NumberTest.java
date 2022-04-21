package de.flozo;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    private final long[] primeNumbers100 = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
            43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    private final long[] bigPrimeNumbers = {991429L, 492366587L};
    private final long[] reallyBigPrimeNumbers = {188748146801L, 7596952219L, 32212254719L}; // only for optimized algorithms
    private final long[] compositeNumbers = {4, 6, 8, 10, 12, 15, 27, 99, 360, 1234567890};
    private final long[] otherNonPrimeNumbers = {0, 1};

    @org.junit.jupiter.api.Test
    void isPrime_100() {
        for (long j : primeNumbers100) {
            assertTrue(Number.isPrime(j), j + " expected to be prime!");
        }
    }

    @org.junit.jupiter.api.Test
    void isPrime_big() {
        for (long j : bigPrimeNumbers) {
            assertTrue(Number.isPrime(j), j + " expected to be prime!");
        }
    }

    @org.junit.jupiter.api.Test
    void isPrime_composite() {
        for (long j : compositeNumbers) {
            assertFalse(Number.isPrime(j), j + " expected to be non-prime!");
        }
    }

    @org.junit.jupiter.api.Test
    void isPrime_other() {
        for (long j : otherNonPrimeNumbers) {
            assertFalse(Number.isPrime(j), j + " expected to be non-prime!");
        }
    }

    @org.junit.jupiter.api.Test
    void isPrimeHalf_100() {
        for (long j : primeNumbers100) {
            assertTrue(Number.isPrimeHalf(j), j + " expected to be prime!");
        }
    }

    @org.junit.jupiter.api.Test
    void isPrimeHalf_big() {
        for (long j : bigPrimeNumbers) {
            assertTrue(Number.isPrimeHalf(j), j + " expected to be prime!");
        }
    }

    @org.junit.jupiter.api.Test
    void isPrimeSqrt_100() {
        for (long j : primeNumbers100) {
            assertTrue(Number.isPrimeSqrt(j), j + " expected to be prime!");
        }
    }

    @org.junit.jupiter.api.Test
    void isPrimeSqrt_big() {
        for (long j : bigPrimeNumbers) {
            assertTrue(Number.isPrimeSqrt(j), j + " expected to be prime!");
        }
    }

    @org.junit.jupiter.api.Test
    void isPrimeSqrt_reallyBig() {
        for (long j : reallyBigPrimeNumbers) {
            assertTrue(Number.isPrimeSqrt(j), j + " expected to be prime!");
        }
    }

    @org.junit.jupiter.api.Test
    void isPrimeSqrtOdd_100() {
        for (long j : primeNumbers100) {
            assertTrue(Number.isPrimeSqrtOdd(j), j + " expected to be prime!");
        }
    }

    @org.junit.jupiter.api.Test
    void isPrimeSqrtOdd_big() {
        for (long j : bigPrimeNumbers) {
            assertTrue(Number.isPrimeSqrtOdd(j), j + " expected to be prime!");
        }
    }

    @org.junit.jupiter.api.Test
    void isPrimeSqrtOdd_reallyBig() {
        for (long j : reallyBigPrimeNumbers) {
            assertTrue(Number.isPrimeSqrtOdd(j), j + " expected to be prime!");
        }
    }

//    @org.junit.jupiter.api.Test
//    void isDivisor() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void getAllDivisors_12() {
//        long[] divisors12 = {1, 2, 3, 4, 6, 12};
//        long[] divisors360 = {1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 18, 20, 24, 30, 36, 40,
//                45, 60, 72, 90, 120, 180, 360};
//        long[] divisors1000 = {1, 2, 4, 5, 8, 10, 20, 25, 40, 50, 100, 125, 200, 250, 500,
//                1000};
//    }
//
//    @org.junit.jupiter.api.Test
//    void getNonTrivialDivisors() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void getNonTrivialDivisorsList() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void getAllDivisorsList() {
//    }
}
