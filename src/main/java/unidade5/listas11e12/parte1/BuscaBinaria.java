package unidade5.listas11e12.parte1;

public class BuscaBinaria<T extends Comparable<T>> extends BuscaAbstract {

    public BuscaBinaria(T[] vetor) {
        setInfo(vetor);
    }

    public int buscar(T valor) {
        int n = getInfo().length;
        int inicio = 0;
        int fim = n - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (valor.compareTo((T) getInfo()[meio]) < 0 ) {
                fim = meio - 1;
            } else if (valor.compareTo((T) getInfo()[meio]) > 0 ) {
                inicio = meio + 1;
            } else {
                return meio;
            }
        }
        return - 1;
    }
}
