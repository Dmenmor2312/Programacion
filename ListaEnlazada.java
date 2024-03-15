package listas;

public class ListaEnlazada {

    Nodo inicial;

    public ListaEnlazada() {

    }

    public ListaEnlazada(int valor) {
        inicial = crearNodo(valor);
    }

    public Nodo crearNodo(int valor) {
        Nodo nodo = new Nodo(valor);
        return nodo;
    }

    public void añadirAlFinal(int valor) {
        if (inicial == null) {
            inicial = crearNodo(valor);
        } else {
            Nodo nuevoNodo = crearNodo(valor);
            Nodo ultimo = getUltimo();
            ultimo.setSiguiente(nuevoNodo);
        }
    }

    public void añadirAlInicio(int valor) {
        Nodo nodoAux;
        Nodo nodoInicio = crearNodo(valor);
        nodoAux = inicial;
        inicial = nodoInicio;
        nodoInicio.setSiguiente(nodoAux);
    }

    private Nodo getUltimo() {
        Nodo nodoAux = inicial;
        while (nodoAux.getSiguiente() != null) {
            nodoAux = nodoAux.getSiguiente();
        }
        return nodoAux;
    }

    public void imprimirLista() {
        Nodo nodoAux;
        nodoAux = inicial;
        while (nodoAux != null) {
            System.out.print(nodoAux.getValor() + " ");
            nodoAux = nodoAux.getSiguiente();
        }
    }

    public void tamañoLista() {
        Nodo nodoAux;
        nodoAux = inicial;
        int cont = 1;
        while (nodoAux.getSiguiente() != null) {
            nodoAux = nodoAux.getSiguiente();
            cont++;
        }
        System.out.println(" ");
        System.out.println("El tamaño es " + cont);
    }

    public void InsertarA(int valor, int posicion) {
        Nodo nodoAux;
        Nodo nodoNuevo;
        Nodo nodoAnterior = null;
        nodoAux = inicial;
        int cont = 0;
        boolean salir = true;
        while (salir) {
            if (cont < posicion) {
                if (cont > 0) {
                    nodoAux = nodoAux.getSiguiente();
                    nodoAnterior = nodoAnterior.getSiguiente();
                } else {
                    nodoAnterior = nodoAux;
                    nodoAux = nodoAux.getSiguiente();
                }
                cont++;
            } else {
                nodoNuevo = crearNodo(valor);
                nodoNuevo.setSiguiente(nodoAux);
                nodoAnterior.setSiguiente(nodoNuevo);
                salir = false;
            }
        }

    }

    public void eliminarPrimero() {
        Nodo nodoAux = inicial;
        nodoAux = nodoAux.getSiguiente();
        inicial = nodoAux;
    }

    public Nodo obtenerPenultimo() {
        Nodo nodoAux = inicial;
        while (nodoAux.getSiguiente().getSiguiente() != null) {
            nodoAux = nodoAux.getSiguiente();
        }
        return nodoAux;
    }

    public void eliminarUltimo() {
        if (inicial == null) {
            System.out.println("No puedes eliminar");
        } else {
            Nodo nodoAux = obtenerPenultimo();
            nodoAux = nodoAux.getSiguiente();
            nodoAux = null;
        }

    }

}
