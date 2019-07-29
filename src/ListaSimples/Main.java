package ListaSimples;

public class Main {

    public static void main(String[] args) {
        ListaSimples<String> lista = new ListaSimples<String>();
        lista.inserirFinal("C");
        lista.inserirFinal("B");
        lista.inserirEmOrdem("D");
        lista.inserirInicio("A");
        lista.inserirEmOrdem("F");
        lista.imprimir();

        System.out.println("Exercício 1- Separar lista");
        ListaSimples<Integer> l1 = new ListaSimples<Integer>();
        l1.inserirInicio(3);
        l1.inserirFinal(17);
        l1.inserirFinal(5);
        l1.inserirFinal(12);
        l1.inserirFinal(1);
        l1.imprimir();
        ListaSimples<Integer> l2 = new ListaSimples<Integer>();
        ListaSimples<Integer> l = new ListaSimples<Integer>();
        l2 = l1.separar(5);
        System.out.print("L1: ");
        l1.imprimir();
        System.out.print("L2: ");
        l2.imprimir();

        System.out.println("Exercício 2- Concatenar lista");
        ListaSimples<Integer> l3 = new ListaSimples<Integer>();
        l3 = l3.concatena(l1, l2);
        l3.imprimir();

        System.out.println("Exercício 3- Construir lista do vetor");
        ListaSimples<Integer> listaVetor = new ListaSimples<Integer>();
        int numeros[] = new int[5];
        numeros[0] = 3;
        numeros[1] = 8;
        numeros[2] = 1;
        numeros[3] = 7;
        numeros[4] = 2;
        listaVetor = listaVetor.inserirVetor(numeros);
        listaVetor.imprimir();

        System.out.println("Exercício 4- Remover n primeiros nós");
        int num = 3;
        lista.imprimir();
        lista.removerN(lista, num);
        lista.imprimir();
    }
}
