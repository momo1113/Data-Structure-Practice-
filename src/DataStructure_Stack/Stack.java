package DataStructure_Stack;

public class Stack {
    int stack[] = new int[5];
    int top = 0;
    public void push(int data){

        if(top == 5){
            System.out.println("stack is full");
        }else{
            stack[top] = data;
            top ++ ;
        }
    }

    public void pop(){

        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            top--;
            stack[top] = 0;
        }
    }

    public int peek(){
        return stack[top-1];
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return stack.length <= 0;
    }


    public void show(){
        for(int n : stack){
            System.out.println(n);
        }
    }

}
