package Algorithms.Sorting;

import java.util.Arrays;

/**
 * @author Nagarjuna
 *
 * 1. In Place mergesort algorithm copy the input array into an auxillary array
 * 2. Sort the auxillary array recursively
 * 3. Merge the sorted array.
 */
public class MergeSort {

    private MergeSort(){}

    /**
     * In Place Merge Sort :
     * 1. Copy the Contents of array a[] to aux[] array
     * 2. And now we have two sorted halves in the aux[] array assummin the input to the merge function aux[] which has two sorted subroutines.
     * 3. Cases:
     * 1. When i > mid ->  a[k] = aux[j++] (Assigning and incresing the pointer count)
     * 2. If j > high ->   a[k] = aux[i++]
     * 3. Check the inversion pairs :
     * if a[j] < a[i] a[k] = aux[j++]
     * 4. All the cases are vanished and clean up is to copy the left over element in the left sub routine
     * a[k] = a[i++]
     */

    public static void merge(Comparable[] a, Comparable[] aux, int low, int high, int mid) {

        for (int k =0; k < high ; k++) {
            aux[k] = a[k];
        }
           int i = low,j = mid+1;

           for (int k = 0; k < high ; k++) {

            if (i > mid) a[k] = aux[j++];

            else if (j > high) a[k] = aux[i++];

            else if (Algorithms.Sorting.InsertionSort.less(aux[j], aux[i])) {a[k] = aux[j++];}

            else a[k] = aux[i++];

        }
    }

    /**
     * Implementation of all the sub-routines ,left,right,and split */
    public static void sort(Comparable[] a,Comparable[] aux,int low,int high){
        int mid = low + (high-low)/2;
        if (high <= low) return;

        sort(a,aux,low,mid);
        sort(a, aux, mid + 1, high);
        merge(a,aux,low,high,mid);

    }

    public static void msort (Comparable[] a){
        Comparable[] aux = new Comparable[a.length];
        sort(a,aux,0,a.length-1);
    }

    public static void main(String[] args) throws Exception{


       Comparable[] a = {9,8,6,5,4,3,2,1};
        msort(a);
        System.out.println(Arrays.toString(a));
    }
}


