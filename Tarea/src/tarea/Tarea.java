package tarea;

import java.util.Date;

//Main
public class Tarea {

    public static void main(String[] args) {

    }
}
//Clases

class OrdenCompra {

    private Date fecha;
    private String estado;

    public void calcPrecioSinIVA() {

    }

    public void calcIVA() {

    }

    public void calcPrecio() {
    }

    public void calcPeso() {

    }
}

class DetalleOrden {

    private int cantidad;

    public void calcPrecio() {
    }

    public void calcPrecioSinIVA() {

    }

    public void calcIVA() {

    }

    public void calcPeso() {

    }

}

class Articulo {

    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;
}

class Cliente {

    private String nombre;
    private String rut;

}

class Direccion {

}

class DocTributario {

}

class Boleta {

}

class Factura {

}

class Pago {

}

class Efectivo extends Pago {

    public void calcDevolucion() {

    }
}

class Transferencia extends Pago {

}

class Tarjeta extends Pago {

}
