package Pilha;

public class Main {

    public static void main(String[] args) {
        System.out.println("Questão 01: Comparar se duas pilhas são iguais");
        Pilha<String> p1 = new Pilha<String>();
        p1.empilhar("B");
        p1.empilhar("A");
        p1.empilhar("C");
        p1.empilhar("D");
        Pilha<String> p2 = new Pilha<String>();
        p2.empilhar("C");
        p2.empilhar("B");
        p2.empilhar("A");
        p2.empilhar("D");
        p2.empilhar("D");
        //p2.empilhar("E");
        Pilha<String> aux1 = new Pilha<String>();
        Pilha<String> aux2 = new Pilha<String>();
        String a, b;
        boolean igual = false;
        while (!p1.pilhaVazia()) {
            a = p1.desempilhar();
            igual = false;
            while (!p2.pilhaVazia()) {
                b = p2.desempilhar();
                if (a.equals(b)) {
                    igual = true;
                }
                aux2.empilhar(b);
            }
            if (!igual) {
                break;
            }
            while (!aux2.pilhaVazia()) {
                p2.empilhar(aux2.desempilhar());
            }
            aux1.empilhar(a);
        }
        while (!aux1.pilhaVazia()) {
            p1.empilhar(aux1.desempilhar());
        }
        while (!p2.pilhaVazia()) {
            a = p2.desempilhar();
            igual = false;
            while (!p1.pilhaVazia()) {
                b = p1.desempilhar();
                if (a.equals(b)) {
                    igual = true;
                }
                aux2.empilhar(b);
            }
            if (!igual) {
                break;
            }
            while (!aux2.pilhaVazia()) {
                p1.empilhar(aux2.desempilhar());
            }
            aux1.empilhar(a);
        }
        while (!aux1.pilhaVazia()) {
            p2.empilhar(aux1.desempilhar());
        }
        if (igual) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
