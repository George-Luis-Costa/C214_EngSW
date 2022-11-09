package App;

import App.strategy.impl.BubbleSort;
import App.strategy.impl.InsertionSort;
import App.strategy.impl.QuickSort;
import App.strategy.impl.SelectionSort;
import org.junit.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TestOrdenacao {
    Ordenacao ordenacao;
    List<Integer> lista;
    List<Integer> esperado;

    @Before
    public void init() {
        lista = Arrays.asList(4, 3, 2, 1, 5, 6, 8, 7);
        esperado = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    }

    @Test
    public void testSelectionSort() {
        ordenacao = new OrdenaSelectionSort();
        assertTrue(ordenacao.getStrategy() instanceof SelectionSort);
    }

    @Test
    public void testOrdenaSelectionSort() {
        ordenacao = new OrdenaSelectionSort();

        List<Integer> resultado = ordenacao.ordena(lista);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testBubbleSort() {
        ordenacao = new OrdenaBubbleSort();
        assertTrue(ordenacao.getStrategy() instanceof BubbleSort);
    }

    @Test
    public void testOrdenaBubbleSort() {
        ordenacao = new OrdenaBubbleSort();

        List<Integer> resultado = ordenacao.ordena(lista);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testInsertionSort() {
        ordenacao = new OrdenaInsertionSort();
        assertTrue(ordenacao.getStrategy() instanceof InsertionSort);
    }

    @Test
    public void testOrdenaInsertionSort() {
        ordenacao = new OrdenaInsertionSort();

        List<Integer> resultado = ordenacao.ordena(lista);
        assertEquals(esperado, resultado);
    }
    @Test
    public void testQuickSort() {
        ordenacao = new OrdenaQuickSort();
        assertTrue(ordenacao.getStrategy() instanceof QuickSort);
    }

    @Test
    public void testOrdenaQuickSort() {
        ordenacao = new OrdenaQuickSort();

        List<Integer> resultado = ordenacao.ordena(lista);
        assertEquals(esperado, resultado);
    }
}