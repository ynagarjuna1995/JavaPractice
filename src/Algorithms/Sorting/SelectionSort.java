package Algorithms.Sorting;
import java.util.Arrays;
import java.util.Scanner;


/*with this kind of implementation I was able to sort Sort any input no matter it is of type by taking input from the keyboard
  Approach
  1. Used two Helper procedures
        less() - Checks whether the value I assumed is minimum or not if greater sends 0 which tells me to assign that min to this value
        exch() - Taking the array, First Iteration index value,and min value to exachange
            Used a temporary swap value
             swap = a[i] - Store the initial assumed value which is greater that I found with the less()
             a[i] = a[j] - Which makes sure that minimum value is in correct position excanging the value
             a[j] = swap - Repacing my value
  2. sort() - Used above two methods to make it clear.
* */

/*Issues :
   Given Input : Nagarjuna,Somesh,Venkatesh,Unni - sorting is proper
   Input - Nagarjuna,Somesh,Venkatesh,unni(small letter u) - sorting changed
   Input - 3,4,9,1 - Sorting Proper
   Input - 3,101,32,12 - Sorting not proper
 */
public class SelectionSort {

    public static Comparable[] sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N - 1; i++) {
            int min = i;
            for (int j = i + 1; j < N ; j++) {
                if (less(a[j],a[min]))
                    min = j;
            }
            exch(a, i, min);

        }
        return a;
    }
    public static boolean less (Comparable v,Comparable w){
        return v.compareTo(w) < 0;

    }

    public static void exch (Comparable a[],int i, int j) {
        Comparable swap = a[i];
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
        Comparable[] sortedmembers = sort(members);
//         Cost Effective use the inbuilt functions :P
//        for (int k = 0; k <length ; k++) {
//            System.out.println(sortedmembers[k]);
//
//        }
        System.out.println(Arrays.toString(sortedmembers));






    }
}
