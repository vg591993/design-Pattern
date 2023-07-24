/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaDesignPatern.Observable_Design_Patern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vikas Gupta
 */
public class ConcreateSubject implements Subject{

    
    private List<Observer> observers = new ArrayList<>();
    
    private float temp = 0;
    private float humidity = 0;
    private float pressure = 0;
    
    @Override
    public void addObserver(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        int index = observers.indexOf(ob);
        if(index > -1){
            observers.remove(ob);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer ob : observers){
            ob.update();
        }
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
    
    
    
    
    
}
