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

    public void printdoc() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Numero: " + numero);
        System.out.println("Rut: " + rut);
        System.out.println("Direccion Empresa: " + d.getDireccion());

    }
}

class Boleta {

}

class Factura {

}


