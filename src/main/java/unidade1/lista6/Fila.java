/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package unidade1.lista6;

/**
 *
 * @author zobol
 */
public interface Fila<T> {
    
    public void inserir(T dado);
    
    public boolean estaVazia();
    
    public T peek();
    
    public T retirar();
    
    public void liberar();
}
