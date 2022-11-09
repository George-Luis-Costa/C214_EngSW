package App.strategy.impl;

import App.Strategy;

import java.util.List;

public class QuickSort implements Strategy {
    @Override
    public List<Integer> ordena(List<Integer> lista){
       return ordenaQuick(lista, 0,lista.size()-1 );
    }

    public List<Integer> ordenaQuick(List<Integer> lista, int inicio, int fim) {

            if (inicio < fim) {
                int posicaoPivo = separar(lista, inicio, fim);
                ordenaQuick(lista, inicio, posicaoPivo - 1);
                ordenaQuick(lista, posicaoPivo + 1, fim);
            }

        return lista;
    }

    private static int separar ( List<Integer> lista, int inicio, int fim){
        int pivo = lista.get(inicio);
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (lista.get(i) <= pivo)
                i++;
            else if (pivo < lista.get(f))
                f--;
            else {
                int troca = lista.get(i);
                lista.set(i, lista.get(f));
                lista.set(f, troca);
                i++;
                f--;
            }
        }
        lista.set(inicio, lista.get(f));
        lista.set(f, pivo);
        return f;
    }
}