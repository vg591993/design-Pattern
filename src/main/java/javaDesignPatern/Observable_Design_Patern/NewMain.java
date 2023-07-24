/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaDesignPatern.Observable_Design_Patern;

/**
 *
 * @author Vikas Gupta
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConcreateSubject sub = new ConcreateSubject();
        
        
        Observer ob1 = new MobileDisplay(sub);
        Observer ob2 = new WallTempDisplay(sub);
        
        sub.addObserver(ob2);
        sub.addObserver(ob1);
        
        sub.setHumidity(15.0f);
        sub.setPressure(10.0f);
        sub.setTemp(5.0f);
        sub.notifyObserver();
        
        
        
        sub.setHumidity(18.0f);
        sub.setPressure(20.0f);
        sub.setTemp(51.0f);
        sub.notifyObserver();
        
        
        sub.setHumidity(23.0f);
        sub.setPressure(96.0f);
        sub.setTemp(63.0f);
        sub.notifyObserver();
        
        

        
    }
    
}
