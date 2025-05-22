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

    // esse método é para remover um item na lista, esse parametro valor, foi o número que
    // o úsuario passou para remover.
    public void remove(int valor ){
        // primeiramente vejo se lista está nula;
        if(lista!=null){
            // essa verificação é caso o valor a ser removido seja o primeiro na lista.
            // ou seja lista sempre é o primeiro dado, é caso seja igual ao número passado
            // pelo usario eu removo fazendo uma sobreposição.
            // Essa sebreposição funciona assim: exemplo da lista 2, 4, 8, null
            // valor que o usúrio passou para remover: 2, primeiro valor ou seja lista.
            // então pego lista.prox que é o 4, e coloco esse valor em lista, assim
            // sobrepondo o valor 2 de lista. deixando a lista assim agora: (4, 8, null)
            if(lista.dado==valor){
                lista = lista.prox;

            }
            // esse else começa a procura a partir do segundo elemento da lista
            // porque o primeiro, vai ser tratado pelo if.
            else {
                NO aux = lista;
                boolean achou = false;
                // aqui é parecido com a inserção, então vou fazer um exemplo: Lista(2, 4, 6, 8, null)
                // o elemento que o usario que tirar é o 6, e vou para dentro do while
                // em primeiro momento o aux é igual a 2, ai faço a verificação no if abaixo,
                // aux.prox.dado ou seja 4, que é diferente de 6, fazendo o if ser falso.
                // logo vou para o else, e passo para o aux o aux.prox que é 4;
                // ainda dentro do while, vou para o if, aux agora é 4.
                // aux.prox.dado é 6, assim sendo igual o valor que o usúario passou.
                // portanto atende o if passou o true para o achou para encerrar o while,
                // e passo para o aux.prox o aux.prox.prox, ou seja o 8, fazendo a sobreposição.
                // logo o aux.prox que apontava para 6, quebro essa coneção fazendo apontar para 8.
                // aux = 4, aux.prox = 6, aux.prox.prox 8
                // tornando a lista(2, 4, 8, null).
                while(aux.prox!=null && !achou){
                    if(aux.prox.dado == valor){
                        achou = true;
                        aux.prox = aux.prox.prox;
                    } else {
                        aux = aux.prox;
                    }

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
        // está na lista(primeiro que tem o menor valor). Ai o prox de novo recebe a lista que foi o elemento que entrou primeiro
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
