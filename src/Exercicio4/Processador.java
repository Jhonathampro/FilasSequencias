package Exercicio4;

import java.util.Scanner;

import Filas.FilaInt;

public class Processador {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		int opcao;
		FilaInt filaProcessos = new FilaInt();
		filaProcessos.init();
		do {
			System.out.println("1- Insere processo na fila ");
			System.out.println("2- Retira o processo da fila para execucao");
			System.out.println("3- Shutdown");
			opcao = le.nextInt();
			switch (opcao) {
			case 1:
				System.out.print("Informe pid do processo: ");
				int pid = le.nextInt();
				filaProcessos.enqueue(pid);
				break;
			case 2:
				if (!filaProcessos.isEmpty()) {
					pid = filaProcessos.dequeue();
					System.out.println("Processo em execucao: " + pid);
					System.out.print("Processo " + pid + " concluiu sua execucao? (1-sim)");
					int resp = le.nextInt();
					if (resp == 1)
						System.out.println("Processo concluido com sucesso");
					else {
						filaProcessos.enqueue(pid);
						System.out.println("Processo voltou para a fila de processos");
					}
				} else
					System.out.println("Nao ha processos aguardando na fila");
				break;
			case 3:
				if (filaProcessos.isEmpty())
					System.out.println("Shutdown...");
				else {
					System.out.print("Ainda ha processos na fila.\nDeseja encerrar mesmo assim? (1-sim): ");
					int resp = le.nextInt();
					if (resp == 1) {
						while (!filaProcessos.isEmpty()) {
							System.out.println("Processo encerrado "+ filaProcessos.dequeue());
						}
					} else
						opcao = 0;
				}
				break;
			default:
				System.out.println("Opcao invalida");
			}
		} while (opcao != 3);
		System.out.println("Shutdown efetuado");
		le.close();

	}

}
