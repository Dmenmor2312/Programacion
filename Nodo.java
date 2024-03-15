package listas;

public class Nodo {

    private int valor;
    private Nodo siguiente;

    public Nodo(int valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public int getValor() {
        return valor;
    }

}
