package Algorithms.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ShellSort {

    public static Comparable[] sort(Comparable[] a) {
        int h = 1;
        int N = a.length;
//        Incremental Sequence - We can choose any incremental sequence one which
//        is easy to calculate is the sequence 3x+1
//        Best Incremental Sequence is by Marcin ciura - Sequnce is generated by multiplying the previous size with 2.2
        while (h < N/3) h = h*3 + 1;

//        H-Sorting with Insertion Sort - 4-Sort,1-Sort
        while (h >=1){
            for (int i = h; i <N ; i++) {
                for (int j = i; j >=h  && less(a[j],a[j-h]); j -=h) {
                    exch(a,j,j-h);
                }
            }
            h = h/3;
        }
        return a;
    }

    public static boolean less(Comparable v,Comparable w) {
        return v.compareTo(w) <0 ;
    }
    public static void exch(Comparable[] a, int i, int j){
        Comparable swap = a[i] ;
        a[i] = a[j];
        a[j] = swap;
    }

    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array you wish to Sort");
        int length = scanner.nextInt();
        Comparable[] members = new Comparable[length];
        for (int i = 0; i <length ; i++) {
            System.out.println("Enter the members of the array one by one ");
            members[i] = scanner.next();
        }
        scanner.close();
        System.out.println(Arrays.toString(members));
        Comparable[] sortedmembers = sort(members);

        System.out.println(Arrays.toString(sortedmembers));



    }
}