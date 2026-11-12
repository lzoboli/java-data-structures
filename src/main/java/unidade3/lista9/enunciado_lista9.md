# Lista 09 - Mapa de Dispersão (Hash Map)

**Objetivo:** Implementar uma Tabela Hash utilizando a estratégia de "Endereçamento Separado" (vetor de listas encadeadas) para tratamento de colisões.

**Principais Operações:**
*   **Questões 1 a 3:** Mapa focado em usar números inteiros (como matrículas) como chave de busca e dispersão via operador de módulo (`%`).
*   **Questão 4:** Evolução para suportar Chaves Genéricas (ex: textos), exigindo a utilização do método `hashCode()` nativo do Java para calcular a posição no vetor.
*   Cálculo do Fator de Carga (`calcularFatorCarga`) para avaliar o preenchimento da tabela.