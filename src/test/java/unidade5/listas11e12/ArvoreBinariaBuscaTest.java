package unidade5.listas11e12;

import org.junit.jupiter.api.Test;
import unidade5.listas11e12.parte2.ArvoreBinariaBusca;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArvoreBinariaBuscaTest {

    @Test
    public void casoTeste1() {
        ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();
        int[] valores = {50, 30, 70, 40, 25, 75, 65, 35, 60};
        for (int v : valores) arvore.inserir(v);
        assertEquals("<50<30<25<><>><40<35<><>><>>><70<65<60<><>><>><75<><>>>>", arvore.toString());
    }

    @Test
    public void casoTeste2() {
        ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();
        int[] valores = {50, 30, 25, 40};
        for (int v : valores) arvore.inserir(v);
        arvore.remover(40);
        assertEquals("<50<30<25<><>><>><>>", arvore.toString());
    }

    @Test
    public void casoTeste3() {
        ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();

        arvore.inserir(80);
        arvore.inserir(52);
        arvore.inserir(90);
        arvore.inserir(48);
        arvore.inserir(71);
        arvore.inserir(63);
        arvore.inserir(67);

        arvore.remover(71);

        assertEquals("<80<52<48<><>><63<><67<><>>>><90<><>>>", arvore.toString());
    }
}
