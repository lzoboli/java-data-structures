package unidade5.listas11e12.parte2;

public class ArvoreBinaria<T extends Comparable<T>> extends ArvoreBinariaAbstract<T> {

    @Override
    public void setRaiz(NoArvoreBinaria<T> raiz) {
        super.setRaiz(raiz);
    }

    @Override
    public NoArvoreBinaria<T> buscar(T valorBusca) {
        NoArvoreBinaria<T> p = getRaiz();
        while ((p != null) && (!p.getInfo().equals(valorBusca))) {
            if (valorBusca.compareTo(p.getInfo()) < 0) {
                p = p.getEsquerda();
            } else {
                p = p.getDireita();
            }
        }
        return p;
    }

    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T valorBusca) {
        if (no == null) return null;
        if (valorBusca.equals(no.getInfo())) return no;
        else {
            int comparacao = valorBusca.compareTo(no.getInfo());
            if (comparacao < 0) {
                return buscar(no.getEsquerda(), valorBusca);
            } else {
                return buscar(no.getDireita(), valorBusca);
            }
        }
    }
}
