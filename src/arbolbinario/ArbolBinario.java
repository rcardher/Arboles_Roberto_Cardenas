package arbolbinario;

public class ArbolBinario {
    private NodoBinario raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private NodoBinario insertarRec(NodoBinario nodo, int valor) {
        if (nodo == null) {
            return new NodoBinario(valor);
        }
        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRec(nodo.derecho, valor);
        }
        return nodo;
    }

    public void recorrerEnOrden() {
        recorrerEnOrdenRec(raiz);
    }

    private void recorrerEnOrdenRec(NodoBinario nodo) {
        if (nodo != null) {
            recorrerEnOrdenRec(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorrerEnOrdenRec(nodo.derecho);
        }
    }

}






