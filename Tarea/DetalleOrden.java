package tarea;

import tarea.Articulo;

public class DetalleOrden {
 private int cantidad;
    public Articulo a;

    
    public void SetterArt(int n, Articulo ar){
        cantidad = n;
        a = ar;
    }

    public float calcPrecio() {

        return calcIVA() * cantidad;
    }

    public float calcPrecioSinIVA() {
        return a.getPreAr();
    }

    public float calcIVA() {
        return (a.getPreAr() + ((a.getPreAr() * 19) / 100));
    }

    public float calcPeso() {
        return a.getPrePe() * cantidad;
    }

}
