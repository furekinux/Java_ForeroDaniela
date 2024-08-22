package logica;

public abstract class Tarjeta {
    private String numeroDeCuenta;
    private double valorApertura;
    private String mes;

    public Tarjeta(String numeroDeCuenta, double valorApertura, String mes){
        this.numeroDeCuenta=numeroDeCuenta;
        this.valorApertura=valorApertura;
        this.mes = mes;
    }

    public abstract double cuotaDeManejo();
    
    @Override
    public String toString(){
        return numeroDeCuenta+";"+cuotaDeManejo()+";"+this.getClass().getSimpleName()+";"+mes;
    }
    
    public String info(){
        return "El valor de la cuota de la Cuenta: "+numeroDeCuenta+" es: $"+cuotaDeManejo()+" con tipo de tarjeta: "+this.getClass().getSimpleName()+" en el mes de: "+mes;
    }
    
    public String getNumeroDeCuenta(){
        return numeroDeCuenta;
    }
    
    public double getValorApertura(){
        return valorApertura;
    }
    
    public String getMes(){
        return mes;
    } 
}
