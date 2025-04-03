package Filas;

public class FilaInt {

    public final int N = 3;
    int [] dados = new int[N];
    int ini, fim, cont;

    public void init(){
        ini = fim = cont = 0;
    }
    public boolean isEmpty () {
        return(cont == 0);
    }
    public boolean isFull(){
        return (cont == N);
    }
    public void enqueue (int elem){
        if(isFull())
            System.out.println("Fila cheia!");
        else {
            dados[fim] = elem;
            fim = (fim + 1) % N;
            cont ++;
        }
    }
    public int dequeue (){
        int v = dados[ini];
        ini = (ini + 1) % N;
        // Aqui faço o resto da divisão para ficar ciclico, e isso significa que fica um
        // intervalo, por exemplo de 0 a 5.
        // com a ideia da fila circular.
        // exemplo meu circulo tem tamanho 3
        // ini = (ini + 1) % N
        // mei inicio ta no indice 2
        // ini = (2 + 1) % N
        // faço essa conta para não passar o tamanho do vetor
        // porque nesse exemplo ela ficaria igual o tamanho da fila que é 3;
        // ini = 0;
        cont--;
        return v;
    }
}
