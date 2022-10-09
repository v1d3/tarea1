package tarea;

import java.util.Date;

public class DocTributario {

    private String numero;
    private String rut;
    private Date fecha = new Date();
    public Direccion d;

    public DocTributario(String N, String R, String D) {
        numero = N;
        rut = R;
        d = new Direccion(D);
    }

    public String toString() {
        return "----------------------------\n" + "Fecha: " + fecha + "\nNumero: " + numero + "\nRut: " + rut + "\nDireccion Empresa: " + d.getDireccion() + "\n----------------------------";
    }

}

class Factura {

}
