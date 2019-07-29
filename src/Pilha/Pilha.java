package Pilha;

public class Pilha<L> {

    private No<L> topo = new No<L>();

    public void empilhar(L valor) {
        No<L> novoNo = new No<L>();
        novoNo.setValor(valor);
        novoNo.setProx(topo);
        topo = novoNo;
    }

    public L desempilhar() {
        L valor;
        if (pilhaVazia()) {
            return null;
        }
        valor = topo.getValor();
        topo = topo.getProx();
        return valor;
    }

    public boolean pilhaVazia() {
        if (topo.getProx() == null) {
            return true;
        }
        return false;
    }
}
