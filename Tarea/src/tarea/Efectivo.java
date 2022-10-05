package tarea;
import tarea.DetalleOrden;
import tarea.OrdenCompra;
import tarea.Pago;


public class Efectivo extends Pago{

    public float PaymentHistory;

    public float calcDevolucion(OrdenCompra m, Pago z) {
        if (z.getM() - m.calcPrecio() <= 0) { //Ej: 300-500 < 0, por tanto no hay vuelto
            return 0;
        } else {
            return z.getM() - m.calcPrecio();  //Ej: 500-300 > 0, por tanto devuelvo 200
        }

    }
    
}
