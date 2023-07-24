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
public class MobileDisplay implements Observer, Display{

    private float temp, presure, humidity;
    ConcreateSubject concSub;
    
    MobileDisplay(ConcreateSubject sub){
        this.concSub = sub;
    }
    
    @Override
    public void getDisplay() {
        System.out.println("Temp: "+this.temp+", Presure: "+this.presure+", Humidity: "+this.humidity);
    }

    @Override
    public void update() {
        this.humidity = concSub.getHumidity();
        this.presure = concSub.getPressure();
        this.temp = concSub.getTemp();
        this.getDisplay();
    }
    
}
