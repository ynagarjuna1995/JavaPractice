package Algorithms.Sorting.DataStructures;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * @author  Nagarjuna Yelisetty
 * @since   31-08-2015.
 * @version 0.1
 *
 * Doubly Linked List implements Iterable interface and has private inner Node class
 *
 * Note :
 * 1.To make an object iterable it needs to emit an Iterator object. To enforce this contract, Iterator interface
 *   is to be used. It contains a method named iterator() and it returns Iterator. Hence, any class that implements
 *   Iterable will return an Iterator
 *
 * 2.We cannot add or remove elements to the underlying collection when we are using an iterator.
 *
 * @code
 *              for(String element : list) {
 *                  System.out.println(element);
 *                  list.add("5");
 *              }
 *    Output:
 *    5
 *    Exception in thread "main" java.util.ConcurrentModificationException
 *    at java.util.LinkedList$Itr.checkForComodification(Unknown Source)
 *    at java.util.LinkedList$Itr.next(Unknown Source)

 */
public class DoublyLinkedList<anyType> implements Iterable<anyType> {

    private int length;
    private dLLNode<anyType> head;
    private dLLNode<anyType> tail;

    public DoublyLinkedList() {
        head = null;
    }

    /**
     * addFirst
     * */

    public void addFirst(anyType data) {
        /*
        * dllNode method signature : dLLNode (prev,next,data)
        * */
        head = new dLLNode<anyType>( null, head, data);

        length++;
    }

    public anyType getFirst () {
        if (head == null) throw new NoSuchElementException();

        return head.data;
    }



/*    public String toString () {
        StringBuffer s = new StringBuffer();
        for (Object x : this) {
            s.append(x + " ");
        }
        return s.toString();
    }*/


    /**
     *  dLLNode Inner Class :
     * */
    private static class dLLNode<anyType> {
        private anyType data;
        private dLLNode<anyType> prev;
        private dLLNode<anyType> next;

        public dLLNode( dLLNode<anyType> prev, dLLNode<anyType> next, anyType data) {
            this.next = next;
            this.prev = prev;
            this.data = data;
        }
    }

    /**
     *  Iterator Interface :
     *  The whole idea of the iterator is to provide an access to a private aggregated data and at the same moment
     *  hiding the underlying representation. An iterator is Java is an object, and therefore it's implementation requires
     *  creating a class that implements the Iterator interface.
     *
     *   Doubly Linked List is a bi-directional Linked List,we need list iterator which has functionality to iterate in both direction
     *
     * */

    public ListIterator <anyType> iterator () {
        return new DoublyLinkedListIterator();
    }

    /**
     *  Private Inner Class of LinkedList Iterator
     * */

     private class DoublyLinkedListIterator implements ListIterator<anyType> {

        private dLLNode<anyType> current;
        private int currentIndex = 0;

        /**
         * This will be useful when we want to iterate through a particular point
         * Applications :
         * Finding the merging point of two linked Linked Lists*/

        public DoublyLinkedListIterator(dLLNode<anyType> current, int currentIndex) {
            this.current = current;
            this.currentIndex = currentIndex;
        }

        public DoublyLinkedListIterator() { this.current = null; }

        public boolean hasNext () { return current != null && current.next != null; }

        public boolean hasPrevious () { return current != null && current.prev != null; }

        public int nextIndex () { return currentIndex+1; }

        public int previousIndex () { return currentIndex - 1; }

        public anyType next () {
            if (!hasNext()) throw new NoSuchElementException();

            current = current.next;
            this.currentIndex++;
            return current.data;
        }

        public anyType previous () {
            if (!hasPrevious()) throw new NoSuchElementException();

            current = current.prev;
            this.currentIndex--;
            return current.data;

        }

        public void add (anyType data) {throw new UnsupportedOperationException();}

        public void remove() { throw new UnsupportedOperationException();}

        public void set(anyType data) {throw new UnsupportedOperationException();}
    }


    public String toString() {
        StringBuffer result = new StringBuffer();
        //TODO -Unable to print my LinkedList by simply calling sysout don't know how to fix it :(
        for(anyType data : this)
            result.append(data + " ");

        return result.toString();
    }

    /**
     *  Main Class
     * */

    public static void main(String[] args) throws Exception {

        DoublyLinkedList<String> list = new DoublyLinkedList<String>();
        System.out.println(list.length);
        list.addFirst("K");
        System.out.println(list.length);
        list.addFirst("O");
        System.out.println(list.length);
        System.out.println(list.getFirst());
        System.out.println(list);



    }
}
