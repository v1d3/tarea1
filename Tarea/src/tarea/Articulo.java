package tarea;
public class Articulo {

  
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;

    public float getPreAr() {
        return precio;
    }

    public float getPrePe() {
        return peso;
    }

    public String getNameAr() {
        return nombre;
    }

    public String getDescrAr() {
        return descripcion;
    }

    public void SetPreAr(float s) {
        precio = s;
    }

    public void SetPrepe(float s) {
        peso = s;
    }

    public void SetNameAr(String s) {
        nombre = s;
    }

    public void SetDescrAr(String s) {
        descripcion = s;
    }
    public String toString(){
        return "----------------------------"+"\n"+"Peso: "+getPrePe()+"\nNombre: "+getNameAr()+"\nDescripcion: "+getDescrAr()+"\nPrecio: "+getPreAr()+"\n----------------------------";
    }
    
}
