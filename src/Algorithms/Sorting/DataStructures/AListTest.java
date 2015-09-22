package Algorithms.Sorting.DataStructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author  Nagarjuna
 */


public class AListTest {

    @Test
    public void testEmptySize () {
        AList list = new AList();
        assertEquals(0,list.size());
    }

    @Test
    public void testInsertAndGetSize () {
        AList list = new AList();
        list.insertAtBack(5);
        list.insertAtBack(6);
        list.insertAtBack(7);
        list.insertAtBack(5);
        assertEquals(4, list.size());
    }

    @Test
    public void testGetBackAndDeleteBack () {
        AList list = new AList();
        list.insertAtBack(5);
        list.insertAtBack(6);
        list.insertAtBack(7);
        list.insertAtBack(5);
        assertEquals(5,list.getBack());
        assertEquals(5,list.deleteBack());
    }


}