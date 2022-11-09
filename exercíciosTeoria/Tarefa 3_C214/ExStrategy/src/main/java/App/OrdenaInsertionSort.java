package App;

import App.strategy.impl.InsertionSort;

public class OrdenaInsertionSort extends Ordenacao {
    
    public OrdenaInsertionSort() {
        this.strategy = new InsertionSort();
    }
}
