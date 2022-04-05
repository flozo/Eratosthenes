package de.flozo;

public class Primes {

    public static void printList(int limit) {
        int count = 0;
        // Check all numbers
        for (int i = 0; i <= limit; i++) {
            if (Number.isPrimeSqrtOdd(i)) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("*****");
        System.out.println(count + " prime numbers found.");
    }

    public static void printListOdd(int limit) {
        System.out.println("2");
        int count = 1;
        // check odd numbers only
        for (int i = 3; i <= limit; i += 2) {
            if (Number.isPrimeSqrtOdd(i)) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("*****");
        System.out.println(count + " prime numbers found.");
    }


}
