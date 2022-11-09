package App.strategy.impl;

import App.Strategy;

import java.util.List;

public class InsertionSort implements Strategy {

    @Override
    public List<Integer> ordena(List<Integer> lista) {
        int i;
        int j;
        int aux;

        for(j = 1; j < lista.size(); j++) {
            aux = lista.get(j);
            for(i = j - 1; (i >= 0) && (lista.get(i) > aux); i--) {
                lista.set(i + 1, lista.get(i));
            }
            lista.set(i + 1, aux);
        }
        return lista;
    }
    

}
    
