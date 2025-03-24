package arbolbusqueda;

public class NodoBST {
    int valor;
    NodoBST izquierdo, derecho;

    public NodoBST(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}
