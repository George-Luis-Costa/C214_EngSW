package C214;

import C214.impl.Observador;
import C214.impl.Observavel;

public class Main {
    public static void main(String[] args) {
        Observavel observavel = new Observavel();

        Observador observador1 = new Observador(1);
        Observador observador2 = new Observador(2);
        Observador observador3 = new Observador(3);

        observavel.adicionarObservador(observador1);
        observavel.adicionarObservador(observador2);
        observavel.adicionarObservador(observador3);

        String frase = "Matrix 4 é uma merda";

        observavel.contarPalavras(frase);
        observavel.contarPalavrasPares(frase);
        observavel.contarPalavrasComecadasComMaiuscula(frase);

        //Notificando observadores
        System.out.println("\n\n*Notificando observadores");
        observavel.notificarObservadores();
        System.out.println("--------------------------------------------------");

        //Removendo observador
        observavel.removerObservador(observador2);

        //Notificando observadores
        System.out.println("\n\n*Notificando observadores");
        observavel.notificarObservadores();
        System.out.println("--------------------------------------------------");

        //Removendo observador
        observavel.removerObservador(observador1);

        //Notificando observadores
        System.out.println("\n\n*Notificando observadores");
        observavel.notificarObservadores();
        System.out.println("--------------------------------------------------");
    }
}
