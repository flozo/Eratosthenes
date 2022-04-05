package de.flozo;


public class Main {

    public static void main(String[] args) {

//        int limit = 100_000_000;
        int limit = 12;
        // Save timestamp at start
        long startTime = System.nanoTime();
        Primes.printList6k(limit);
        Number.getAllDivisors(limit);
        Number.getNonTrivialDivisors(limit);
        // Save timestamp at the end
        long endTime = System.nanoTime();
        long milliseconds = (endTime - startTime) / 1000000;
        String durationString = duration(milliseconds);
        System.out.println("Sifting time was " + milliseconds + " ms = " + durationString + " (hh:mm:ss.f)");

//        System.out.println(duration(8128248));
    }


    public static String duration(long milliseconds) {
        int ms = (int) milliseconds % 1000;
        int s = (int) (milliseconds / 1000) % 60;
        int m = (int) (milliseconds / 60000) % 60;
        int h = (int) milliseconds / 3600000;
        return String.format("%02d:%02d:%02d.%02d", h, m, s, ms);
    }

}
