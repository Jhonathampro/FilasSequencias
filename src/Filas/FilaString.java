package Filas;

public class FilaString {
	
	public final int N = 10;
	String[] dados = new String[N];
	public int ini, fim, cont;
	
	public void init() {
		ini=fim=cont=0;
	}
	public boolean isEmpty() {
		return(cont == 0) ;
	}
	public boolean isFull() {
		return (cont == N); 
	}
	public void enqueue(String elem) {
		if (isFull())
			System.out.println("Fila cheia!");
		else {
			dados[fim] = elem;
			fim = (fim+1) % N;
			cont++;
		}
	}
	public String dequeue() {
		String v = dados[ini];
		ini = (ini+1) % N;
		cont--;
		return v;
	}

}
