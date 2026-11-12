package unidade5.listas11e12.parte1;

public class BuscaLinearVetorOrdenado<T extends Comparable<T>> extends BuscaAbstract {

    public BuscaLinearVetorOrdenado(T[] vetor) {
        setInfo(vetor);
    }

    public int buscar(T valor) {
        T[] info = (T[]) getInfo();
        int n = info.length;

        for (int i = 0; i < n; i++) {
            if (valor.equals(info[i])) return i;
            else if (valor.compareTo(info[i]) < 0) {
                break;
            }
        }
        return -1;
    }
}