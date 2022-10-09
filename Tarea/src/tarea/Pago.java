package tarea;

import java.util.Date;
import java.util.ArrayList;

public class Pago {

    private float monto;
    private Date fecha = new Date();
    public float aPagar;    //Esta variable esta hecha para guardar el valor a pagar en caso de que no se page completamente el producto

    public Pago() {
        aPagar = 0;
    }

    public void LoquePago(float n) {
        monto = n;
    }

    public float getM() {       //Getter del monto que ponemos para pagar
        return monto;
    }

    public void setOrdenCompra(OrdenCompra m) {
        aPagar = m.calcPrecio();
    }

    public String toString() {
        return "----------------------------" + "Monto: " + monto + "\nFecha: " + fecha + "\n----------------------------";
    }

}
