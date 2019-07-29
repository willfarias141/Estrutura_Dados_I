package ExerciciosFilaPilha;

public class Questao_03 {
    
    public static void main(String[] args) {
        PilhaDoida p = new PilhaDoida();
        System.out.println(p.desempilhar());
        p.empilhar("A");
        p.empilhar("B");
        p.empilhar("C");
        System.out.println(p.desempilhar());
        p.empilhar("D");
        p.empilhar("E");
        System.out.println(p.desempilhar());
        System.out.println(p.desempilhar());
        System.out.println(p.desempilhar());
        System.out.println(p.desempilhar());
    }
    
}
