package unidade5.listas11e12.parte2;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author zobol
 */
public abstract class ArvoreBinariaAbstract<T> {
    private NoArvoreBinaria<T> raiz;

    public ArvoreBinariaAbstract() {
        raiz = null;
    }

    public abstract NoArvoreBinaria<T> buscar(T valorBusca);

    protected void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    public NoArvoreBinaria<T> getRaiz() {return raiz;};

    public boolean estaVazia() {
        if (raiz == null) {
            return true;
        }
        return false;
    }
    
    public boolean pertence(T info) {
        return buscar(info) != null ;
    }

    @Override
    public String toString() {
        return arvorePre(raiz);
    }

    private String arvorePre(NoArvoreBinaria<T> no) {
        if (no == null) {
            return "<>";
        }
        return "<" + no.getInfo() +
               arvorePre(no.getEsquerda()) +
               arvorePre(no.getDireita()) +
               ">";
    }
    
    public int contarNos() {
        return contarNos(raiz);
    }

    private int contarNos(NoArvoreBinaria<T> no) {
        if (no == null) {
            return 0;
        }
        
        return 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());
    }
}
