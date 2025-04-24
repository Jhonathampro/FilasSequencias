package Teste;

import Filas.FilaInt;

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


/*
public class MainTeste {

    public static void main(String[] args) {
        FilaInt fila = new FilaInt();
        fila.init();
        fila.enqueue(66);
        System.out.println("ENQUEUE=> ini: "+ fila.ini+ " fim: "+ fila.fim+" cont: "+fila.cont);
        fila.enqueue(17);
        System.out.println("ENQUEUE=> ini: "+ fila.ini+ " fim: "+ fila.fim+" cont: "+fila.cont);
        if (!fila.isEmpty()) {
            System.out.println("Valor retirado da fila "+ fila.dequeue());
            System.out.println("DEQUEUE=> ini: "+ fila.ini+ " fim: "+ fila.fim+" cont: "+fila.cont);
        }
        else
            System.out.println("Fila vazia");
        fila.enqueue(5);
        System.out.println("ENQUEUE=> ini: "+ fila.ini+ " fim: "+ fila.fim+" cont: "+fila.cont);
        fila.enqueue(85);
        System.out.println("ENQUEUE=> ini: "+ fila.ini+ " fim: "+ fila.fim+" cont: "+fila.cont);
        fila.enqueue(99);
        System.out.println("ENQUEUE=> ini: "+ fila.ini+ " fim: "+ fila.fim+" cont: "+fila.cont);
        while (!fila.isEmpty()) {
            System.out.println("Valor retirado da fila "+ fila.dequeue());
            System.out.println("DEQUEUE=> ini: "+ fila.ini+ " fim: "+ fila.fim+" cont: "+fila.cont);
        }





		/*Scanner le = new Scanner(System.in);
		 * System.out.print("Quantidade de elementos na fila");
		int n = le.nextInt();
		int fim=0;
		for(int i=0; i<10; i++) {
			fim = fim + 1;
			System.out.println("fim+1: "+ (fim));
			fim = fim%n;
			System.out.println(" proximo indice circular:"+ fim);
		}

    }

}
*/
