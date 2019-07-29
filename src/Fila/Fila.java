package Fila;

import java.util.ArrayList;

public class Fila<L> {

    private No<L> inicio = new No<L>();
    private No<L> fim = inicio;

    public void enfileirar(L valor) {
        No<L> novoNo = new No<L>();
        novoNo.setValor(valor);
        fim.setProx(novoNo);
        fim = novoNo;
    }

    public L desenfileirar() {
        if (filaVazia()) {
            return null;
        }
        inicio = inicio.getProx();
        L valor = inicio.getValor();
        return valor;
    }

    public boolean filaVazia() {
        if (inicio.getProx() == null) {
            return true;
        }
        return false;
    }
    
    public boolean filasIguais(ArrayList<Fila> filasArray) {
        boolean igual = true;
        for(int i = 0; i < (filasArray.size()-1); i++){
            Fila<String> filaAuxA = filasArray.get(0);
            Fila<String> filaAuxB = filasArray.get(i+1);
            if(filaAuxA.filasIguais(filaAuxA, filaAuxB)){
                igual = true;
            } else {
                igual = false;
                return igual;
            }
        }
        return igual;
    }
        
    public boolean filasIguais (Fila<String> a, Fila<String> b) {
        //Criando duas filas que ajudarão a guardar os valores das filas a e b quando os mesmos forem desenfileirados
        Fila<String> auxA = new Fila<String>();
        Fila<String> auxB = new Fila<String>();
        //Criando duas variáveis que ajudarão a desenfileirar as filas e comparar esses valores
        String valorA = null, valorB = null;
        //Criando uma variável para saber se as filas são iguais ou não
        boolean igual = true;
        //Laço para desenfileirar as filas, enquanto alguma delas não esteja vazia
        while(!a.filaVazia() || !b.filaVazia()){
            //Desenfileira a fila a
            if(!a.filaVazia()){
                valorA = a.desenfileirar(); //Desenfileira a "fila a" e salva na variável auxiliar
                auxA.enfileirar(valorA); //Enfileira o valor na "fila auxiliar a"
            }
            //Desenfileira a fila b
            if(!b.filaVazia()){
                valorB = b.desenfileirar(); //Desenfileira a "fila b" e salva na variável auxiliar
                auxB.enfileirar(valorB); //Enfileira o valor na "fila auxiliar b"
            }
            //Verifica se os valores desenfileirados são iguais e atualiza a variável "igual"
            igual = (valorA == null ? valorB == null : valorA.equals(valorB)) && igual;
        }
        //Laço para deixar a "fila a" no estado inicial
        while(!auxA.filaVazia()){
            a.enfileirar(auxA.desenfileirar());
        }
        //Laço para deixar a "fila b" no estado inicial
        while(!auxB.filaVazia()){
            b.enfileirar(auxB.desenfileirar());
        }
        //Retorna se as filas são iguais ou não
        return igual;
    }
}
