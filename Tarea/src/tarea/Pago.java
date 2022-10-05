package tarea;

import java.util.Date;
import java.util.ArrayList;

public class Pago {

    private float monto;
    private Date fecha = new Date();
    public ArrayList l;
    public float aux = 0;

    public Pago() {
        l = new ArrayList();
    }

    public void setterM(float n) {
        monto = n;
    }

    public float getM() {       //Getter 
        return monto;
    }

    public void addPayment_Efective() {
        
    }

    public String toString() {
        return "----------------------------" + "Monto: " + monto + "\nFecha: " + fecha + "\n----------------------------";
    }

}
