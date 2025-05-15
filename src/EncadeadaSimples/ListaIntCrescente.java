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
        if(lista == null){
            lista = novo;
            lista.prox = null;
        } else if (novo.dado < lista.dado){
            novo.prox = lista;
            lista = novo;
        } else {
            NO aux = lista;
            boolean achou = false;
            while(aux.prox!=null && !achou){
                if(aux.prox.dado < novo.dado){
                    aux = aux.prox;
                } else {
                    achou = true;
                }
            }
            novo.prox = aux.prox;
            aux.prox = novo;
        }
    }

}
