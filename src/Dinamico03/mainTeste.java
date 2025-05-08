package Dinamico03;

import Filas.FilaInt;

import java.util.Scanner;

public class mainTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilasInt fila = new FilasInt();
        fila.init();
        System.out.println("Informe valor positivo na fila, negativo encerra");
        int valor = sc.nextInt();
        while(valor >= 0){
            fila.enqueue(valor);
            System.out.println("Informe valor positivo na fila, negativo encerra");
            valor = sc.nextInt();
        }
        while(!fila.isEmpty()){
            System.out.println("Valor retirado " + fila.dequeue());
        }
    }
}
