package Filas;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FilaInt fila = new FilaInt();
        Scanner le = new Scanner(System.in);
        fila.init();
        fila.enqueue(66);
        fila.enqueue(17);
        if(!fila.isEmpty())
            System.out.println("Valor retirado da fila " + fila.dequeue());
        else
            System.out.println("Fila vazia");
        fila.enqueue(5);
        fila.enqueue(85);
        fila.enqueue(99);
        while (!fila.isEmpty())
            System.out.println("Valor retirado da fila " + fila.dequeue());


    }
}