package tarea;
import java.util.Date;


public class DocTributario {

    private String numero;
    private String rut;
    private Date fecha = new Date();
    public Direccion d;

    public DocTributario(String N, String R, String A) {
        numero = N;
        rut = R;
        d = new Direccion(A);
    }

    public String toString() {
        return "----------------------------\n" +"Fecha: " + fecha + "\nNumero: " + numero + "\nRut: " + rut + "\nDireccion Empresa: " + d.getDireccion()+"\n----------------------------";
    }
}

class Boleta {

}

class Factura {

}


