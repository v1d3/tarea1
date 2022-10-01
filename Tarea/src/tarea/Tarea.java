package tarea;

import java.util.Date;

//Main
public class Tarea {

    public static void main(String[] args) {

    }
}
//Clases

class OrdenCompra {

    private Date fecha;
    private String estado;

    public void calcPrecioSinIVA() {

    }

    public void calcIVA() {

    }

    public void calcPrecio() {
    }

    public void calcPeso() {

    }
}

class DetalleOrden {

    private int cantidad;

    public void calcPrecio() {
    }

    public void calcPrecioSinIVA() {

    }

    public void calcIVA() {

    }

    public void calcPeso() {

    }

}

class Articulo {

    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;
}

class Cliente {

    private String nombre;
    private String rut;

}

class Direccion {

}

class DocTributario {

}

class Boleta {

}

class Factura {

}

class Pago {

    private float monto;
    private Date fecha;

    public Pago(float m, Date f) {
        monto = m;
        fecha = f;
    }

    public float getM() {       //Getter 
        return monto;
    }

    public String DatosDelPago() {
        return "Monto: " + monto + "\nfecha: " + fecha;
    }

}

class Efectivo extends Pago {

    private float Money;

    public Efectivo(float m) {
        Money = m;
    }

    public float calcDevolucion() {     //Si la diferencia es >= 0, retorna 0
        if (getM() - Money >= 0) {
            return 0;
        } else { //De lo contrario se tomara que el Money > getM(), por tanto hay vuelto
            return -1 * (getM() - Money);
        }

    }

}

class Transferencia extends Pago {

    private String banco;
    private String numCuenta;

    public Transferencia(String b, String num) {
        banco = b;
        numCuenta = num;
    }

    public String DatosDeTransferencia() {
        return "Banco: " + banco + "numCuenta: " + numCuenta;
    }

}

class Tarjeta extends Pago {

    private String tipo;
    private String numTransacción;

    public Tarjeta(String t, String n) {
        tipo = t;
        numTransacción = n;
    }

    public String DatosdeTarjeta() {
        return "Tipo: " + tipo + "numTransacción: " + numTransacción;
    }

}
