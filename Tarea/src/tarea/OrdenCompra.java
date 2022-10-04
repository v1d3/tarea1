package tarea;

import java.util.Date;
import tarea.DetalleOrden;


//package ordencompra;

public class OrdenCompra {

     private Date fecha;
    private String estado;

    public OrdenCompra() {

    }

    public float calcPrecioSinIVA(DetalleOrden m) {
        return m.calcPrecioSinIVA();
    }

    public float calcIVA(DetalleOrden m) {
        return m.calcIVA();
    }

    public float calcPrecio(DetalleOrden m) {
        return m.calcPrecio();
    }

    public float calcPeso(DetalleOrden m) {
        return m.calcPeso();
    }
    
}
