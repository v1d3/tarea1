package tarea;

import java.util.ArrayList;
import java.util.Date;

//Main
public class Tarea {
    
    public static void main(String[] args) {
        
        //Clientes-----------------------------------------------------------------------
        Cliente c1 = new Cliente("Yulissa", "20.378.123-6", "Tome");
        Cliente c2 = new Cliente("Cristobal","20.132.232-3","Santiago");
        
        //Articulos ----------------------------------------------------------------------
        Articulo a1 = new Articulo();
        a1.SetNameAr("Platanos");
        a1.SetDescrAr("Platanos a medio Madurar");
        a1.SetPreAr(1300);
        a1.SetPrepe(1); //Esta en kilo

        Articulo a2 = new Articulo();
        a2.SetNameAr("Frutillas");
        a2.SetDescrAr("Frutillas Maduras");
        a2.SetPreAr(2000);
        a2.SetPrepe(1); //Esta en kilo
        
        Articulo a3 = new Articulo();
        a3.SetNameAr("Manzanas");
        a3.SetDescrAr("Manzanas dulces fuji");
        a3.SetPreAr(1500);
        a3.SetPrepe(1);
        
        Articulo a4 = new Articulo();
        a4.SetNameAr("Kiwi");
        a4.SetDescrAr("Kiwis cascara dulce");
        a4.SetPreAr(1690);
        a4.SetPrepe(1);
        
        Articulo a5 = new Articulo();
        a5.SetNameAr("Naranja");
        a5.SetDescrAr("Naranjas dulces, harto jugo");
        a5.SetPreAr(2190);
        a5.SetPrepe(1);
        
        //Ordenes de compra y pagos---------------------------------------
        OrdenCompra oc1 = new OrdenCompra();
        OrdenCompra oc2 = new OrdenCompra();
        
        oc1.SetterArticulos(3,a1);
        oc1.SetterArticulos(1,a3);
        oc1.SetterArticulos(5,a2);
        oc1.SetterArticulos(9,a4);
        
        oc1.ImprimePreciosIndividualesYtotales();
        
        //DocTributarios-------------------------------------------------------

        oc1.createDoc("15123322","12523269-3", "Dichato","Boleta");
        oc2.createDoc("23453245", "32423441-3", "Amongus","Factura");
    
   
        System.out.println(oc1.DevuelveDoc());
        System.out.println(oc2.DevuelveDoc());
        
        System.out.println("Precio: "+oc1.calcPrecio());
        

        

        
        
    }
}
