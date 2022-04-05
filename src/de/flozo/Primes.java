package de.flozo;

public class Primes {

    public static void printList(int limit) {
        int count = 0;
        for (int i = 0; i <= limit; i++) {
            if (Number.isPrimeSqrtOdd(i)) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("*****");
        System.out.println(count + " prime numbers found.");

    }

}
