package tarea;

import java.util.Date;

//Main
public class Tarea {

    public static void main(String[] args) {

        Cliente o = new Cliente("yuli", "2078", "Tome");
        o.printdatos();
        DocTributario dc = new DocTributario("154696", "125569-4", "Dichato");
        dc.printdoc();

        Articulo a1 = new Articulo();
        a1.SetNameAr("Platanos");
        a1.SetDescrAr("Platanos a medio Madurar");
        a1.SetPreAr(1300);
        a1.SetPrepe(1); //Esta en kilo
        OrdenCompra oc = new OrdenCompra(3, a1);
        System.out.println(oc.calcPrecioSinIVA());
        System.out.println(a1.toString());
    }
}
