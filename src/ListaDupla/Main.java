package ListaDupla;

public class Main {
    
    public static void main(String[] args) {
        ListaDupla<String> ld = new ListaDupla<String>();
        
        ld.inserirInicio("C");
        ld.inserirInicio("B");
        ld.inserirInicio("A");
        
        ld.imprimir();
        ld.excluirMeio("B");
        ld.imprimir();
    }
}
