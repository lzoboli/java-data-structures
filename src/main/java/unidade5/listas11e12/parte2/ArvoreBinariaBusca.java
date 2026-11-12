package unidade5.listas11e12.parte2;

public class ArvoreBinariaBusca<T extends Comparable<T>> extends ArvoreBinariaAbstract<T> {

    public void inserir(T valor) {
        NoArvoreBinaria<T> novo = new NoArvoreBinaria<>(valor, null, null);

        if (estaVazia()) {
            setRaiz(novo);
        } else {
            NoArvoreBinaria<T> p = getRaiz();
            while (true) {
                if (valor.compareTo(p.getInfo()) < 0) {
                    if (p.getEsquerda() == null) {
                        p.setEsquerda(novo);
                        return;
                    }
                    p = p.getEsquerda();
                } else {
                    if (p.getDireita() == null) {
                        p.setDireita(novo);
                        return;
                    }
                    p = p.getDireita();
                }
            }
        }
    }



    public void remover(T valor) {
        NoArvoreBinaria<T> p = getRaiz();
        NoArvoreBinaria<T> pai = null;

        boolean filhoEsquerda = false;

        while ((p != null) && (!p.getInfo().equals(valor))) {
            pai = p;
            if (valor.compareTo(p.getInfo()) < 0) {
                filhoEsquerda = true;
                p = p.getEsquerda();
            } else {
                filhoEsquerda = false;
                p = p.getDireita();
            }
        }
        if (p != null) {
            if ((p.getEsquerda() == null) && (p.getDireita() == null)) {
                if (p == getRaiz()) {
                    setRaiz(null);
                } else {
                    if (filhoEsquerda == true) {
                        pai.setEsquerda(null);
                    } else {
                        pai.setDireita(null);
                    }
                }
            } else {
                if ((p.getDireita() == null)) {
                    if (p == getRaiz()) {
                        setRaiz(p.getEsquerda());
                    } else {
                        if (filhoEsquerda == true) {
                            pai.setEsquerda(p.getEsquerda());
                        } else {
                            pai.setDireita(p.getEsquerda());
                        }
                    }
                } else if (p.getEsquerda() == null) {
                    if (p == getRaiz()) {
                        setRaiz(p.getDireita());
                    } else {
                        if (filhoEsquerda == true) {
                            pai.setEsquerda(p.getDireita());
                        } else {
                            pai.setDireita(p.getDireita());
                        }
                    }
                } else {
                    NoArvoreBinaria<T> sucessor = extrairSucessor(p);

                    if (p == getRaiz()) {
                        setRaiz(sucessor);
                    } else {
                        if (filhoEsquerda == true) {
                            pai.setEsquerda(sucessor);
                        } else {
                            pai.setDireita(sucessor);
                        }
                    }
                    sucessor.setEsquerda(p.getEsquerda());
                }
            }
        }
    }

    private NoArvoreBinaria<T> extrairSucessor(NoArvoreBinaria<T> p) {
        NoArvoreBinaria<T> atual = p.getDireita();
        NoArvoreBinaria<T> paiSucessor = p;
        NoArvoreBinaria<T> sucessor = p;

        while (atual != null) {
            paiSucessor = sucessor;
            sucessor = atual;
            atual = atual.getEsquerda();
        }

        if (sucessor != p.getDireita()) {
            paiSucessor.setEsquerda(sucessor.getDireita());
            sucessor.setDireita(p.getDireita());
        }

        return sucessor;
    }

    @Override
    public NoArvoreBinaria<T> buscar(T valorBusca) {
        return buscar(getRaiz(), valorBusca);
    }

    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T valorBusca) {
        if (no == null) return null;

        int comparacao = valorBusca.compareTo(no.getInfo());

        if (comparacao == 0) {
            return no; // Achou o valor
        } else if (comparacao < 0) {
            return buscar(no.getEsquerda(), valorBusca); // Vai pra esquerda
        } else {
            return buscar(no.getDireita(), valorBusca); // Vai pra direita
        }
    }
}
