/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oleksandr_lukash.java.sort;

import java.util.Scanner;

/**
 *
 * @author Oleksandr_Lukash
 */
public class SortingRunner {
    
    private int[] numbersCopy;
    private Sorting randomSort;
    private Sorting inputSort;
    public static final int MAX_ARRAY_LENGTH = 30; 
    
    public static void main(String[]  args){
        SortingRunner srr = new SortingRunner();
        srr.start();
    }
    
    public void start(){
        randomSort = new Sorting();
        numbersCopy = new int[randomSort.getNumbers().length];
        System.arraycopy(randomSort.getNumbers(), 0, numbersCopy, 0, numbersCopy.length);
        
        System.out.println("Before bubble sort: ");
        randomSort.output();
        randomSort.bubbleSort();
        System.out.println("After bubble sort: ");
        randomSort.output();
        
        randomSort = new Sorting(numbersCopy); //restore random generated array
        System.out.println("Before selection sort: ");
        randomSort.output();
        randomSort.selectSort();
        System.out.println("After selection sort: ");
        randomSort.output();
        
        int[] input = enterArray();
        inputSort = new Sorting(input);
        System.out.println("Before bubble sort: ");
        inputSort.output();
        inputSort.bubbleSort();
        System.out.println("After bubble sort: ");
        inputSort.output();
        
        inputSort = new Sorting(input);
        System.out.println("Before selection sort: ");
        inputSort.output();
        inputSort.selectSort();
        System.out.println("After selection sort: ");
        inputSort.output();
    }
    
    int [] enterArray(){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter an array size (n <= " + MAX_ARRAY_LENGTH + "): ");
        while(true){
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n < 1 || n > MAX_ARRAY_LENGTH)
                    throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("Enter a proper array size.");
            }
        }
        int[] input = new int[n];
        System.out.println("Fill the array by integer values:\n"
                + "*(Press <Return> to input each value) ");
        for (int i = 0; i < n; i++){
            while(true){
            try {
                input[i] = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Incorrect value: please enter an integer value");
            }
            }
        }
        return input;
    }
}