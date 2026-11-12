/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package unidade1.lista5;

/**
 *
 * @author zobol
 */
public interface Pilha<T> {
    
    public void push(T objeto);
    
    public T pop();
    
    public T peek();
    
    public boolean estaVazia();
    
    public void liberar();
    
}
