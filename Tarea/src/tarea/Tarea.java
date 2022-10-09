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
        
        //Ordenes de compra, docTributarios y pagos---------------------------------------
        OrdenCompra oc1 = new OrdenCompra();
        OrdenCompra oc2 = new OrdenCompra();
        
        oc1.createDoc("15123322","12523269-3", "Dichato","Boleta");
        oc2.createDoc("23453245", "32423441-3", "Amongus","Factura");
        
        Pago p1 = new Pago();
        Efectivo e1 =new Efectivo();
        //Compra 1
        
        oc1.SetterArticulos(3,a1); //Articulos que queremos comprar
        oc1.SetterArticulos(1,a3);
        oc1.SetterArticulos(5,a2);
        oc1.SetterArticulos(9,a4);
        
        //Pago 1
        p1.setOrdenCompra(oc1); //Lo que debemos pagar
        p1.LoquePago(40000); //Esto es para pagar en efectivo
        
        oc1.ImprimePreciosIndividualesYtotales();
        System.out.println("Vuelto1: "+e1.calcDevolucion(p1));   //Vuelto respecto al pago por efectivo
        
        //Compra 2
        oc1.SetterArticulos(40, a1);
        oc1.SetterArticulos(2,a3);
        oc1.SetterArticulos(5,a4);
        //Pago 2
        p1.setOrdenCompra(oc1);
        p1.LoquePago(300000);
        
        System.out.println("Vuelto2 :"+ e1.calcDevolucion(p1));
        
        //Compra 3
        oc2.SetterArticulos(1, a3);
        oc2.SetterArticulos(23,a2);
        oc2.SetterArticulos(5,a5);
        
        //Pago 3
        
        p1.setOrdenCompra(oc2);
        p1.LoquePago(40000);
        
        System.out.println("Vuelto3: "+e1.calcDevolucion(p1));
        
        //Compra 4
        
        oc2.SetterArticulos(1, a3);
        oc2.SetterArticulos(2, a1);
        oc2.SetterArticulos(8, a2);
        
        //Pago 4
        
        p1.setOrdenCompra(oc2);
        p1.LoquePago(10000);
        Transferencia tr = new Transferencia("Banco Estado","4312 2999 5555");

        System.out.println("Transferencia Realizada, datos:\n "+tr.toString());
        
        //Compra 4
        oc2.SetterArticulos(1, a5);
        oc2.SetterArticulos(2, a2);
        oc2.SetterArticulos(8, a1);
        oc2.SetterArticulos(6, a3);
        
        //Pago 5
        p1.setOrdenCompra(oc2);
        Tarjeta tar = new Tarjeta("visa","1233 9231 1231 2323");
        
        System.out.println("Pago realizado, datos: \n"+tar.toString());     
    }
}
