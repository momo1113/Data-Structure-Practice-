package DataStructure_LinkedList;

public class Runner {

    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(4);
        list.insert(9);

        list.insertAtStart(25);
        list.insertAt(1,40);
        list.delete(2);
        list.show();
    }

}
