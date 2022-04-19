package de.flozo;


public class Main {

    public static void main(String[] args) {

//        int limit = 100_000_000;
        int limit = 100000000;
        // Save timestamp at start
        long startTime = System.currentTimeMillis();
        Primes.printList6k(limit);
        Number.getAllDivisors(limit);
        Number.getNonTrivialDivisors(limit);
        System.out.println("=====");
        System.out.println(Number.getNonTrivialDivisorsList(limit));
        System.out.println("=====");
        System.out.println(Number.getAllDivisorsList(limit));
        System.out.println("=====");
        // Save timestamp at the end
        long endTime = System.currentTimeMillis();
        long siftingTimeMilliseconds = (endTime -startTime);
        String durationString = duration(siftingTimeMilliseconds);
        System.out.println("Sifting time was " + siftingTimeMilliseconds + " ms = " + durationString + " (hh:mm:ss.f)");

    }


    public static String duration(long milliseconds) {
        int ms = (int) milliseconds % 1000;
        int s = (int) (milliseconds / 1000) % 60;
        int m = (int) (milliseconds / 60000) % 60;
        int h = (int) milliseconds / 3600000;
        return String.format("%02d:%02d:%02d.%02d", h, m, s, ms);
    }

}
