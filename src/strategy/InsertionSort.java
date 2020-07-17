/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Hasini_Madhuwanthi
 */
public class InsertionSort implements ISort {
    private String ans = "";
    @Override
    public void sort(Integer[] array) {
        int n = array.length; 
        for (int i = 1; i < n; ++i) { 
            int key = array[i]; 
            int j = i - 1; 
            /* Move elements of array[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && array[j] > key) { 
                array[j + 1] = array[j]; 
                j = j - 1; 
            } 
            array[j + 1] = key; 
        } 
         for (int i=0; i<n; ++i) 
             ans = ans +" " +array[i].toString(); 
    }

    @Override
    public String getOutput() {
       return ans;
    }
    
}
