public class pilhaDinamica {

    private int top = -1;
    private int array[];

    public pilhaDinamica(int size) {
        array = new int[size];
    }

    public void push(int data, int size) {
        if (top >= array.length - 1) {
            aumento(size + 1);
        }
        top++;
        array[top] = data;
    }

    public void aumento(int size) {
        int[] novoArray = new int[size];
        for (int i = 0; i < array.length; i++) {
            novoArray[i] = array[i];
        }
        array = novoArray;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Pilha vazia");
            return -1;
        }
        int valor = array[top];
        array[top] = 0;
        top--;
        return valor;
    }

    public void clear() {
        while (top > -1) {
            array[top] = 0;
            top--;
        }
        System.out.println("Pilha vazia");
    }

    public boolean isFull() {
        return top >= array.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
