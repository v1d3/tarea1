package tarea;

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
        
        //DocTributarios-------------------------------------------------------

        DocTributario dc1= new DocTributario("15123322","12523269-3", "Dichato");
        DocTributario dc2= new DocTributario("12233112","12523292-k", "Tomé");
        DocTributario dc3= new DocTributario("14234222","12553232-4", "Rancagua");
        DocTributario dc4= new DocTributario("15232322","12552323-5", "Coquimbo");




        //Orden de Compra---------------------------------------------------
        OrdenCompra oc1 = new OrdenCompra(3,a1);
        OrdenCompra oc2 = new OrdenCompra(1,a2);
        OrdenCompra oc3 = new OrdenCompra(2,a3);

        
        //Prints-------------------------------------------------------------------
        System.out.println("Precio Con IVA: " + oc1.calcPrecio());
        
        Pago p1 = new Pago();
        Efectivo e = new Efectivo();
        p1.setOrdenCompra(oc1);  //Aqui
        p1.LoquePago(3000);
        p1.LoquePago(3000);
        System.out.println("Vuelto: " + e.calcDevolucion(p1));
        System.out.println("Vuelto: " + e.calcDevolucion(p1));
    }
}
