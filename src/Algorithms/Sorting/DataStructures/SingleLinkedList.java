package Algorithms.Sorting.DataStructures;

import java.util.*;

public class SingleLinkedList<anyType> implements Iterable<anyType>{

    private Node<anyType> head;
    private int length;

    /******************************************************
     *          Node Class
     * *****************************************************/
    private static class Node<anyType> {
        private Node <anyType> next;
        private anyType data;

        public Node(Node<anyType> next, anyType data) {
            this.next = next;
            this.data = data;
        }
        /*************************************************************
        *  Don't use this type of constructor. This constructor creates
         * an object with value/data - null pointing to null reference/pointer.
        *
        * **********************************************************/

/*        public Node(anyType data) {
            this.data = data;
            this.next = null;
        }*/
    }

    /************************************************************
     *         Implementing the Iterable Interface
     * ***********************************************************/

    /*The whole idea of the iterator is to provide an access to a private aggregated data and at the same moment
      hiding the underlying representation. An iterator is Java is an object, and therefore it's implementation requires
      creating a class that implements the Iterator interface.*/

    /*Method for creating an instance of Iterator i.e., getting the iterator object */

    public Iterator<anyType> iterator () {
        return new SingleLinkedListIterator();
    }

    private class SingleLinkedListIterator implements Iterator<anyType> {

    private Node<anyType> nextNode;

        public SingleLinkedListIterator() {
            nextNode = head;
        }


        public boolean hasNext() {
            return nextNode !=null;
        }
        public anyType next() {
            /*If there is no element throw exception*/
            if (!hasNext()) throw new NoSuchElementException();
            /*Returning the data assigning the identifier "res" which contains the element to return */
            anyType res = nextNode.data;
            nextNode = nextNode.next;
            return res;
        }
    }

    /*********************************************************
     *          singlyLinkedList Constructor
     * ********************************************************/

    /*Creates an empty Linked List*/
    public SingleLinkedList() {

        /*******************************************************************
         * Some website suggest to do this in a different way shown below
         *
         *      Constructor : This constructor creates an object with value null pointing to null reference/pointer
         *              public Node(anyType data) {
         *                  this.data = data;
         *                   this.next = null;
         *              }
         *
         *      head = new Node<anyType>(null)  -> Which is creating a Node with null value as shown below
         *
         *      --> B O O K null
         *
         * Don't do this mistake
         *
         * *****************************************************************/

        head = null;
        length = 0;
    }

    /***********************************************************
     *  Add,Remove,get First Element in Linked List
     * **********************************************************/
    public void addFirst (anyType data) {

        head = new Node<anyType>(head,data);
        length++;
    }
    /****************************************************************
    * With out this method we will get a weird error :P
     * Code would be : file_name@4554617c
     * So we must convert this collection object to string in order to
     * print this out.
    **************************************************************** */
    public String toString()
    {
        StringBuffer result = new StringBuffer();
        for(Object x : this)
            result.append(x + " ");

        return result.toString();
    }

    public static void main(String[] args) throws Exception{

        SingleLinkedList<String> list = new SingleLinkedList<String>();
        if (list.length == 0) System.out.println("An Empty Linked List is created ");
        list.addFirst("K");
        System.out.println(list.length);
        list.addFirst("O");
        list.addFirst("O");
        list.addFirst("B");
        if (list.length == 4) System.out.println("Inserted elements succesfully using addFirst() ");
        System.out.println(list.length);
        System.out.println(list);


    }
}