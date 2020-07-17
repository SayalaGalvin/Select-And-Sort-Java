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
public class SelectionSort implements ISort {
        private String ans = "";
    @Override
    public void sort(Integer[] array) {
       int n = array.length; 
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (array[j] < array[min_idx]) 
                    min_idx = j; 
            // Swap the found minimum element with the first element 
            int temp = array[min_idx]; 
            array[min_idx] = array[i]; 
            array[i] = temp; 
        }
         for (int i=0; i<n; ++i) 
             ans = ans +"  "+array[i].toString(); 
    }
    @Override
    public String getOutput() {
        return ans;
    }
}
