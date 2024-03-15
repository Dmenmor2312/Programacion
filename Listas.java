package listas;

public class Listas {

    public static void main(String[] args) {
        Nodo nodo1 = new Nodo(4);
        ListaEnlazada lista1 = new ListaEnlazada();
        ListaEnlazada lista2 = new ListaEnlazada(4);
        lista2.añadirAlFinal(5);
        lista2.añadirAlFinal(6);
        lista2.añadirAlFinal(7);
        lista2.imprimirLista();
        lista2.tamañoLista();
        System.out.println(" ");
        lista1.añadirAlFinal(1);
        lista1.añadirAlFinal(2);
        lista1.añadirAlInicio(9);
        lista1.InsertarA (6, 1);
        //lista1.eliminarPrimero();
        lista1.imprimirLista();
        System.out.println(" ");
        lista1.eliminarUltimo();
        lista1.imprimirLista();
        lista1.tamañoLista();
    }
}
