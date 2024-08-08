/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIP.Good;

/**
 *
 * @author camper
 */
public class Switch{
    private Switchable device;
    
    public Switch(Switchable device){
        this.device = device;
    }
    
    public void operate(){
        device.turnOn();
    }
}
