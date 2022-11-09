package App;

import App.strategy.impl.QuickSort;

public class OrdenaQuickSort extends Ordenacao {

    public OrdenaQuickSort() {
        this.strategy = new QuickSort();

    }
}
