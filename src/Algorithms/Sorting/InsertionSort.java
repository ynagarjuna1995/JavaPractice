package Algorithms.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static boolean less(Comparable v,Comparable w) {
       return v.compareTo(w) < 0;
    }
    public static void exch (Comparable[] a,int i,int j ){
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    public static Comparable[] insertionsort(Comparable a[]) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0 ; j--) {
               if(less(a[j],a[j-1])){
                   exch(a,j,j-1);
               }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Lenght of your Array :");
        int length = scanner.nextInt();
        Comparable[] members = new Comparable[length];
        for (int k = 0; k < length; k++) {
            System.out.println("Enter the memebers of your array");
            members[k] = scanner.next();
        }
        scanner.close();
        System.out.println("you have entered");
        System.out.println(Arrays.toString(members));
//        Cost Effective use the inbuilt functions :P
//        for (int h = 0; h < length; h++) {
//            System.out.print(members[h]);
//        }

        Comparable[] sortedMembers = insertionsort(members);
//         Cost Effective use the inbuilt functions :P
//        for (int l = 0; l < length; l++) {
//            System.out.println("Your Sorted Array is");
//            System.out.println(sortedMembers[l]);
//        }
        System.out.println(Arrays.toString(sortedMembers));

    }
}
