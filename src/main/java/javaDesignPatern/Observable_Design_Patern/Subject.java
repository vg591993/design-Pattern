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
public interface Subject {
    
    
    public void addObserver(Observer ob);
    
    public void removeObserver(Observer ob);
    
    public void notifyObserver();
}
