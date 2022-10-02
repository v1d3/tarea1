package tarea;

import java.util.Date;

//Main
public class Tarea {

    public static void main(String[] args) {
        Cliente o = new Cliente("yuli", "2078");
        System.out.println(o.toString());
        DocTributario dc = new DocTributario();
        dc.getdoc();
        
        Articulo a1 = new Articulo();
        a1.SetNameAr("Platanos");
        a1.SetDescrAr("Platanos a medio Madurar");
        a1.SetPreAr(1300);
        a1.SetPrepe(1); //Esta en kilo
        
        OrdenCompra o1 = new OrdenCompra(5,a1);
        System.out.println("peso: "+o1.calcPeso());
    }
}
//Clases

class OrdenCompra {

    private Date fecha;
    private String estado;
    
    public DetalleOrden m;

    public OrdenCompra(int n, Articulo r){
            m = new DetalleOrden(n,r);
    }
    
    public float calcPrecioSinIVA() {
       return m.calcPrecioSinIVA();
    }

    public float calcIVA() {
        return m.calcIVA();
    }

    public float calcPrecio() {
        return m.calcPrecio();
    }

    public float calcPeso() {
        return m.calcPeso();
    }
}

class DetalleOrden {
    
    private int cantidad;
    public Articulo a;
    
    public DetalleOrden(int n, Articulo ar){
        cantidad = n;
        a = ar;
    }
    
    public float calcPrecio() {
        
        return calcIVA()*cantidad;
    }

    public float calcPrecioSinIVA() {
        return a.getPreAr();
    }

    public float calcIVA() {
        return a.getPreAr()+(a.getPreAr()*(19/100));
    }

    public float calcPeso() {
        return a.getPrePe()*cantidad;
    }

}

class Articulo {

    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;
    
    public float getPreAr(){
        return precio;
    }
    public float getPrePe(){
        return peso;
    }
    public String getNameAr(){
        return nombre;
    }
    public String getDescrAr(){
        return descripcion;
    }
    public void SetPreAr(float s){
        precio = s;
    }
    public void SetPrepe(float s){
        peso = s;
    }
    public void SetNameAr(String s){
        nombre = s;
    }
    public void SetDescrAr(String s){
         descripcion = s;
    }
}

class Cliente {

    private String nombre;
    private String rut;

    public Cliente(String N, String R) {
        nombre = N;
        rut = R;
    }

    public String toString() {
        return "Cliente: " + nombre + " RUT: " + rut;
    }

    public String numrut() {
        return rut;
    }

}

class Direccion {

    private String Direccion;

    public Direccion(String D) {
        Direccion = D;
    }
}

class DocTributario {

    private String numero;
    private String rut;
    private Date fecha = new Date();

    public DocTributario() {

    }

    public void getdoc() {
        System.out.println("Fecha: " + fecha);
    }
}

class Boleta {
    
}

class Factura {

}

class Pago {

    private float monto;
    private Date fecha = new Date();

    public void setterM(float n, Date f) {
        monto = n;
        fecha = f;
    }

    public float getM() {       //Getter 
        return monto;
    }
}

class Efectivo extends Pago {

    private float Money;

    public Efectivo(float m) {
        Money = m;
    }

    public float getEfect() {
        return Money;
    }

    public float calcDevolucion() {    
        if (getM() - getEfect() == 0) {
            return 0;
        } else if (getEfect() > getM()) {
            return (getEfect() - getM());
        } else {
            return 0;
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
