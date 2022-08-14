package de.flozo;


public class Main {

    public static void main(String[] args) {

//        int limit = 100_000_000;
        int limit = 10_000_000;
        // Save timestamp at start
        long startTime = System.currentTimeMillis();
        sift(limit, SiftingAlgorithm.SIX_K);
//        Number.getAllDivisors(limit);
//        Number.getNonTrivialDivisors(limit);
//        System.out.println("=====");
//        System.out.println(Number.getNonTrivialDivisorsList(limit));
//        System.out.println("=====");
//        System.out.println(Number.getAllDivisorsList(limit));
//        System.out.println("=====");
        // Save timestamp at the end
        long endTime = System.currentTimeMillis();
        long siftingTimeMilliseconds = (endTime - startTime);
        String durationString = duration(siftingTimeMilliseconds);
        System.out.println("Sifting time was " + siftingTimeMilliseconds + " ms = " + durationString + " (hh:mm:ss.f)");

    }

    public static void sift(int limit, SiftingAlgorithm siftingAlgorithm) {
        switch (siftingAlgorithm) {
            case ALL:
                Primes.printList(limit);
                break;
            case ODD:
                Primes.printListOdd(limit);
                break;
            case SIX_K:
                Primes.printList6k(limit);
        }
    }

    public static String duration(long milliseconds) {
        long ms = milliseconds % 1000;
        long s = (milliseconds / 1000) % 60;
        long m = (milliseconds / 60000) % 60;
        long h = milliseconds / 3600000;
        return String.format("%02d:%02d:%02d.%02d", h, m, s, ms);
    }

}
