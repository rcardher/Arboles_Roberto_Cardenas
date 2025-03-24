package arbolbusqueda;

public class ArbolBuscar {
    private NodoBST raiz;

    public ArbolBuscar() {
        this.raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private NodoBST insertarRec(NodoBST nodo, int valor) {
        if (nodo == null) {
            return new NodoBST(valor);
        }
        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRec(nodo.derecho, valor);
        }
        return nodo;
    }

    // ✅ Método para buscar un valor en el árbol
    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(NodoBST nodo, int valor) {
        if (nodo == null) {
            return false;
        }
        if (nodo.valor == valor) {
            return true;
        }
        return valor < nodo.valor ? buscarRec(nodo.izquierdo, valor) : buscarRec(nodo.derecho, valor);
    }
}


