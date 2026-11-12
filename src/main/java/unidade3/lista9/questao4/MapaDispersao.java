public class MapaDispersao<K,T> {
    private ListaEncadeada<NoMapa<K,T>>[] info;

    public MapaDispersao(int tamanho) {
        info = new ListaEncadeada[tamanho];
    }

    private int calcularHash(K chave) {
        int tamanho = info.length;
        int hashcode = chave.hashCode();

        return hashcode % tamanho;
    }

    public void inserir(K chave, T valor) {
        int indice = calcularHash(chave);

//      Verifica o indice encontrado da lista, caso seja nulo,cria nova instância de ListaEncadeada
        if (info[indice] == null) {
            info[indice] = new ListaEncadeada();
        }

//      Cria um novo NoMapa com as informações do parâmetro
        NoMapa<K,T> no = new NoMapa<K,T>();
        no.setChave(chave);
        no.setValor(valor);

//      Armazena o nó criado no índice calculado
        info[indice].inserir(no);
    }

    public T buscar(K chave) {
        int indice = calcularHash(chave);

        if (info[indice] != null) {
//            Cria um objeto que será utilizado para o mapeamento, por isso possui apenas chave
            NoMapa<K,T> noMapa = new NoMapa();
            noMapa.setChave(chave);

//            Utiliza o NoMapa criado para procurar na lista encadeada o no contendo o objeto que foi guardado
            NoLista<NoMapa<K,T>> no = info[indice].buscar(noMapa);
            if (no != null) {
                return no.getInfo().getValor();
            }
        }
        return null;
    }

    public void remover(K chave) {
        int indice = calcularHash(chave);

        NoMapa<K,T> buscador = new NoMapa();
        buscador.setChave(chave);

        info[indice].retirar(buscador);
    }

    public double calcularFatorCarga() {
        int totalElementos = 0;
        int tamanho = info.length;

        for (int i = 0; i < tamanho; i++) {
            if (info[i] != null) totalElementos += info[i].obterComprimento();
        }

        if (totalElementos == 0) return 0;
        return (double) totalElementos / tamanho;
    }
}