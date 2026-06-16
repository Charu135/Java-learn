import java.util.*;
class Stack{
    private int maxSize;
    private int [] stackData;
    private int top; 

    public Stack(int size){
        this.maxSize=size;
        this.stackData= new int[maxSize];
        this.top = -1; 
    }


    public void push(int value){
        if(top >= maxSize -1){
            System.out.println("stack overflow cannot push"+value);
            return; 
        }
        stackData[++top] =value ;
    }

    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack underflow - cannot pop");
            return Integer.MIN_VALUE;
        }
        return stackData[top--];
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("Stack is empty - cannot peek");
            return Integer.MIN_VALUE;
        }
        return stackData[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top >= maxSize - 1;
    }

    public int size(){
        return top + 1;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack (top->bottom): ");
        for(int i = top; i >= 0; i--){
            System.out.print(stackData[i]);
            if(i > 0) System.out.print(" ");
        }
        System.out.println();
    }

    /**
     * Search returns 1-based distance from the top (like java.util.Stack.search).
     * Returns -1 if not found.
     */
    public int search(int value){
        for(int i = top; i >= 0; i--){
            if(stackData[i] == value){
                return top - i + 1;
            }
        }
        return -1;
    }

    public void clear(){
        top = -1;
    }


}