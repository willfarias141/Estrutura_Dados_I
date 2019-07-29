package ListaSimples;

public class ListaSimples<L> {

    private No<L> cabeca = new No<L>();
    private No<L> fim = cabeca;

    public void inserirInicio(L valor) {
        inserir(valor, cabeca, cabeca.getProx());
    }

    public void inserirFinal(L valor) {
        // Sem utiliar a variável Fim
        /*
        No aux = cabeca.getProx();
        No ant = cabeca;
        while (aux != null) {
            ant = aux;
            aux=aux.getProx();
        }
         */

        // Utilizando a variável FIM
        inserir(valor, fim, null);
    }

    public void inserirEmOrdem(L valor) {
        No ant = cabeca;
        No pos = cabeca.getProx();
        while (pos != null) {
            L vl = (L) pos.getValor();
            if (((Comparable<L>) valor).compareTo(vl) < 0) {
                //achei a posicao onde deve ser inserido
                break;
            } else {
                ant = pos;
                pos = pos.getProx();
            }
        }
        inserir(valor, ant, pos);
    }

    private void inserir(L valor, No ant, No pos) {
        No<L> novoNo = new No<L>();
        novoNo.setValor(valor);
        ant.setProx(novoNo);
        novoNo.setProx(pos);
        if (pos == null) {
            fim = novoNo;
        }
    }

    public boolean vazia() {
        return fim == cabeca;
    }

    public void removerInicio() {
        if (vazia()) {
            System.out.println("Lista vazia!");
        } else {
            No aux = cabeca.getProx();
            cabeca.setProx(aux.getProx());
        }
    }

    public void removerFinal() {
        if (vazia()) {
            System.out.println("Lista vazia!");
        } else {
            No aux = cabeca.getProx();
            while (aux.getProx().getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(null);
            fim = aux;
        }
    }

    public void remover(L valor) {
        No aux = cabeca;
        while (!aux.getProx().getValor().equals(valor)) {
            aux = aux.getProx();
        }
        aux.setProx(aux.getProx().getProx());
        if (aux.getProx() == null) {
            fim = aux;
        }
    }

    public void imprimir() {
        No aux = cabeca.getProx();
        System.out.print("[");
        while (aux != null) {
            System.out.print(aux.getValor() + " ");
            aux = aux.getProx();
        }
        System.out.println("]");
    }

    public ListaSimples<Integer> inserirVetor(int[] vetor) {
        ListaSimples<Integer> listaNova = new ListaSimples<Integer>();
        for (int i = 0; i < vetor.length; i++) {
            listaNova.inserirFinal(vetor[i]);
        }
        return listaNova;
    }

    public ListaSimples<L> separar(L valor) {
        ListaSimples<L> l2 = new ListaSimples<L>();
        No aux = cabeca.getProx();
        while (!aux.getValor().equals(valor)) {
            aux = aux.getProx();
        }
        l2.cabeca.setProx(aux.getProx());
        l2.fim = fim;
        fim = aux;
        aux.setProx(null);
        return l2;
    }

    public ListaSimples<L> concatena(ListaSimples<L> l1, ListaSimples<L> l2) {
        No aux1 = l1.cabeca;
        while (aux1.getProx() != null) {
            aux1 = aux1.getProx();
        }
        No aux2 = l2.cabeca.getProx();
        aux1.setProx(aux2);
        return l1;
    }

    public ListaSimples<L> removerN(ListaSimples<L> lista, int numero) {
        No aux = lista.cabeca.getProx();
        for (int i = numero; aux != null && numero > 0; numero--) {
            lista.removerInicio();
            aux = aux.getProx();
        }
        return lista;
    }
}
