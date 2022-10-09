package tarea;
import tarea.Pago;


public class Tarjeta extends Pago{

    private String tipo;
    private String numTransacción;

    public Tarjeta(String t, String n) {
        tipo = t;
        numTransacción = n;
    }

    public String getTipo(String t) {
        return tipo;
    }

    public String getNum(String n) {
        return numTransacción;
    }

    public String toString() {
        return "\nTipo: " + tipo + "\nnumTransaccion: " + numTransacción;
    }
    
}
