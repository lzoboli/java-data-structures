package unidade3.lista9.questao1a3;


public class MapaDispersao<T> {
    private ListaEncadeada<NoMapa<T>>[] info;

    public MapaDispersao(int tamanho) {
        info = new ListaEncadeada[tamanho];
    }

    private int calcularHash(int chave) {
        int tamanho = info.length;
        return chave % tamanho;
    }

    public void inserir(int chave, T valor) {
        int indice = calcularHash(chave);

//      Verifica o indice encontrado da lista, caso seja nulo,cria nova instância de ListaEncadeada
        if (info[indice] == null) {
            info[indice] = new ListaEncadeada();
        }

//      Cria um novo NoMapa com as informações do parâmetro
        NoMapa<T> no = new NoMapa<T>();
        no.setChave(chave);
        no.setValor(valor);

//      Armazena o nó criado no índice calculado
        info[indice].inserir(no);
    }

    public T buscar(int chave) {
        int indice = calcularHash(chave);

        if (info[indice] != null) {
//            Cria um objeto que será utilizado para o mapeamento, por isso possui apenas chave
            NoMapa<T> noMapa = new NoMapa();
            noMapa.setChave(chave);

//            Utiliza o NoMapa criado para procurar na lista encadeada o no contendo o objeto que foi guardado
            NoLista<NoMapa<T>> no = info[indice].buscar(noMapa);
            if (no != null) {
                return no.getInfo().getValor();
            }
        }
        return null;
    }

    public void remover(int chave) {
        int indice = calcularHash(chave);

        NoMapa<T> buscador = new NoMapa();
        buscador.setChave(chave);

        info[indice].retirar(buscador);
    }

    public double calcularFatorCarga() {
        int indicesOcupados = 0;
        int tamanho = info.length;

        for (int i = 0; i < tamanho; i++) {
            if (info[i] != null) indicesOcupados += 1;
        }

        if (indicesOcupados == 0) return 0;
        return (double) indicesOcupados / tamanho;
    }
}