package Algorithms.Sorting.DataStructures;
/*  Basic operations that can be performed on this type of Linked List are
  1. Add,Get,Remove elements at the beginning of the Linked List
  2. Add,Get at the end of the Linked List
  3. Adding an element after the specified element
  4. Adding an element before the specified element
  5. Adding an element at the specfied position.
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
    /************************************************************
     *      Constructor which creates an empty SinglyLinkedList.
     *************************************************************/
    public SinglyLinkedList () {
        head = null;
    }

    /***************************************************
    *       Node Class (Must be Static)
    ****************************************************/
    private static class Node<AnyType> {
        private Node<AnyType> next;
        private AnyType data;

        /*Constructor for the Node Class */
        public Node (AnyType data, Node<AnyType> next) {
            this.data = data;
            this.next = next;
        }
    }

    /******************************************************************
     *         SinglyLinkedListIterator class implementing iterator
     ******************************************************************/

    /*The whole idea of the iterator is to provide an access to a private aggregated data and at the same moment
      hiding the underlying representation. An iterator is Java is an object, and therefore it's implementation requires
      creating a class that implements the Iterator interface.*/

    private class SinglyLinkedListIterator implements Iterator<AnyType> {

        private Node<AnyType> nextNode;

        public SinglyLinkedList () {
            Node<AnyType> nextNode = head;
        }

        public boolean hasNext() {
           return nextNode != null;
        }

        /*Return the data in the LinkedList*/
        public AnyType next() {
            /*If there is no element throw exception*/
            if(!hasNext()) throw new NoSuchElementException();
            /*Returning the data assigning the identifier "res" which contains the element to return */
            AnyType res = nextNode.data;
            nextNode = nextNode.next;
            return res;
        }
        /*Not Implementing remove operation through Iterator*/
        public AnyType remove() {
            throw new UnsupportedOperationException();
        }

    }


    /*Method for creating an instance of Iterator i.e., getting the iterator object */
    public Iterator<AnyType> iterator () {
        return new SinglyLinkedListIterator();
    }
}




