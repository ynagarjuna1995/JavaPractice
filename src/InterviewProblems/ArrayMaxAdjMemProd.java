package InterviewProblems;

import java.util.Arrays;
import java.util.Scanner;

/*
 Comapany : Wipro
 Date : 27-08-2015
 Round : Technical -Elimination
 Level : Intermediate
 Concept : Arrays,Iterations,sorting
 Question : In an array of length N print highest product of the two adjacent elements*/
public class ArrayMaxAdjMemProd {
/*  Draft - 1
    1.Take the Array input
    2.Multiply the adjacent numbers,store it in an separate array
    3.Idea :Bubble sort - Perform only one Iteration no need to sort the entire array */

//    [5, 1, 8, 6, 7, 3, 8, 9, 4]
//    Helper Classes
    public static void exch (int[] a,int i,int j){
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }


    public static void main(String[] args) {
//        Array input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the Array");
        int length= scanner.nextInt();
        int[] members = new int[length];
//      Storing the input in the array
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the members of the array :");
            members[i] = scanner.nextInt();
        }
//        Print the array given by the user.Using wrapper class
        System.out.println(Arrays.toString(members));

//        Creating an seperate array of length half of the original array.
        int[] arrayProdAdj = new int[length-1];
//        calculate Product of the adjacent element
        for (int j = 0; j < length-1; j++) {
            arrayProdAdj[j] = members[j] * members[j+1];
        }
//        Print the array with calculated products of adjacent elements
        System.out.println("After performing the product array looks like this");
        System.out.println(Arrays.toString(arrayProdAdj));
//        Perform the bubble sort only two iteration to get the maximum value
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < length - k- 2; l++) {
                if ((arrayProdAdj[l] > arrayProdAdj[l+1])){
                    exch(arrayProdAdj,l,l+1);
                }
            }
        }
//        Output of array after sorting
        System.out.println("After Bubble sort array looks lke this");
        System.out.println(Arrays.toString(arrayProdAdj));
        System.out.println("Highest product is ");
//        Encountered an error ArrayIndexOutOfBoundException
//        My arrayProdAdj started from 0 so length-2 as length is the initial arrays lenght given by the user
        System.out.println(arrayProdAdj[length-2]);

    }
}
