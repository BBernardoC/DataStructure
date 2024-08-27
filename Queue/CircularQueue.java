public class CircularQueue<T> {
    private int primeiro;
    private int ultimo;
    private T[] dados;
    private int capacidade;
    private int tamanho;

    public CircularQueue(int capacidade) {
        this.capacidade = capacidade;
        dados = (T[]) new Object[this.capacidade]; // Inicialização do array genérico
        primeiro = 0;
        ultimo = -1;
        tamanho = 0;
    }

    public boolean vazia() {
        return tamanho == 0;
    }
    
    public boolean cheia() {
        return tamanho == capacidade;
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("Fila vazia");
        } else {
            for (int i = 0; i < tamanho; i++) {
                int index = (primeiro + i) % capacidade;
                System.out.println(dados[index]);
            }
        }
    }

    public void insere(T valor) {
        if (cheia()) {
            System.out.println("Fila cheia");
        } else {
            ultimo = (ultimo + 1) % capacidade;
            dados[ultimo] = valor;
            tamanho++;
        }
    }
    
    public T remove() {
        if (vazia()) {
            System.out.println("Fila vazia");
            return null;
        } else {
            T valor = dados[primeiro];
            primeiro = (primeiro + 1) % capacidade;
            tamanho--;
            return valor;
        }
    }
}
