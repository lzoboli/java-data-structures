# Lista 05 - Pilhas (Stacks)

**Objetivo:** Implementar a estrutura de dados Pilha usando a política LIFO (*Last In, First Out*).

**Abordagens e Operações:**
*   **Interface comum:** Implementação dos métodos clássicos `push()`, `pop()` e `peek()`.
*   **Pilha Estática (`PilhaVetor`):** Uso de arrays limitados, com lançamento de `PilhaCheiaException`. Inclui método para concatenar duas pilhas.
*   **Pilha Dinâmica (`PilhaLista`):** Uso da Lista Encadeada (da Lista 03) operando na extremidade, sem limite pré-definido de tamanho. Lança `PilhaVaziaException` quando necessário.