package ExerciciosFilaPilha;

import Fila.Fila;

public class PilhaDoida {

    private Fila<String> f1 = new Fila<String>();
    private Fila<String> f2 = new Fila<String>();

    public void empilhar(String valor) {
        f1.enfileirar(valor);
    }

    public String desempilhar() {
        String temp = null;
        while (!f1.filaVazia()) {
            temp = f1.desenfileirar();
            if (f1.filaVazia()) {
                while (!f2.filaVazia()) {
                    f1.enfileirar(f2.desenfileirar());
                }
                return temp;
            }
            f2.enfileirar(temp);
        }
        return temp;
    }
}
