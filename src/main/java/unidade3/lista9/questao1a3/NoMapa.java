package unidade3.lista9.questao1a3;

public class NoMapa<T> {
    private T valor;
    private int chave;

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
        NoMapa<T> outro = (NoMapa<T>) obj;
        if (this.chave != outro.chave) {
            return false;
        }
        return true;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}
