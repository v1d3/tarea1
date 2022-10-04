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
        DetalleOrden do1 = new DetalleOrden(3, a1);
        OrdenCompra o1 = new OrdenCompra();

        System.out.println("Producto con iva: " + o1.calcIVA(do1));
        System.out.println("Producto Total: " + o1.calcPrecio(do1));
        System.out.println("Producto sin iva: " + o1.calcPrecioSinIVA(do1));
        Efectivo e = new Efectivo();
        Pago p = new Pago();
        p.setterM(14000);
        System.out.println("Efectivo vuelto: " + e.calcDevolucion(o1, do1, p));
    }
}
