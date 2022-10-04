package tarea;
import tarea.DetalleOrden;
import tarea.OrdenCompra;
import tarea.Pago;


public class Efectivo extends Pago{//-----------------------------Reparar aqui codigo mal hecho, faltan casos, y variable que recuerde si no se paga total


    public float calcDevolucion(OrdenCompra m, DetalleOrden d, Pago z) {
        if (z.getM() - m.calcPrecio(d) <= 0) { //Ej: 300-500 < 0, por tanto no hay vuelto
            return 0;
        } else {
            return z.getM() - m.calcPrecio(d);  //Ej: 500-300 > 0, por tanto devuelvo 200
        }

    }
    
}
