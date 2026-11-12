# Unidade 5 - Algoritmos de Busca e Árvore Binária de Busca

Este pacote contém as implementações referentes às **Listas 11 e 12**, focadas na localização de dados estruturados em vetores e na construção de Árvores Binárias de Busca (BST - *Binary Search Tree*).

## 📄 Lista 11 - Algoritmos de Busca (Vetores e Árvores)

**Objetivo:** Implementar métodos clássicos de pesquisa em arrays e iniciar a construção estrutural de uma Árvore Binária de Busca baseada na interface `Comparable<T>`.

**Principais Implementações:**
*   **Busca em Vetores (`BuscaAbstract`):**
    *   `BuscaLinear`: Percorre o array sequencialmente.
    *   `BuscaLinearVetorOrdenado`: Busca sequencial otimizada para interrupção antecipada.
    *   `BuscaBinaria`: Busca por divisão e conquista em arrays ordenados.
*   **Árvore Binária de Busca (`ArvoreBinariaBusca`):** 
    *   Refatoração da Árvore Binária clássica para uma superclasse abstrata (`ArvoreBinariaAbstract`).
    *   Implementação do método `inserir(T info)`, garantindo a regra da BST (menores à esquerda, maiores à direita).
    *   Implementação do método `buscar(T info)` otimizado para a estrutura BST.

---

## 📄 Lista 12 - Exclusão em Árvore Binária de Busca

**Objetivo:** Evoluir a classe `ArvoreBinariaBusca` da lista anterior com a complexa lógica de remoção de nós, mantendo a integridade e as propriedades de ordenação da árvore.

**Principais Implementações:**
*   **Método `retirar(valor)`:** Implementação capaz de lidar com os três cenários clássicos de exclusão em BSTs:
    1.  Remoção de nó folha (sem filhos).
    2.  Remoção de nó com apenas 1 filho (esquerda ou direita).
    3.  Remoção de nó com 2 filhos (substituição pelo sucessor/predecessor lógico).