package logica;

public class Joven extends Tarjeta{

    public Joven(String numeroDeCuenta, double valorApertura, String mes) {
        super(numeroDeCuenta, valorApertura, mes);
    }

    @Override
    public double cuotaDeManejo() {
        return 50000 - Descuento.BASICO.getValorDescontado(getValorApertura());
    }
    
} 
