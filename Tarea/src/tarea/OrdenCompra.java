package tarea;

import java.util.Date;
import tarea.DetalleOrden;
import java.util.ArrayList;

//package ordencompra;
public class OrdenCompra {

    private Date fecha;
    private String estado;
    public DetalleOrden p;  //Creamos esta variable para generar una composicion p para las funciones descritas
    public DocTributario a;
    public ArrayList l;
    public float aux = 0;
   
    
    public OrdenCompra() { 
        l = new ArrayList<DetalleOrden>();
    }
    
    public void SetDocTributario(){
        
    }

    public void SetterArticulos(int n, Articulo d) {
        p.SetterArt(n, d);
        l.add(p);
    }

    public float calcPrecio() {
        aux = 0;
        for(int i = 0 ; i < l.size(); i++){
            DetalleOrden k = (DetalleOrden) l.remove(i);
            aux += k.calcPeso();
        }
        return aux;
    }

    public float calcPrecioSinIVA() {
        aux = 0;
        for(int i = 0 ; i < l.size(); i++){
            DetalleOrden k = (DetalleOrden) l.remove(i);
            aux += k.calcPrecioSinIVA();
        }
        return aux;
    }

    public void calcIVA() {
        
    }

    public void calcPeso() {

    }
}
