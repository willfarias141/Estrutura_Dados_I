package Fila;

import java.util.ArrayList;

public class Questao_02 {
        
    public static void main(String[] args) {
        // Instanciando as duas filas, a, b e c
        Fila<String> a = new Fila<String>();
        Fila<String> b = new Fila<String>();
        Fila<String> c = new Fila<String>();
        
        //Setando valores na fila a
        a.enfileirar("A");
        a.enfileirar("B");
        a.enfileirar("C");
        a.enfileirar("D");
        //Setando valores na fila b
        b.enfileirar("A");
        b.enfileirar("B");
        b.enfileirar("C");
        b.enfileirar("D");
        //Setando valores na fila c
        c.enfileirar("A");
        c.enfileirar("B");
        c.enfileirar("C");
        c.enfileirar("D");
        
        //Criando um arraylist de filas
        ArrayList<Fila> filasArray = new ArrayList<Fila>();
        filasArray.add(a);
        filasArray.add(b);
        filasArray.add(c);
        
        System.out.println("As filas do ArrayList são iguais? " + a.filasIguais(filasArray));
        System.out.println("-----------------------------------------");
                        
        //Verificando e imprimindo se as filas são iguais
        System.out.println("As filas A e B são iguais? " + a.filasIguais(a, b));
        
        //Mostrando que a fila A continua a mesma
        if(a.filaVazia()) {
            System.out.print("Fila A: vazia!");
        } else {
            System.out.print("Fila A: ");
            while(!a.filaVazia()){
                System.out.print(a.desenfileirar());
            }
        }
        
        //Mostrando que a fila B continua a mesma
        if(b.filaVazia()) {
            System.out.print("\nFila B: vazia!");
        } else {
            System.out.print("\nFila B: ");
            while(!b.filaVazia()){
                System.out.print(b.desenfileirar());
            }
        }        
    }
}
