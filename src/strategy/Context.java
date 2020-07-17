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
public class Context {
    private ISort sortStrategy;
    
    public Context(ISort strategy){
            this.sortStrategy = strategy;
    }

    public void executeStrategy(Integer[] array){
            sortStrategy.sort(array);
    }
    
    public String getOutput(){
        return sortStrategy.getOutput();
    }
}
