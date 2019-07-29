package ListaDupla;

public class ListaDupla<L> {

    No<L> cabeca = new No<L>();
    No<L> fim = cabeca;

    public void inserirInicio(L valor) {
        No novo = new No();
        novo.setValor(valor);
        if (vazia()) {
            cabeca.setProx(novo);
            novo.setAnt(cabeca);
            fim = novo;
        } else {
            novo.setProx(cabeca.getProx());
            cabeca.setProx(novo);
            novo.setAnt(cabeca);
            cabeca.getProx().getProx().setAnt(novo);
        }
    }

    private void inserir(L valor, No ant, No pos) {
        No<L> novoNo = new No<L>();
        novoNo.setValor(valor);
        ant.setProx(novoNo);
        novoNo.setAnt(ant);
        novoNo.setProx(pos);
        if (pos == null) {
            fim = novoNo;
        }
    }

    public void inserirFinal(L valor) {
        inserir(valor, fim, null);
    }

    public void inserirEmOrdem(L valor) {
        No ant = cabeca;
        No pos = cabeca.getProx();
        while (pos != null) {
            L vl = (L) pos.getValor();
            if (((Comparable<L>) valor).compareTo(vl) < 0) {
                break;
            } else {
                ant = pos;
                pos = pos.getProx();
            }
        }
        inserir(valor, ant, pos);
    }

    public void inserirEmOrdemSemRepetir(L valor) {
        No ant = cabeca;
        No pos = cabeca.getProx();
        boolean diferente = true;
        while (pos != null) {
            L vl = (L) pos.getValor();
            if (((Comparable<L>) valor).compareTo(vl) == 0) {
                diferente = false;
                break;
            } else {
                if (((Comparable<L>) valor).compareTo(vl) < 0) {
                    break;
                } else {
                    ant = pos;
                    pos = pos.getProx();
                }
            }
        }
        if (diferente) {
            inserir(valor, ant, pos);
        }
    }

    public void inserirUniao(L valor, ListaDupla<String> l4) {
        No ant = cabeca;
        No pos = cabeca.getProx();
        boolean inserir = true;
        while (pos != null) {
            L vl = (L) pos.getValor();
            if (((Comparable<L>) valor).compareTo(vl) == 0) {
                inserir = false;
                l4.inserirEmOrdem((String) valor);
                break;
            } else {
                if (((Comparable<L>) valor).compareTo(vl) < 0) {
                    break;
                } else {
                    ant = pos;
                    pos = pos.getProx();
                }
            }
        }
        if (inserir) {
            inserir(valor, ant, pos);
        }
    }

    public boolean vazia() {
        return cabeca.getProx() == null;
    }

    public void excluirInicio() {
        if (!vazia()) {
            No aux = cabeca.getProx();
            excluir(aux);
        }
    }

    public void excluir(No aux) {
        aux.getAnt().setProx(aux.getProx());
        if (aux.getProx() != null) {
            aux.getProx().setAnt(aux.getAnt());
        } else {
            fim = aux.getAnt();
        }

    }

    public void excluirMeio(L valor) {
        No aux = cabeca.getProx();
        while (aux != null) {
            if (valor.equals(aux.getValor())) {
                excluir(aux);
                break;
            } else {
                aux = aux.getProx();
            }
        }
    }

    public void imprimir() {
        No aux = cabeca.getProx();
        System.out.print("[");
        while (aux != null) {
            System.out.print(aux.getValor() + " ");
            aux = aux.getProx();
        }
        System.out.print("]\n");
    }

    public String retorna() {
        return (String) cabeca.getProx().getValor();
    }
}
