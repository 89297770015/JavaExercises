class Stack {
    private int size;
    private int[] stackArray;
    private int sp;

    Stack(int size) {
        this.size = size;
        stackArray = new int[size];
        sp = -1;
    }

    void push(int element) {
        stackArray[++sp] = element;
    }

    int pop() {
        return stackArray[sp--];
    }
 
    int peek() {
        return stackArray[sp];
    }
 
    boolean isEmpty() {
        return (sp == -1);
    }
 
    boolean isFull() {
        return (sp == size - 1);
    }
}