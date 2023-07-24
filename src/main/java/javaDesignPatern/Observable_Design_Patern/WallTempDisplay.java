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
public class WallTempDisplay implements Observer, Display{

    float minTemp, avgTemp, maxTemp;
    
    ConcreateSubject concSub;
    
    WallTempDisplay(ConcreateSubject sub){
        this.concSub = sub;
    }
    
    @Override
    public void getDisplay() {
        System.out.println("minTemp: "+this.minTemp+", AvgTemp: "+this.avgTemp+", maxTemp: "+this.maxTemp);
    }

    @Override
    public void update() {
        
        float temp = this.concSub.getTemp();
        this.minTemp = Math.min(this.minTemp, temp);
        this.maxTemp = Math.max(this.maxTemp, temp);
        this.avgTemp = (this.avgTemp+temp)/2;
        getDisplay();
    }

    
}
