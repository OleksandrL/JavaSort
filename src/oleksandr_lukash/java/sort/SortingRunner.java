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
    
    private Sorting sort1;
    private Sorting sort2;
    
    public static void main(String[]  args){
        SortingRunner srr = new SortingRunner();
        srr.start();
    }
    
    public void start(){
        sort1 = new Sorting();
        System.out.println("Before bubble sort: ");
        sort1.output();
        sort1.bubbleSort();
        System.out.println("After bubble sort: ");
        sort1.output();
        
        sort1.restoreArray();
        System.out.println("Before selection sort: ");
        sort1.output();
        sort1.selectSort();
        System.out.println("After selection sort: ");
        sort1.output();
        
        int[] input = enterArray();
        sort2 = new Sorting(input);
        System.out.println("Before bubble sort: ");
        sort2.output();
        sort2.bubbleSort();
        System.out.println("After bubble sort: ");
        sort2.output();
        sort2.restoreArray();
        System.out.println("Before selection sort: ");
        sort2.output();
        sort2.selectSort();
        System.out.println("After selection sort: ");
        sort2.output();
    }
    
    int [] enterArray(){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter an array size: ");
        while(true){
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n < 1)
                    throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("Enter a proper size.");
            }
        }
        int[] input = new int[n];
        System.out.println("Fill the array by integer values: ");
        for (int i = 0; i < n; i++){
            while(true){
            try {
                input[i] = Integer.parseInt(sc.next());
                break;
            } catch (Exception e) {
            }
            }
        }
        return input;
    }
}
