package Exercicio5;

import java.util.Scanner;

import Filas.FilaString;

public class Consultorio {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		int opcao;
		FilaString filaAtendimento = new FilaString();
		filaAtendimento.init();
		do {
			System.out.println("1- Insere o paciente na fila ");
			System.out.println("2- Retira o paciente da fila para o atendimento");
			System.out.println("3- Encerra atendimento");
			opcao = le.nextInt();
			switch (opcao) {
			case 1:
				System.out.print("Informe nome do paciente: ");
				le.nextLine();
				String nome = le.nextLine();
				filaAtendimento.enqueue(nome);
				break;
			case 2:
				if (!filaAtendimento.isEmpty())
					System.out.println("Paciente a ser atendido: "+ filaAtendimento.dequeue());
				else
					System.out.println("Nao ha pacientes aguardando na fila");
				break;
			case 3:
				if (filaAtendimento.isEmpty())
					System.out.println("Encerrado o atendimento");
				else {
					System.out.println("Ainda ha pacientes na fila");
					opcao = 0;
				}
				break;
			default:
				System.out.println("Opcao invalida");
			}
		} while(opcao!=3);
		le.close();

	}

}
