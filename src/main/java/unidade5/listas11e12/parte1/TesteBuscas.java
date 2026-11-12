package unidade5.listas11e12.parte1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TesteBuscas {

    @Test
    void q2Teste1() {
        Integer[] vetor = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        BuscaLinear<Integer> busca = new BuscaLinear<>(vetor);
        assertEquals(2, busca.buscar(20));
    }

    @Test
    void q2Teste2() {
        Integer[] vetor = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        BuscaLinearVetorOrdenado<Integer> busca = new BuscaLinearVetorOrdenado<>(vetor);
        assertEquals(4, busca.buscar(40));
    }

    @Test
    void q2Teste3() {
        Integer[] vetor = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        BuscaBinaria<Integer> busca = new BuscaBinaria<>(vetor);
        assertEquals(7, busca.buscar(70));
    }

    @Test
    void q2Teste4() {
        Integer[] vetor = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        BuscaBinaria<Integer> busca = new BuscaBinaria<>(vetor);
        assertEquals(-1, busca.buscar(75));
    }
}
