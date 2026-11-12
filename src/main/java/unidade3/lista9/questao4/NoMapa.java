public class NoMapa<K,T> {
    private T valor;
    private K chave;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        NoMapa<K,T> outro = (NoMapa<K,T>) obj;
        if (this.chave.equals(outro.chave)) {
            return false;
        }
        return true;
    }

    public K getChave() {
        return chave;
    }

    public void setChave(K chave) {
        this.chave = chave;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}
