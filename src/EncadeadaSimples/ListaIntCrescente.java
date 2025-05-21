package EncadeadaSimples;

public class ListaIntCrescente {

    private class NO{
        int dado;
        NO prox;
    }
    private NO lista = null;

    public void mostra(){
        System.out.println("***************** Apresentação da lista *******************");
        NO aux = lista;
        while(aux!=null){
            System.out.print(aux.dado+"\t");
            aux = aux.prox;
        }

    }

    public void remove(int valor ){
        if(lista!=null){
            if(lista.dado==valor){
                lista = lista.prox;
            } else {
                NO aux = lista;
                boolean achou = false;
                while(aux.prox!=null && !achou){
                    if(aux.prox.dado == valor){
                        achou = true;
                    } else {
                        aux = aux.prox;
                    }
                    aux.prox = aux.prox.prox;
                }
            }
        }
    }

    public void inserir(int elem){
        NO novo = new NO();
        novo.dado = elem;
        // esse if é o inicio da lista, onde vejo que a lista está vazia.
        if(lista == null){
            lista = novo;
            lista.prox = null;
        }
        // essa lista está para ser ordenada em ordem crescente:::
        // aqui caso a lista tenha algum elemento. Verifico se o novo dado for menor que o dado que
        // está na lista. Ai o prox de novo recebe a lista que foi o elemento que entrou primeiro
        // e lista recebe o novo.
        // exe: Inicialmente lista é igual a 8 e o prox é null, ai vou inserir o 4, esse 4 é o novo.
        // esse novo.prox recebe 8 que é a lista.
        // lista que antes era 8 agora recebe 4 que era novo.
        // faço todo esse passo a passo para não perder os elementos.
        else if (novo.dado < lista.dado){
            // essa lista tem o valor de prox igual a null
            // mas para acessar teria que fazer lista.prox.prox;
            novo.prox = lista;
            lista = novo;
        } else {
            // inicialmente aux recebe o primeiro valor da minha lista
            NO aux = lista;
            boolean achou = false;
            // aqui é para inseir um elemento no meio da lista, exemplo: quero inserir 6
            // mas já tenho o 2, 4, 8 e null
            // inicialmente aux é 2 pois recebe lista. ai entro no while porque tem condição
            // sendo satifeita, e o achou sendo false.
            // vou para o if e faço a verificação do prox do valor 2 que é (aux.prox.dado = 4)
            // novo.dado é 6, então atende a condição, então executo o codigo,
            //  (aux = aux.prox) agora o aux vira o valor 4
            // faço a verificação do if novamente do prox do valor 4  (aux.prox.dado = 8)
            // novo dado é 6, agora não atende a condição do if porque 8 é maior que 6
            // então achou recebe true, e sai do while porque aux.prox nesse momento é 8
            // é achou é true (resto da explicação abaixo)
            while(aux.prox!=null && !achou){
                if(aux.prox.dado < novo.dado){
                    aux = aux.prox;
                } else {
                    achou = true;
                }
            }
            // agora o aux.prox que é 8 vai para novo.prox do 6
            // e o novo que é 6 vai para o aux.prox do 4
            // deixando a lista 2, 4, 6, 8 e null
            novo.prox = aux.prox;
            aux.prox = novo;
        }
    }

}
