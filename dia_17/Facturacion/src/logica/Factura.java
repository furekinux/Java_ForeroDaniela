package logica;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    
    private Cliente cliente;
    private List<Producto> productos;
    private double total;
    private double descuento;

    public Factura(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.total = calcularTotal();
    }

    public Factura(Cliente cliente, List<Producto> productos) {
        this.cliente = cliente;
        this.productos = productos;
        this.total = calcularTotal();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
        this.total = calcularTotal();
    }

    public double getTotal() {
        return total;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    private double calcularTotal(){
        double a=0;
        for (Producto producto : productos) {
            a=a+producto.getPrecio();
        }
        return a;
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
        this.total = calcularTotal();
    }
    
    public void listarProducto(){
        System.out.println("\nActualmente tiene "+productos.size()+" productos:");
        for(Producto producto : productos){
            System.out.println(producto.getNombre()+" "+producto.getPrecio());
        }
    };
}
