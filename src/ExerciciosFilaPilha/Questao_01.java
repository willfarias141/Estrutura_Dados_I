package ExerciciosFilaPilha;

import Fila.Fila;
import Pilha.Pilha;

public class Questao_01 {

    public static void main(String[] args) {
        Fila<String> fila = new Fila<String>();
        fila.enfileirar("a");
        fila.enfileirar("b");
        fila.enfileirar("c");
        fila.enfileirar("d");
        Pilha<String> aux = new Pilha<String>();
        while (!fila.filaVazia()) {
            aux.empilhar(fila.desenfileirar());
        }
        while (!aux.pilhaVazia()) {
            fila.enfileirar(aux.desempilhar());
        }
        while (!fila.filaVazia()) {
            System.out.println(fila.desenfileirar());
        }
    }

}
