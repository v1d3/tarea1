package tarea;

import java.util.Date;
import tarea.DetalleOrden;


//package ordencompra;

public class OrdenCompra {

     private Date fecha;
    private String estado;
    public DetalleOrden p;

    public OrdenCompra(int n, Articulo a) {
        p = new DetalleOrden();
        p.SetterArt(n, a);
    }

    public float calcPrecioSinIVA() {
        return p.calcPrecioSinIVA();
    }

    public float calcIVA() {
        return p.calcIVA();
    }

    public float calcPrecio() {
        return p.calcPrecio();
    }

    public float calcPeso() {
        return p.calcPeso();
    }
    public String toString(){
        return "----------------------------"+"\n"+"Precio sin IVA: "+calcPrecioSinIVA()+"\nPrecio con IVA: "+calcIVA()+"\nPrecio Total: "+calcPrecio()+"\nPeso Total: "+calcPeso()+"\n----------------------------";
    }
    
}
