
package Algorithms.Sorting.DataStructures;

import java.util.ListIterator;


/**
 * @author Nagarjuna Yelisetty..
 * @since  12-09-2015.
 * @version 0.1.
 *
 * Circular Linked list implementation using the sentinels eliminating the use of head and tail in a Doubly Linked List
 *
 * Sentinel : A sentinel is dummy object that allows to simplify boundary conditions or
 *
 * The invariants of the DList ADT are more complicated than the SList invariants.
 * The following invariants apply to the DList with a sentinel.
 *   (1)  For any DList d, d.head != null.  (There's always a sentinel.)
 *   (2)  For any DListNode x, x.next != null.
 *   (3)  For any DListNode x, x.prev != null.
 *   (4)  For any DListNode x, if x.next == y, then y.prev == x.
 *   (5)  For any DListNode x, if x.prev == y, then y.next == x.
 *   (6)  A DList's "size" variable is the number of DListNodes, NOT COUNTING the
 *   sentinel (denoted by "head"), that can be accessed from the sentinel by a sequence of "next" references.
 *
 */

public class CircularLinkedList <anyType> implements Iterable {

        private Node<anyType> sentinel;
        private Node<anyType> head;

    /**
     *  Inner Node Class
     *
     * */


    private static class Node <anyType> {

        private Node <anyType> prev;
        private Node <anyType> next;
        private anyType data;

        public Node (Node<anyType> next, Node<anyType> prev, anyType data) {
            this.prev = prev;
            this.next = next;
            this.data = data;
        }

        public Node () {

        }
    }

    public CircularLinkedList() {

        Node<anyType> head = new Node<anyType>() ;
        sentinel = head;
        head.next = head.prev;
        head.prev = head;

    }

    /**
     * isEmpty()
     * */

    public boolean isEmpty() {
        return head.next == null;
    }


/**
     *  Iterator Interface :
     *  The whole idea of the iterator is to provide an access to a private aggregated data and at the same moment
     *  hiding the underlying representation. An iterator is Java is an object, and therefore it's implementation requires
     *  creating a class that implements the Iterator interface.
     *
     * */


    public class circularLinkedListIterator implements ListIterator <anyType> {

        private Node<anyType> current = sentinel;
        private Node<anyType> lastAccessed = null;

        public boolean hasNext() {
            return current.next != null && current.next.next != null;
        }

        public anyType next() {
            return null;
        }

        public boolean hasPrevious() {
            return false;
        }


        public anyType previous() {
            return null;
        }


        public int nextIndex() {
            return 0;
        }

        public int previousIndex() {
            return 0;
        }

        public void remove() {

        }

        public void set(anyType anyType) {

        }

        public void add(anyType anyType) {

        }
    }

    public ListIterator <anyType> iterator () {
        return new circularLinkedListIterator();
    }


    public static void main(String[] args) throws Exception{

        CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();

        if ( !list.isEmpty()) System.out.println("LIst is Empty");

    }
}
