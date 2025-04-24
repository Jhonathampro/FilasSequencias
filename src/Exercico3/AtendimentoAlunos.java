package Exercico3;

import java.util.Scanner;

import Filas.FilaInt;

public class AtendimentoAlunos {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		int opcao;
		FilaInt filaAtendimento = new FilaInt();
		filaAtendimento.init();
		do {
			System.out.println("1- Insere o aluno na fila ");
			System.out.println("2- Retira o aluno da fila para o atendimento");
			System.out.println("3 - Encerra atendimento");
			opcao = le.nextInt();
			switch (opcao) {
			case 1:
				System.out.print("Informe RM do aluno: ");
				int rm = le.nextInt();
				filaAtendimento.enqueue(rm);
				break;
			case 2:
				if (!filaAtendimento.isEmpty())
					System.out.println("Aluno a ser atendido: "+ filaAtendimento.dequeue());
				else
					System.out.println("Nao ha alunos aguardando na fila");
				break;
			case 3:
				if (filaAtendimento.isEmpty())
					System.out.println("Encarrado o atendimento");
				else {
					System.out.println("Ainda ha alunos na fila");
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
