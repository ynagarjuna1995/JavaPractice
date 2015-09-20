package misc;
/**
 * Summing array of integers using the while loop
 * For visualizing the debugger
 *
 * */
public class ArraySum {

    /**
     * Sum of elements of array using the for each loop in java*/

    public static int iterAdd (int[] a) {
        for (int x : a) {
            int sum = 0;
            sum += x;
        }

    }

    public static void main(String[] args) {
        int[] x = {0,4,2,7,8};
        int i =0, sum =0 ;

        while (i < x.length) {
            sum += x[i];
            i++;
            System.out.printf("loop Count is %d \n", i);
            System.out.printf("Sum value is %d \n ",sum);
        }

        System.out.println(sum);
    }
}
