package DataStructure_Stack;

public class DStack {

        int capacity = 5;
        int stack[] = new int[5];
        int top = 0;
        public void push(int data){

            if(size() == capacity){
                expand();
            }
                stack[top] = data;
                top ++ ;
        }

        private void expand(){
            int length = size();
            int[] newStack = new int[capacity * 2];
            System.arraycopy(stack,0, newStack, 0, length);
            stack = newStack;
            capacity *=2;
        }

        public void pop(){

            if(isEmpty()){
                System.out.println("Stack is empty");
            }else{
                top--;
                stack[top] = 0;
                shrink();
            }
        }

    private void shrink() {
            int length = size();
            if(length <= (capacity/2)/2){
                capacity = capacity/2;
            }
            int[] newStack = new int[capacity];
            System.arraycopy(stack,0, newStack, 0, length);
            stack = newStack;

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
