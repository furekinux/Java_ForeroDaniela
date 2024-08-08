/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIP.Good;

/**
 *
 * @author camper
 */
public class LightBulb implements Switchable{

    @Override
    public void turnOn() {
        System.out.println("Luz >:D");
    }

    @Override
    public void turnOff() {
        System.out.println("No luz :C");
    }
    
}
