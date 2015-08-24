import java.util.Scanner;

public class StringArrayInput {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the Array :");
        int length = scanner.nextInt();
        System.out.println("Length of the Array :"+length);
        Integer[] names = new Integer[length];

        for (int i = 0; i < length; i++) {
            names[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Your Friend list is ");
        for (int i = 0; i <length ; i++) {
            System.out.println(names[i]);
        }
    }
}
