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
public class SortingTest {
    
    private static int[] input;
    private static int[] input2;
    private static int[] input3;
    private static int[] input4;
    private static int[] input5;
    private static int[] input6;
    private static int[] input7;
    
    @Before
    public void setUp() {
        input = new int[]{23, 0, -5, 0, -8, 0, 25, 25, 2, 1};
        input2 = new int[]{-67, -5, -2, 0, 3, 3, 4, 5, 120};
        input3 = new int[]{120, 5, 4, 3, 3, 0, -2, -5, -67};
        input4 = new int[0];
        input5 = null;
        input6 = new int[]{0};
        input7 = new int[]{1, -2};
    }

    /**
     * Test of selectSort method, of class Sorting.
     */
    @Test
    public void testSelectSort() {
        int[] expResult = new int[]{-8, -5, 0, 0, 0, 1, 2, 23, 25, 25};
        Sorting instance = new Sorting(input);
        assertArrayEquals(expResult, instance.selectSort());
        
        expResult = new int[]{-67, -5, -2, 0, 3, 3, 4, 5, 120};
        instance = new Sorting(input2);
        assertArrayEquals(expResult, instance.selectSort());
        
        expResult = new int[]{-67, -5, -2, 0, 3, 3, 4, 5, 120};
        instance = new Sorting(input3);
        assertArrayEquals(expResult, instance.selectSort());
        
        expResult = new int[0];
        instance = new Sorting(input4);
        assertArrayEquals(expResult, instance.selectSort());
        
        expResult = new int[]{0};
        instance = new Sorting(input6);
        assertArrayEquals(expResult, instance.selectSort());
        
        expResult = new int[]{-2, 1};
        instance = new Sorting(input7);
        assertArrayEquals(expResult, instance.selectSort());
    }
    
    @Test(expected = NullPointerException.class)
    public void nullTestSelectSort(){
        int[] expResult = null;
        Sorting instance = new Sorting(input5);
        assertArrayEquals(expResult, instance.selectSort());
    }

    /**
     * Test of bubbleSort method, of class Sorting.
     */
    @Test
    public void testBubbleSort() {
        int[] expResult = new int[]{-8, -5, 0, 0, 0, 1, 2, 23, 25, 25};
        Sorting instance = new Sorting(input);
        assertArrayEquals(expResult, instance.bubbleSort());
        
        expResult = new int[]{-67, -5, -2, 0, 3, 3, 4, 5, 120};
        instance = new Sorting(input2);
        assertArrayEquals(expResult, instance.bubbleSort());
        
        expResult = new int[]{-67, -5, -2, 0, 3, 3, 4, 5, 120};
        instance = new Sorting(input3);
        assertArrayEquals(expResult, instance.bubbleSort());
        
        expResult = new int[0];
        instance = new Sorting(input4);
        assertArrayEquals(expResult, instance.bubbleSort());
        
        expResult = new int[]{0};
        instance = new Sorting(input6);
        assertArrayEquals(expResult, instance.bubbleSort());
        
        expResult = new int[]{-2, 1};
        instance = new Sorting(input7);
        assertArrayEquals(expResult, instance.bubbleSort());
    }
    
    @Test(expected = NullPointerException.class)
    public void nullTestBubbleSort(){
        int[] expResult = null;
        Sorting instance = new Sorting(input5);
        assertArrayEquals(expResult, instance.bubbleSort());
    }
}