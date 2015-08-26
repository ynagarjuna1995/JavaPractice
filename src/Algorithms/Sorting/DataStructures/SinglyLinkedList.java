package Algorithms.Sorting.DataStructures;
/*  Basic operations that can be performed on this type of Linked List are
  1. Adding at the beginning of the Linked List
  2. Adding at the end of the Linked List
  3. Remove/Deleting an element in a Linked List
  4. Adding an element after the specified element
  5. Adding an element before the specified element
  6. Getting an element from the Linked LIst given a specified position.

  Along with these basic operations there are some very basic operations which we obviously needed while doing the above operations
  1. Checking whether  Linked List isEmpty
  2. Creating a LinkedList without any elements.
  3. Check whether Linked List contains an element. */
public class SinglyLinkedList<AnyType> implements Iterable<AnyType> {

//  Declare the Head Node for the Linked List
    private Node<AnyType> head;

//  Node Helper Inner Class
    private static class Node {

//  Every node consists of two members - dataItem,next(reference to the next Node)
    private AnyType dataItem;
    private Node<AnyType> next;

//  Constructor
    public SinglyLinkedList(Node<AnyType> next, AnyType dataItem) {
        this.next = next;
        this.dataItem = dataItem;
    }
}
//  Constructor which creates an empty Linked List
    public SinglyLinkedList() {
        head = null;
    }
//  Check whether Linked List is empty
    public boolean isEmpty(){
        return head == null;
    }



}

