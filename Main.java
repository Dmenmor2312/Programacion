package main;

import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        Lista list1 = new Lista();
        Scanner leer = new Scanner(System.in);
        System.out.println("El tamaño de la lista es " + list1.MostrarTamaño());
        list1.InsertarNumeroAlFinal(7);
        list1.InsertarNumeroAlPrincipio(5);
        list1.Insertar(1, 6);
        //list1.MostrarLista(list1.getArrayOriginal());
    }
    
}