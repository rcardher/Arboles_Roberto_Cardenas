package arbolgeneral;

public class Arbol<T> {
    private Nodo<T> raiz;

    public Arbol(T datoRaiz) {
        this.raiz = new Nodo<>(datoRaiz);
    }

    public Nodo<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo<T> raiz) {
        this.raiz = raiz;
    }
}

