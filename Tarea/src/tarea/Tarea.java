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
//Clases

class OrdenCompra {

    private Date fecha;
    private String estado;

    public OrdenCompra() {

    }

    public float calcPrecioSinIVA(DetalleOrden m) {
        return m.calcPrecioSinIVA();
    }

    public float calcIVA(DetalleOrden m) {
        return m.calcIVA();
    }

    public float calcPrecio(DetalleOrden m) {
        return m.calcPrecio();
    }

    public float calcPeso(DetalleOrden m) {
        return m.calcPeso();
    }
}

class DetalleOrden {

    private int cantidad;
    public Articulo a;

    public DetalleOrden(int n, Articulo ar) {
        cantidad = n;
        a = ar;
    }

    public float calcPrecio() {

        return calcIVA() * cantidad;
    }

    public float calcPrecioSinIVA() {
        return a.getPreAr();
    }

    public float calcIVA() {
        return (a.getPreAr() + ((a.getPreAr() * 19) / 100));
    }

    public float calcPeso() {
        return a.getPrePe() * cantidad;
    }

}

class Articulo {

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
}

class Cliente {

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

class Direccion {

    private String Direccion;

    public Direccion(String D) {
        Direccion = D;
    }

    public String getDireccion() {
        return Direccion;
    }
}

class DocTributario {

    private String numero;
    private String rut;
    private Date fecha = new Date();
    public Direccion d;

    public DocTributario(String N, String R, String A) {
        numero = N;
        rut = R;
        d = new Direccion(A);
    }

    public void printdoc() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Numero: " + numero);
        System.out.println("Rut: " + rut);
        System.out.println("Direccion Empresa: " + d.getDireccion());

    }
}

class Boleta {

}

class Factura {

}

class Pago {

    private float monto;
    private Date fecha = new Date();

    public void setterM(float n) {
        monto = n;
    }

    public float getM() {       //Getter 
        return monto;
    }

    public String DatosPago() {
        return "Monto: " + monto + "\nFecha: " + fecha;
    }
}

class Efectivo extends Pago { //-----------------------------Reparar aqui codigo mal hecho, faltan casos, y variable que recuerde si no se paga total

    public float calcDevolucion(OrdenCompra m, DetalleOrden d, Pago z) {
        if (z.getM() - m.calcPrecio(d) <= 0) { //Ej: 300-500 < 0, por tanto no hay vuelto
            return 0;
        } else {
            return z.getM() - m.calcPrecio(d);  //Ej: 500-300 > 0, por tanto devuelvo 200
        }

    }
}

class Transferencia extends Pago {

    private String banco;
    private String numCuenta;

    public Transferencia(String b, String num) {
        banco = b;
        numCuenta = num;
    }

    public String getBank() {
        return banco;
    }

    public String getNum() {
        return numCuenta;
    }

    public String DatosDeTransferencia() {
        return "Banco: " + banco + "numCuenta: " + numCuenta;
    }
}

class Tarjeta extends Pago {

    private String tipo;
    private String numTransacción;

    public Tarjeta(String t, String n) {
        tipo = t;
        numTransacción = n;
    }

    public String getTipo(String t) {
        return tipo;
    }

    public String getNum(String n) {
        return numTransacción;
    }

    public String DatosdeTarjeta() {
        return "Tipo: " + tipo + "numTransacción: " + numTransacción;
    }

}
