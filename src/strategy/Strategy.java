/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Hasini_Madhuwanthi
 */
public class Strategy {
    private String sortType;
    private String ans;
    private Context contextSort;
    private long startTime;
    private long stopTime;
    public Strategy(String sortType) {
        this.sortType = sortType;
    }   
    public String getAnswer(Integer[] array){
         this.startTime = System.nanoTime(); 
         if(this.sortType.equals("Bubble")){
                this.contextSort  = new Context(new BubbleSort());           
          }
          else if(this.sortType.equals("Insertion")){
                 this.contextSort = new Context(new InsertionSort());
          }
          else if(this.sortType.equals("Selection")){
                 this.contextSort = new Context(new SelectionSort());
          }      
          this.contextSort.executeStrategy(array);
          this.ans = contextSort.getOutput();
          this.stopTime = System.nanoTime();
          return ans;
    }  
    public String getTime(){
        long convert = TimeUnit.MILLISECONDS.convert((stopTime - startTime), TimeUnit.NANOSECONDS);
        return Long.toString(convert); 
    } 
}
