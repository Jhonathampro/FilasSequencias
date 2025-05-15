package EncadeadaSimples;

import java.util.Scanner;

public class MainTeste {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        ListaIntCrescente lista = new ListaIntCrescente();
        System.out.println("Valor positivo insere(Negativo encerra): ");
        int valor = sc.nextInt();
        while(valor>0){
            lista.inserir(valor);
            lista.mostra();
            System.out.println("Valor positivo insere(Negativo encerra): ");
            valor = sc.nextInt();
        }

        System.out.println("Valor positivo remove(Negativo encerra): ");
        valor = sc.nextInt();

        while(valor>=0){
            lista.remove(valor);
            lista.mostra();
            System.out.println("Valor positivo remove(Negativo encerra): ");
            valor = sc.nextInt();
        }
    }
}
