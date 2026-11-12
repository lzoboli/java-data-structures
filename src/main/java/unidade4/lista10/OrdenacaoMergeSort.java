public class OrdenacaoMergeSort<T extends Comparable<T>> extends OrdenacaoAbstract<T> {

    @Override
    public void ordenar() {
        int n = getInfo().length - 1;
        mergeSort(0, n);
    }

    private void mergeSort(int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(inicio, meio);
            mergeSort(meio + 1, fim);
            merge(inicio, fim, meio);
        }
    }

    private void merge(int inicio, int fim, int meio) {
        int tamEsquerda = meio - inicio + 1;
        int tamDireita = fim - meio;

        T[] esquerda = (T[]) new Comparable[tamEsquerda];
        T[] direita = (T[]) new Comparable[tamDireita];

        for (int i = 0; i <= tamEsquerda - 1; i++) {
            esquerda[i] = getInfo()[inicio + i];
        }

        for (int i = 0; i <= tamDireita - 1; i++) {
            direita[i] = getInfo()[meio + 1 + i];
        }

        int cEsq = 0;
        int cDir = 0;
        int i = inicio;

        for (i = inicio; i <= fim; i++) {
            if ((cEsq < tamEsquerda) && (cDir < tamDireita)) {
                if (esquerda[cEsq].compareTo(direita[cDir]) < 0) {
                    getInfo()[i] = esquerda[cEsq];
                    cEsq += 1;
                } else {
                    getInfo()[i] = direita[cDir];
                    cDir += 1;
                }
            } else {
                break;
            }
        }

        while (cEsq < tamEsquerda) {
            getInfo()[i] = esquerda[cEsq];
            cEsq += 1;
            i += 1;
        }

        while (cDir < tamDireita) {
            getInfo()[i] = direita[cDir];
            cDir += 1;
            i += 1;
        }
    }
}