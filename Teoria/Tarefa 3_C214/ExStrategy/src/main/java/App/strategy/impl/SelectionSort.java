package App.strategy.impl;

import App.Strategy;

import java.util.List;
public class SelectionSort implements Strategy {

    @Override
    public List<Integer> ordena(List<Integer> lista) {
        for(int fixo = 0; fixo < lista.size() - 1; fixo++) {
            int menor = fixo;
            for(int i = menor + 1; i < lista.size(); i++) {
                if(lista.get(i) < lista.get(menor)) {
                    menor = i;
                }
            }
            if(fixo != menor) {
                int t = lista.get(fixo);
                lista.set(fixo, lista.get(menor));
                lista.set(menor, t);
            }
        }
        return lista;
    }

}
