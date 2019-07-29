package ListaDupla;

public class Questao_01 {
    
    public static void main(String[] args) {
        ListaDupla<String> l1 = new ListaDupla<String>();
        l1.inserirFinal("A");
        l1.inserirFinal("B");
        l1.inserirFinal("C");
        l1.inserirFinal("D");
        System.out.print("L1: ");
        l1.imprimir();
        ListaDupla<String> l2 = new ListaDupla<String>();
        l2.inserirFinal("C");
        l2.inserirFinal("A");
        l2.inserirFinal("D");
        l2.inserirFinal("E");
        l2.inserirFinal("F");
        System.out.print("L2: ");
        l2.imprimir();
        ListaDupla<String> l3 = new ListaDupla<String>();
        ListaDupla<String> l4 = new ListaDupla<String>();
        while(!l1.vazia()){
            l3.inserirEmOrdemSemRepetir(l1.retorna());
            l1.excluirInicio();
        }
        while(!l2.vazia()){
            l3.inserirUniao(l2.retorna(), l4);
            l2.excluirInicio();
        }
        System.out.print("L3: ");
        l3.imprimir();
        System.out.print("L4: ");
        l4.imprimir();
    }
    
}
