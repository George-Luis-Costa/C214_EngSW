package App;

import App.strategy.impl.SelectionSort;

public class OrdenaSelectionSort extends Ordenacao {
    
    public OrdenaSelectionSort() {
        this.strategy = new SelectionSort();
    }
}
