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
public class BubbleSort implements ISort{
    private String ans = "";
    @Override
    public void sort(Integer[] array) {
        int n = array.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (array[j] > array[j+1]) 
                { 
                    // swap array[j+1] and array[i] 
                    int temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp; 
                }
          for (int i=0; i<n; ++i) 
             ans = ans +" " +array[i].toString(); 
    }
    
    public String getOutput(){
        return ans;
    }   
}
