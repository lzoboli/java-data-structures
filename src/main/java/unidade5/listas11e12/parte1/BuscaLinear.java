package unidade5.listas11e12.parte1;

public class BuscaLinear<T> extends BuscaAbstract {

    public BuscaLinear(T[] vetor) {
        setInfo(vetor);
    }

    public int buscar(T valor) {
        int n = getInfo().length;
        for (int i = 0; i < n; i++) {
            if (getInfo()[i].equals(valor)) return i;
        }
        return -1;
    }
}
