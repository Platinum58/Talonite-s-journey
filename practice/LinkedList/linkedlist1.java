class node{
    int data;
    node next;
}
public class linkedlist1{
    public static void main(String[] args){
        node first = new node();
        node second = new node();
        node third = new node(); 
        first.data = 10;
        first.next = second;
        second.data = 20;
        second.next = third;
        third.data = 30;
        node temp = first;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}