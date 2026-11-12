# Lista 06 - Filas (Queues)

**Objetivo:** Implementar a estrutura de dados Fila usando a política FIFO (*First In, First Out*).

**Abordagens e Operações:**
*   **Interface comum:** Implementação dos métodos clássicos de inserir (enqueue), retirar (dequeue) e espiar (`peek`).
*   **Fila Estática (`FilaVetor`):** Uso de arrays com controle de `inicio` e `tamanho`. Inclui método que gera uma nova fila resultante da concatenação de outras duas.
*   **Fila Dinâmica (`FilaLista`):** Adaptação da Lista Encadeada com controle das duas extremidades (referência para o `ultimo` nó) para permitir `inserirNoFinal()`.