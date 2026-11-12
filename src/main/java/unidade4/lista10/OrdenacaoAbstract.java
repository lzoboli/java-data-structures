public abstract class OrdenacaoAbstract<T extends Comparable<T>> {
    private T[] info;

    public abstract void ordenar();

    public void trocar(T[] infoParam, int pos1, int pos2) {
        T aux = infoParam[pos1];
        infoParam[pos1] = infoParam[pos2];
        infoParam[pos2] = aux;
    }

    public T[] getInfo() {
        return info;
    }

    public void setInfo(T[] info) {
        this.info = info;
    }
}