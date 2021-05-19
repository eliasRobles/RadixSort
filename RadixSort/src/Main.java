import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        RadixSort rS = new RadixSort();

        System.out.println("Radix sort in Java");
        int[] input = { 181, 51, 11, 33, 11, 39, 60, 2, 27, 24, 12 };

        System.out.println("An Integer array before sorting");
        System.out.println(Arrays.toString(input));

        // sorting array using radix Sort Algorithm
        rS.radixSort(input);

        System.out.println("Sorting an int array using radix sort algorithm");
        System.out.println(Arrays.toString(input));

    }//end main method
}//end main class
