/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oleksandr_lukash.java.sort;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Oleksandr_Lukash
 */
public class SortingNegativeTest {
    
    private static int[] emptyArray;
    private static int[] notInitializedArray;
    
    @Before
    public void setUp() {
        emptyArray = new int[0];
        notInitializedArray = null;
    }
    /**
     * Test of selectSort method, of class Sorting.
     */
    @Test
    public void testNegativeSelectSort() {
        
        int[]expResult = new int[0];
        Sorting instance = new Sorting(emptyArray);
        assertArrayEquals(expResult, instance.selectSort());
    }
    
    @Test(expected = NullPointerException.class)
    public void nullTestSelectSort(){
        int[] expResult = null;
        Sorting instance = new Sorting(notInitializedArray);
        assertArrayEquals(expResult, instance.selectSort());
    }
    
    /**
     * Test of bubbleSort method, of class Sorting.
     */
    @Test
    public void testNegativeBubbleSort() {
        
        int[]expResult = new int[0];
        Sorting instance = new Sorting(emptyArray);
        assertArrayEquals(expResult, instance.bubbleSort());
    }
    
    @Test(expected = NullPointerException.class)
    public void nullTestBubbleSort(){
        int[] expResult = null;
        Sorting instance = new Sorting(notInitializedArray);
        assertArrayEquals(expResult, instance.bubbleSort());
    }
    
     /**
     * Test of ShellSort method, of class Sorting.
     */
    @Test
    public void testNegativeShellSort() {
        
        int[]expResult = new int[0];
        Sorting instance = new Sorting(emptyArray);
        assertArrayEquals(expResult, instance.ShellSort());
    }
    
    @Test(expected = NullPointerException.class)
    public void nullTestShellSort(){
        int[] expResult = null;
        Sorting instance = new Sorting(notInitializedArray);
        assertArrayEquals(expResult, instance.ShellSort());
    }
}
