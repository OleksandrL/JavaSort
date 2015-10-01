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
    public final static int ARRAY_SIZE = 20;
    
    public Sorting(){
        numbers = new int[ARRAY_SIZE];
        Random rnd = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rnd.nextInt();
        }
    }
    
    public Sorting(int [] input){
        numbers = new int[input.length];
        System.arraycopy(input, 0, numbers, 0, input.length);
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
    
    /*Returns increment array for ShellSort() method*/
    private int increment(int inc[], int size){
        int p1, p2, p3;
        int  s;
        p1 = p2 = p3 = 1;
        s = -1;
        do {
            if ((++s % 2)>0){
                inc[s] = 8*p1 - 6*p2 + 1;
            }
            else {
                inc[s] = 9*p1 - 9*p3 + 1;
                p2 *= 2;
                p3 *= 2;
            }
            p1 *= 2;
        }while(3*inc[s] < size);
        return (s > 0) ? --s : 0;
    }
    
    int[] ShellSort() {
        int inc, i, j;
        int[]seq = new int[40];
        int s;
        s = increment(seq, numbers.length);
        while (s >= 0) {
            inc = seq[s--];
            for (i = inc; i < numbers.length; i++) {
                int temp = numbers[i];
                for (j = i-inc; (j >= 0) && (numbers[j] > temp); j -= inc){
                    numbers[j+inc] = numbers[j];
                }
                numbers[j+inc] = temp;
                }
            }
        return numbers;
    }
    
    int[] getNumbers(){
        return numbers;
    }
    
    void output (){
        System.out.println(Arrays.toString(numbers));
    }
}