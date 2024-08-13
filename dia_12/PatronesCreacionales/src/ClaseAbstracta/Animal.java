package ClaseAbstracta;
// CLASE ABSTRACTA: Obliga que las clase hijas se definan el comportamiento
// Método vacion que define que se debe hacer pero no el COMO se hace

public abstract class Animal {
    protected String name;
    
    public Animal(String name){
        this.name=name;
    }
    
    public void sleep(){}
    public void sound(){}
    
}
