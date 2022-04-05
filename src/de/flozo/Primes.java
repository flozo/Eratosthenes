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

    public static void printList6k(int limit) {
        int count = 0;
        if (limit >= 2) {
            count++;
            System.out.println("2");
        }
        if (limit >= 3) {
            count++;
            System.out.println("3");
        }
        int methodLimit = (limit + 1) / 6 + 1;
        // check numbers of form 6*k+-1 only
        for (int i = 1; i < methodLimit; i++) {
            // define number pair
            int class1 = 6 * i - 1;
            int class2 = 6 * i + 1;
            // check first number
            if (Number.isPrimeSqrtOdd(class1)) {
                count++;
                System.out.println(class1);
            }
            // check second number if <= limit
            if ((class2 <= limit) && (Number.isPrimeSqrtOdd(class2))) {
                count++;
                System.out.println(class2);
            }
        }
        System.out.println("*****");
        System.out.println(count + " prime numbers found.");
    }

}
