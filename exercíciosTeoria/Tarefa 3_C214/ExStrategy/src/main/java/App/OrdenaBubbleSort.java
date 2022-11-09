package App;

import App.strategy.impl.BubbleSort;

public class OrdenaBubbleSort extends Ordenacao {
    
    public OrdenaBubbleSort() {
        this.strategy = new BubbleSort();
    }
}
