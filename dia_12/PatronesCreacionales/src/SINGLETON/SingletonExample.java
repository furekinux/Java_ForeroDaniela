package SINGLETON;

public class SingletonExample {
    // Definición: es un patrón que asegura que una clase tenga una ÚNICA instancia
    public static void main(String[] args) {
        Configuration config1 = Configuration.getInstance();
        Configuration config2 = Configuration.getInstance();
        
        System.out.println("config1 "+config1.getConfigValue());
        config1.setConfigValue("Nueva Configuracion");
        System.out.println(config2.getConfigValue());

    }
    
}
