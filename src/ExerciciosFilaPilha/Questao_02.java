package ExerciciosFilaPilha;

public class Questao_02 {
    
    public static void main(String[] args) {
        FilaDoida<String> f1 = new FilaDoida<String>();
        System.out.println(f1.desenfileirar());
        f1.enfileirar("A");
        f1.enfileirar("B");
        System.out.println(f1.desenfileirar());
        f1.enfileirar("C");
        f1.enfileirar("D");
        System.out.println(f1.desenfileirar());
        System.out.println(f1.desenfileirar());
        System.out.println(f1.desenfileirar());
    }
    
}
