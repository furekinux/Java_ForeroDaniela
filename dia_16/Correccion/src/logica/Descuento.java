package logica;

public enum Descuento {
    BASICO(0.11),
    PLATINO(0.15),
    DIAMANTE(0.18);
    
    private double descuento;
    
    private Descuento(double descuento){
        this.descuento = descuento;
    }
    
    public double getValorDescontado(double monto){
        return this.descuento * monto;
    }
}
