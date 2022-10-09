package tarea;

import tarea.DetalleOrden;
import tarea.OrdenCompra;
import tarea.Pago;

public class Efectivo extends Pago {

    public float calcDevolucion(Pago z) {
        if (z.aPagar - z.getM() > 0) {
            z.aPagar = z.aPagar - z.getM();
            return 0;
        } else if (z.aPagar - z.getM() < 0) {
            return -(z.aPagar - z.getM());
        } else {
            return 0;
        }
    }
}
