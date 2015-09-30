/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oleksandr_lukash.java.sort;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Oleksandr_Lukash
 */
public class Sorting {
    
    private int [] numbers;
    private int [] numbersCopy;
    public final static int ARRAY_SIZE = 20;
    
    public Sorting(){
        numbers = new int[ARRAY_SIZE];
        numbersCopy = new int[numbers.length];
        Random rnd = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rnd.nextInt();
        }
        System.arraycopy(numbers, 0, numbersCopy, 0, numbers.length);
    }
    
    public Sorting(int [] input){
        numbers = new int[input.length];
        numbersCopy = new int[numbers.length];
        System.arraycopy(input, 0, numbers, 0, input.length);
        System.arraycopy(input, 0, numbersCopy, 0, input.length);
    }
    
    int[] selectSort(){
        for (int i = 0; i < numbers.length-1; i++){
            int min = i;
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[min] > numbers[j]){
                    min = j;
                }
            }
            int swapper = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = swapper;
        }
        return numbers;
    }
    
    int[] bubbleSort(){
        for (int i = 0; i < numbers.length; i++)
            for (int j = numbers.length-1; j > i; j--){
                if (numbers[j] < numbers[j-1]){
                    int swapper = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = swapper;
                }
            }
        return numbers;
    }
    
    void restoreArray(){
        System.arraycopy(numbersCopy, 0, numbers, 0, numbers.length);
    }
    
    void output (){
        System.out.println(Arrays.toString(numbers));
    }
}