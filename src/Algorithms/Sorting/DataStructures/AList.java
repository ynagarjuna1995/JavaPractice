package Algorithms.Sorting.DataStructures;

/**
 * @author Nagarjuna
 *
 *  Generic Array creation in Java seems extra work so going with int arrays
 *  For more details : http://stackoverflow.com/questions/529085/how-to-create-a-generic-array-in-java
 *
 */
public class AList {

     int[] items;
     int size;

    /*  Constructor for Alist which creates empty array list
     *  Interesting Observation: and perfect explanation for why Constructors don't have return types
     *      public void Alist () {
     *       items = new int[30];
     *       size = 0;
     *      }
     *
     *      In this Java does not create anything and keeps a null reference with out throwing any errors but
      *     when we try to insert elements it gives a NullPointerException since because we didn't allocate any heap
      *     memory for the array.
      *
      *     So Constructors plays a major role :P
     *  */

    public AList () {
        items = new int[30];
        size = 0;
    }

    public int size() {
        return size;
    }
    /*Insert an element at the back of the Array */
    public void insertAtBack(int x){
        items[size] = x;
        size++;
    }

    public int getBack() {
        return items[size-1];
    }


    public int deleteBack() {
        int oldBack = getBack();
        size = size-1;
        return oldBack;
    }
}
