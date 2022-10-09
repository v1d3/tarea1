package tarea;

import tarea.Pago;

public class Transferencia extends Pago {

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

    public String toString() {
        return "----------------------------\n" + "\nBanco: " + banco + "\nnumCuenta: " + numCuenta + "\n----------------------------";
    }

}
