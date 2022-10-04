
package tarea;
import tarea.Direccion;

public class Cliente {
private String nombre;
    private String rut;
    
    public Direccion direc;

    public Cliente(String N, String R, String a) {
        nombre = N;
        rut = R;
        direc = new Direccion(a);
    }


    /* public String toString() {
        return "Cliente: " + nombre + "\nRUT Cliente: " + rut;
    }*/
    public void printdatos() {
        System.out.println("Cliente: " + nombre + "\nRUT Cliente: " + rut);
        System.out.println("Dirreccion cliente: " + direc.getDireccion());
    }
}
