package arbolgeneral;

import arbolbinario.ArbolBinario;
import arbolbusqueda.ArbolBuscar;

public class Main {
    public static void main(String[] args) {
        // Crear y probar un árbol binario
        System.out.println("Probando Árbol Binario:");
        ArbolBinario arbolBinario = new ArbolBinario();
        arbolBinario.insertar(10);
        arbolBinario.insertar(5);
        arbolBinario.insertar(15);
        arbolBinario.recorrerEnOrden();

        System.out.println("\n----------------------\n");

        // Crear y probar un árbol de búsqueda
        System.out.println("Probando Árbol de Búsqueda:");
        ArbolBuscar arbolBusqueda = new ArbolBuscar();
        arbolBusqueda.insertar(20);
        arbolBusqueda.insertar(10);
        arbolBusqueda.insertar(30);
        arbolBusqueda.buscar(10);
        arbolBusqueda.buscar(25);
    }
}

