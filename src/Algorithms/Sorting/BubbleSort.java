package Algorithms.Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static boolean more(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }
    public static void exch(Comparable a[],int i,int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static Comparable[] sort (Comparable a[]){
        int N = a.length;
        for (int i = 0; i < N-1 ; i++) {
            int flag = 0;
            for (int j = 0; j < N-i-1; j++) {
//                Compares whether a[i] is grater than a[i+1]
                if(more(a[j],a[j+1])){
//                  Exchange the elements
                    exch(a,j,j+1);
//                  If there are no exchanges change the flag to 1 which says there are no more swaps
                    flag = 1;
                }
            }
            if (flag == 0) break;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of your Array to Bubble sort");
        int length= scanner.nextInt();

        Comparable[] members = new Comparable[length];

        for (int k = 0; k <length ; k++) {
            System.out.println("Enter the  member of your Array");
            members[k] = scanner.next();
        }

        Comparable[] sortedmembers = sort(members);

        for (int l = 0; l < length; l++) {

            System.out.println(sortedmembers[l]);
        }



    }
}
// 6 3 9 1 0 8