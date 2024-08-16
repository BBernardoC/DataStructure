

public class pilhaEstatica {
    private int top =-1;
    private int array[];

    public pilhaEstatica(int size){
        //definir o tamnho do array
        array = new int [size];
    }
    public void push (int data){

        if ((array.length-1)<=top){
            System.out.println("sem espaço");
        }
        top++;
        array[top] = data;
    }
    public int pop(){
        if (top == -1){
            System.out.println("Lista vazia");
            return -1;
        }
        array[top] = 0;
        top--;
        return 0;
    }

    public void clear(){
        while (top > -1){
            array[top] = 0;
            top--;
        }
        if (top==-1){
            System.out.println("pilha vazia");
        }
    }
    public boolean isFull(){
        return top >= array.length-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

}