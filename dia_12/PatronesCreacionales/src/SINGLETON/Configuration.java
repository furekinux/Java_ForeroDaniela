/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SINGLETON;

/**
 *
 * @author camper
 */
public class Configuration {
    private static Configuration instance;
    private String configValue;
    
    private Configuration(){
        configValue = "Valor por defecto";
    }
    
    public static synchronized Configuration getInstance(){
        if(instance == null){
            instance = new Configuration();
        }
        return instance;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }
    
    public String getConfigValue() {
        return configValue;
    }
    
}
