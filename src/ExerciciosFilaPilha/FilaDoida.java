package ExerciciosFilaPilha;

import Pilha.Pilha;

public class FilaDoida<L> {
    private Pilha<String> p1 = new Pilha<String>();
    private Pilha<String> p2 = new Pilha<String>();
    
    public void enfileirar(String valor){
        if(!p2.pilhaVazia()){
            while(!p2.pilhaVazia()){
                p1.empilhar(p2.desempilhar());
            }
        }
        p1.empilhar(valor);
    }
    
    public String desenfileirar(){
        while(!p1.pilhaVazia()){
            p2.empilhar(p1.desempilhar());
        }
        return p2.desempilhar();
    }
}
