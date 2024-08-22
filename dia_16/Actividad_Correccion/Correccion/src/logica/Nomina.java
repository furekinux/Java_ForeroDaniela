package logica;

public class Nomina extends Tarjeta {
    
    public Nomina(String numeroDeCuenta, double valorApertura, String mes) {
        super(numeroDeCuenta, valorApertura, mes);
    }
    
    @Override
    public double cuotaDeManejo() {
        return 50000 - Descuento.PLATINO.getValorDescontado(getValorApertura());
    }
    
}
