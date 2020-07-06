package DataStructure_Stack;

public class Runner {

    public static void main(String args[]){
        Stack nums = new Stack();
        nums.push(10);
        nums.push(11);
        nums.push(12);
        System.out.println(nums.peek());
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());
        nums.show();
    }
}
