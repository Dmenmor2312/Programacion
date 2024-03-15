package main;

public class Lista {

    Integer[] arrayOriginal;

    public Lista() {
        arrayOriginal = new Integer[0];
    }

    public int MostrarTamaño() {
        return arrayOriginal.length;
    }

    public void InsertarNumeroAlFinal(Integer num) {
        Integer[] arrayAux = new Integer[arrayOriginal.length + 1];
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayAux[i] = arrayOriginal[i];
        }
        arrayAux[arrayAux.length - 1] = num;
        arrayOriginal = arrayAux;
        MostrarLista();
    }

    public void InsertarNumeroAlPrincipio(Integer num) {
        Integer[] arrayAux = new Integer[arrayOriginal.length + 1];
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayAux[i + 1] = arrayOriginal[i];
        }
        arrayAux[0] = num;
        arrayOriginal = arrayAux;
        MostrarLista();
    }

    public void Insertar(int posicion, Integer num) {
        Integer[] arrayAux = new Integer[arrayOriginal.length + 1];
        for (int j = 0; j < arrayOriginal.length + 1; j++) {
            if (j == posicion) {
                arrayAux[posicion] = num;
            } else if (j > posicion) {
                arrayAux[j] = arrayOriginal[j - 1];
            } else {
                arrayAux[j] = arrayOriginal[j];
            }
        }
        arrayOriginal = arrayAux;
        MostrarLista();
    }

    public void MostrarLista() {
        System.out.println("Array: ");
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.println(arrayOriginal[i] + " ");
        }
    }

}
