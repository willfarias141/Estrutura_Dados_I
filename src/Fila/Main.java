package Fila;

public class Main {

    public static void main(String[] args) {
        System.out.println("Questão 1- excluir todos os números negativos");
        Fila<Integer> numeros = new Fila<Integer>();
        numeros.enfileirar(3);
        numeros.enfileirar(-2);
        numeros.enfileirar(6);
        numeros.enfileirar(-3);
        numeros.enfileirar(-1);
        numeros.enfileirar(0);
        numeros.enfileirar(1);
        int aux;
        Fila<Integer> filaAux = new Fila<Integer>();
        while (!numeros.filaVazia()) {
            aux = numeros.desenfileirar();
            if (aux >= 0) {
                filaAux.enfileirar(aux);
            } else {
                filaAux.enfileirar(null);
            }
        }
        while(!filaAux.filaVazia()){
            numeros.enfileirar(filaAux.desenfileirar());
        }
        System.out.println(numeros.desenfileirar());
        System.out.println(numeros.desenfileirar());
        System.out.println(numeros.desenfileirar());
        System.out.println(numeros.desenfileirar());
        System.out.println(numeros.desenfileirar());
        System.out.println(numeros.desenfileirar());
        System.out.println(numeros.desenfileirar());
    }
}
