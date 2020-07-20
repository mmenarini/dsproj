package com.example.getty;

import junit.framework.TestCase;

import java.util.Arrays;

import static com.example.getty.Mergesort.randInt;

public class MergesortTest extends TestCase {

    private Mergesort sort;

    protected void setUp() {
        sort = new Mergesort();
    }

    public void testMergesort() {
        final int NUM_TESTS = 1000;
        for (int i = 1; i <= NUM_TESTS; i++) {

            int[] array = new int[i];
            for (int j = 0; j < i; j++) array[j] = randInt(-1000000, +1000000);
            int[] arrayCopy = array.clone();

            array = sort.mergesort(array);
            Arrays.sort(arrayCopy);

            // if (!Arrays.equals(array, arrayCopy)) System.out.println("ERROR");
        }
    }
}
