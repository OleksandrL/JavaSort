/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oleksandr_lukash.java.sort;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oleksandr_Lukash
 */
public class SortingPositiveTest {
    
    private static int[] unsortedArray;
    private static int[] alreadySortedArray;
    private static int[] reverseSortedArray;
    private static int[] arrayWithOneElement;
    private static int[] arrayWithConstant;
    
    @Before
    public void setUp() {
        unsortedArray = new int[]{23, 0, -5, 0, -8, 0, 25, 25, 2, 1};
        alreadySortedArray = new int[]{-67, -5, -2, 0, 3, 3, 4, 5, 120};
        reverseSortedArray = new int[]{120, 5, 4, 3, 3, 0, -2, -5, -67};
        arrayWithOneElement = new int[]{0};
        arrayWithConstant = new int[]{2, 2, 2, 2, 2};
    }

    /**
     * Test of selectSort method, of class Sorting.
     */
    @Test
    public void testSelectSort() {
        int[] expResult = new int[]{-8, -5, 0, 0, 0, 1, 2, 23, 25, 25};
        Sorting instance = new Sorting(unsortedArray);
        assertArrayEquals(expResult, instance.selectSort());
        
        expResult = new int[]{-67, -5, -2, 0, 3, 3, 4, 5, 120};
        instance = new Sorting(alreadySortedArray);
        assertArrayEquals(expResult, instance.selectSort());
        
        expResult = new int[]{-67, -5, -2, 0, 3, 3, 4, 5, 120};
        instance = new Sorting(reverseSortedArray);
        assertArrayEquals(expResult, instance.selectSort());
        
        expResult = new int[]{0};
        instance = new Sorting(arrayWithOneElement);
        assertArrayEquals(expResult, instance.selectSort());
        
        expResult = new int[]{2, 2, 2, 2, 2};
        instance = new Sorting(arrayWithConstant);
        assertArrayEquals(expResult, instance.selectSort());
    }

    /**
     * Test of bubbleSort method, of class Sorting.
     */
    @Test
    public void testBubbleSort() {
        int[] expResult = new int[]{-8, -5, 0, 0, 0, 1, 2, 23, 25, 25};
        Sorting instance = new Sorting(unsortedArray);
        assertArrayEquals(expResult, instance.bubbleSort());
        
        expResult = new int[]{-67, -5, -2, 0, 3, 3, 4, 5, 120};
        instance = new Sorting(alreadySortedArray);
        assertArrayEquals(expResult, instance.bubbleSort());
        
        expResult = new int[]{-67, -5, -2, 0, 3, 3, 4, 5, 120};
        instance = new Sorting(reverseSortedArray);
        assertArrayEquals(expResult, instance.bubbleSort());
        
        expResult = new int[]{0};
        instance = new Sorting(arrayWithOneElement);
        assertArrayEquals(expResult, instance.bubbleSort());
        
        expResult = new int[]{2, 2, 2, 2, 2};
        instance = new Sorting(arrayWithConstant);
        assertArrayEquals(expResult, instance.bubbleSort());
    }

    /**
     * Test of ShellSort method, of class Sorting.
     */
    @Test
    public void testShellSort() {
        int[] expResult = new int[]{-8, -5, 0, 0, 0, 1, 2, 23, 25, 25};
        Sorting instance = new Sorting(unsortedArray);
        assertArrayEquals(expResult, instance.ShellSort());
        
        expResult = new int[]{-67, -5, -2, 0, 3, 3, 4, 5, 120};
        instance = new Sorting(alreadySortedArray);
        assertArrayEquals(expResult, instance.ShellSort());
        
        expResult = new int[]{-67, -5, -2, 0, 3, 3, 4, 5, 120};
        instance = new Sorting(reverseSortedArray);
        assertArrayEquals(expResult, instance.ShellSort());
        
        expResult = new int[]{0};
        instance = new Sorting(arrayWithOneElement);
        assertArrayEquals(expResult, instance.ShellSort());
        
        expResult = new int[]{2, 2, 2, 2, 2};
        instance = new Sorting(arrayWithConstant);
        assertArrayEquals(expResult, instance.ShellSort());
    }
}
