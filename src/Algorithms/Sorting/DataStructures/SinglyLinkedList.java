package Algorithms.Sorting.DataStructures;
/*  Basic operations that can be performed on this type of Linked List are
  1. Add,Get,Remove elements at the beginning of the Linked List
  2. Add,Get at the end of the Linked List
  3. Adding an element after the specified element
  4. Adding an element before the specified element
  5. Adding an element at the specified position.
  6. Getting an element from the Linked List given a specified position
  7. Remove/Deleting an element in a Linked List

  Along with these basic operations there are some very basic operations which we obviously needed while doing the above operations
  1. Checking whether  Linked List isEmpty
  2. Creating a LinkedList without any elements.
  3. Check whether Linked List contains an element.
  4. Position resolution while adding an element at a given position*/


import java.util.Iterator;
import java.util.NoSuchElementException;

public class SinglyLinkedList<AnyType> implements Iterable<AnyType> {

    private Node<AnyType> head;
    /***************************************************
     *       Node Class (Must be Static)
     ****************************************************/
    private  class Node<AnyType> {
        private Node<AnyType> next;
        private AnyType data;

        /*Constructor for the Node Class */
        public Node (AnyType data, Node<AnyType> next) {
            this.data = data;
            this.next = next;
        }

        public Node(AnyType data) {
            this.data = data;
            this.next = null;
        }
    }

    /******************************************************************
     *         SinglyLinkedListIterator class implementing iterator
     ******************************************************************/

    /*The whole idea of the iterator is to provide an access to a private aggregated data and at the same moment
      hiding the underlying representation. An iterator is Java is an object, and therefore it's implementation requires
      creating a class that implements the Iterator interface.*/

    /*Method for creating an instance of Iterator i.e., getting the iterator object */

    public Iterator<AnyType> iterator () {
        return new SinglyLinkedListIterator();
    }

    private class SinglyLinkedListIterator implements Iterator<AnyType> {

        private Node<AnyType> nextNode;

        public SinglyLinkedListIterator() {
            Node<AnyType> nextNode = head;
        }

        public boolean hasNext() {
            return nextNode != null;
        }

        /*Return the data in the LinkedList*/
        public AnyType next() {
            /*If there is no element throw exception*/
            if (!hasNext()) throw new NoSuchElementException();
            /*Returning the data assigning the identifier "res" which contains the element to return */
            AnyType res = nextNode.data;
            nextNode = nextNode.next;
            return res;
        }

        /*Not Implementing remove operation through Iterator*/
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        for(Object x : this)
            result.append(x + " ");

        return result.toString();
    }

    /************************************************************
     *      Constructor which creates an empty SinglyLinkedList.
     *************************************************************/
    public SinglyLinkedList () {
        head = new Node<AnyType>(null);
    }

    /* Checking whether the collection is empty*/
    public boolean isEmpty() {
        return head == null;
    }

    /* Checks whether an element is there in LinkedList are not*/

    public boolean contains (AnyType data) {
        for (AnyType temp : this)
            if (temp.equals(data)) return true;
        return false;

    }

    /*****************************************************************************************************
     * 1. Calculate the length of the LinkedList
     * Note: Counting the lenght after performing every operation and storing it in a variable may be a best choice
     * *******************************************************************************************************/

    public int getLength () {
        int length =0;
        if (head == null) return length;
        Node<AnyType> temp = head;
        while (temp!= null) temp = temp.next; length = length++;

        return length;
    }

    /**************************************************************
     *  1. Adding an element at the beginning of the LinkedList
     *  2. Getting the element in the beginning of the LinkedList
     *  3. Remove an element in the beginning of the LinkedList & return that element.
     *  ***********************************************************/

    public void addFirst(AnyType data) {
        Node<AnyType> temp;
        temp = new Node<AnyType>(data,head);
        head = temp;
    }

    public AnyType getFirst() {
        if(head == null) throw new NoSuchElementException();
        return head.data;
    }

    public AnyType removeFirst () {
        if(head == null) throw new UnsupportedOperationException();
        /* Return the head element
        *  Assign head to next Node*/
        AnyType tmp = getFirst();
        head = head.next;
        return tmp;
    }

    /******************************************************************
     *  1. Adding an element at the end of the Linked List
     *  2. Getting an element at the end of Linked List
     *******************************************************************/

    public void addLast (AnyType data) {
        if (head == null) addFirst(data);
        Node<AnyType> temp = head;
        while (temp.next != null) temp = temp.next;

        temp.next = new Node<AnyType>(data,null);
    }

    public AnyType getLast () {
        if (head == null) throw new NoSuchElementException();

        Node<AnyType> temp = head;
        while(temp.next != null) temp = temp.next;

        return temp.data;
    }

    /*********************************************************************
     * 1. Inserting an element before a specified element
     * 2. Inserting an element after a specified element
     * @param key - Element before or after which it needs to be inserted.
     * @param toInsert - Actual element that need to be inserted
     **********************************************************************/

    public void insertAfter (AnyType key, AnyType toInsert) {
        Node<AnyType> temp = head;

        while (temp != null && !temp.data.equals(key)) temp =temp.next;

        if (temp != null)
            temp.next = new Node<AnyType>(toInsert,temp.next);
    }

    public void insertBefore (AnyType key,AnyType toInsert) {

        if (head == null) return;
        if (head.data.equals(key)) addFirst(toInsert);

        Node<AnyType> prev = null;
        Node<AnyType> cur = head;

        while (cur != null && !cur.data.equals(key)) {
            prev = cur;
            cur = cur.next;
        }
        if (cur != null){
            // TODO -Resolve this caution message - Dereference etc., stuff
            prev.next = new Node<AnyType>(toInsert,cur);
        }
    }

/*    *************************************************************************
     * 1. Adding an element at specified position
     * 2. Removing an element at specified position
     * 3. Return the position of the specified element in the LinkedList
     * @param pos - position
     * @param toInsert - data to needed to be inserted
     * Notes : Fixing the position is the key thing.
     * *************************************************************************/

    /*This basically replaces the existing element*/
    public void addAtPosition (AnyType toInsert,int pos) {
        if (pos < 0) pos = 0;
        if (pos > 0) pos = getLength();

        if (head == null && pos == 0) addFirst(toInsert);
        else {
            Node<AnyType> temp = head;
            for (int i = 0; i < pos; i++) {
                temp = temp.next;
            }
            temp = new Node<AnyType>(toInsert, temp.next);
        }

    }


    /************************************************************************************
     *          Main Method for Testing Purpose
     *
     * ***********************************************************************************/

    public static void main (String[] args) throws Exception{

        SinglyLinkedList<String> list = new SinglyLinkedList<String>();

        list.addFirst("5");
        list.getLength();
        System.out.println("Something");
        System.out.println(list.getLength());
        list.addFirst("B");
        System.out.println(list.getLength());
        System.out.println(list);
    }




}





