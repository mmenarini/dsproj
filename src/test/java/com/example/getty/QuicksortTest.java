package com.example.getty;

import junit.framework.TestCase;

import static com.example.getty.Quicksort.randInt;

public class QuicksortTest extends TestCase {

    private Quicksort sort;

    protected void setUp() {
        sort = new Quicksort();
    }

    public void testQuicksort() {
        final int NUM_TESTS = 1000;
        for (int i = 1; i <= NUM_TESTS; i++) {

            int[] array = new int[i];
            for (int j = 0; j < i; j++) array[j] = randInt(-1000000, +1000000);
            int[] arrayCopy = array.clone();

            sort.quicksort(array);
            java.util.Arrays.sort(arrayCopy);

            // if (!java.util.Arrays.equals(array, arrayCopy)) System.out.println("ERROR");
        }
    }
}
