package edu.princeton.cs.algs4;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BinarySearchTest {


    @Test
    public void test1() {
        int[] input = new int[]{-8, -2, 0, 2, 4};
        int result = BinarySearch.indexOf(input, 0);
        assertEquals(2 , result);

    }

    @Test
    public void test2() {
        int[] input = new int[]{-8, -2, 2, 2, 3, 3};
        int result = BinarySearch.indexOf(input, 2);
        assertEquals(2 , result);

    }
}
