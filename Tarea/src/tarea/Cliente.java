
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
    public String toString() {
        return  "----------------------------\n" +"Cliente: " + nombre + "\nRUT Cliente: " + rut + "\nDirreccion cliente: " + direc.getDireccion()+"\n----------------------------";
    }
}
