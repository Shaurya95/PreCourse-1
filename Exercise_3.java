import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList {

    Node head; // head of list
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            //Write your code here 
            this.data = d;
            this.next = null;
        } 
    } 

    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
      
        Node newNode = new Node(data);
    
        if(list.head == null) {
           list.head = newNode;
        }
      
        else {
            Node lastNode = list.head;
            while(lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return list;
    } 

    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    { 
        Node curr = list.head;
        while(curr != null) {
            System.out.println(curr.data + " ");
            // Go to next node 
            curr = curr.next;
        }
    } 

    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}