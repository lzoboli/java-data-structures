import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdenacaoAbstractTest {
    @Test
    public void q2Teste1() {
        // Validar algoritmo de ordenação Bolha
        Integer[] vetor = {70, 2, 88, 15, 90, 30};
        Integer[] esperado = {2, 15, 30, 70, 88, 90};

        OrdenacaoBolha<Integer> ordenacao = new OrdenacaoBolha<>();
        ordenacao.setInfo(vetor);
        ordenacao.ordenar();

        assertArrayEquals(esperado, ordenacao.getInfo());
    }

    @Test
    public void q2Teste2() {
        // Validar algoritmo de ordenação bolha otimizado
        Integer[] vetor = {70, 2, 88, 15, 90, 30};
        Integer[] esperado = {2, 15, 30, 70, 88, 90};

        OrdenacaoBolhaOtimizada<Integer> ordenacao = new OrdenacaoBolhaOtimizada<>();
        ordenacao.setInfo(vetor);
        ordenacao.ordenar();

        assertArrayEquals(esperado, ordenacao.getInfo());
    }

    @Test
    public void q2Teste3() {
        // Validar algoritmo de ordenação Quicksort
        Integer[] vetor = {70, 2, 88, 15, 90, 30};
        Integer[] esperado = {2, 15, 30, 70, 88, 90};

        OrdenacaoQuickSort<Integer> ordenacao = new OrdenacaoQuickSort<>();
        ordenacao.setInfo(vetor);
        ordenacao.ordenar();

        assertArrayEquals(esperado, ordenacao.getInfo());
    }

    @Test
    public void q2Teste4() {
        // Validar algoritmo de ordenação MergeSort
        Integer[] vetor = {70, 2, 88, 15, 90, 30};
        Integer[] esperado = {2, 15, 30, 70, 88, 90};

        OrdenacaoMergeSort<Integer> ordenacao = new OrdenacaoMergeSort<>();
        ordenacao.setInfo(vetor);
        ordenacao.ordenar();

        assertArrayEquals(esperado, ordenacao.getInfo());
    }
}