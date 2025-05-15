package Dinamico02;

public class Ex2_ListaEncadeada {
    public static void main(String[] args) {

        No lista = new No();
        lista.dado = 1;
        lista.prox = null;

        No novo = new No();
        novo.dado = 2;
        novo.prox = null;


        lista.prox = novo;
        System.out.println("Lista "+ lista +"\tdado : "+lista.dado +"\t prox: "+ lista.prox);
        System.out.println("novo "+ novo + "\t dado : "+ novo.dado + "\t prox: "+ novo.prox);
        System.out.println("--------------------------------------------------------------------");
        No novo2 = new No();
        novo2.dado = 3;
        novo2.prox = lista;
        System.out.println("Lista " + lista + "\t dado : " + lista.dado + "\t prox: " + lista.prox);
        System.out.println("novo " + novo + "\t dado : " + novo.dado + "\t prox: " + novo.prox);
        System.out.println("novo2 " + novo2 +"\t dado2 : " +novo2.dado +"\t prox: " +novo2.prox);

        lista = novo2;
        System.out.println("---------------------------");
        No aux = lista;
        while(aux != null){
            System.out.println("dado " + aux.dado);
            aux = aux.prox;
        }
        // o primeiro valor que ele aponta é o três porque aux aponta para lista que recebeu o
        // endereço de novo2 que tem o dado 3
        // o segundo valor é 1, porque o prox do novo2 e do dado 3, é a lista que tem o valor 1

    }
}
