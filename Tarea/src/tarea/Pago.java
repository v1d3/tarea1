package tarea;
import java.util.Date;


public class Pago {

    private float monto;
    private Date fecha = new Date();

    public void setterM(float n) {
        monto = n;
    }

    public float getM() {       //Getter 
        return monto;
    }

    public String DatosPago() {
        return "Monto: " + monto + "\nFecha: " + fecha;
    }
    
}
