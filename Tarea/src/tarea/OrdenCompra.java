package tarea;

import java.util.Date;
import java.util.ArrayList;

//package ordencompra;
public class OrdenCompra {

    private Date fecha = new Date();
    private String estado;
    public DetalleOrden p;  //Creamos esta variable para generar una composicion p para las funciones descritas
    public Boleta b;
    public Factura f;
    public String tipo;
    public ArrayList<DetalleOrden> l;   //Para crear el Arraylist que servira para sumar los Articulos
    public float aux = 0;   //Variable que nos permitira almacenar el precio de la suma de los Articulos

    public OrdenCompra() {
        l = new ArrayList();
        p = new DetalleOrden();
    }

    public void createDoc(String A, String B, String C, String Tipo) {
        tipo = Tipo;
        if ("Boleta".equals(Tipo)) {
            b = new Boleta(A, B, C);
        } else if ("Factura".equals(tipo)) {
            f = new Factura(A, B, C);
        }
    }
    public void setEstado(String s){
        estado = s;
    }
    public String FechaEstado(){
        return "\nFecha: "+fecha+"\nEstado: "+estado;
    }

    public String DevuelveDoc() {
        if ("Boleta".equals(tipo)) {
            return b.toString();
        } else if ("Factura".equals(tipo)) {
            return f.toString();
        } else {
            return null;
        }
    }

    public void SetterArticulos(int n, Articulo a) {
        p.SetterArt(n, a);                       //Ingresa la cantidad y el articulo comprado
        l.add(p);                                 //Agrega el detalle de la compra a una lista

    }

    public void ImprimePreciosIndividualesYtotales() {
        DetalleOrden o;
        for (int i = 0; i < l.size(); i++) {
            o = (DetalleOrden) l.get(i);
            System.out.println(o.calcIVA());
            System.out.println(o.calcPrecio());

        }
    }

    public float calcPrecio() {
        aux = 0;
        for (int i = 0; i < l.size(); i++) {
            DetalleOrden k = l.remove(0);
            aux = aux + k.calcPrecio();
        }
        return aux;
    }

    public float calcPrecioSinIVA() {
        aux = 0;
        for (int i = 0; i < l.size(); i++) {
            DetalleOrden k = l.remove(0);
            aux = aux + k.calcPrecioSinIVA();
        }
        return aux;
    }

    public float calcIVA() {
        aux = 0;
        for (int i = 0; i < l.size(); i++) {
            DetalleOrden k = l.remove(0);
            aux = aux + k.calcIVA();
        }
        return aux;
    }

    public float calcPeso() {
        aux = 0;
        for (int i = 0; i < l.size(); i++) {
            DetalleOrden k = l.remove(0);
            aux = aux + k.calcPeso();
        }
        return aux;
    }
    public String toString(){
        return "\nFecha: "+fecha+"\nEstado:"+estado;
    }
}
