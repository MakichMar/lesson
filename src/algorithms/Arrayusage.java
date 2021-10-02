package algorithms;

public class Arrayusage {

    public static void main(String[] args) {
        ArrayHelpers helpers = new ArrayHelpers();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 100);

        }
        System.out.print("Generated Array: ");
        helpers.print(array);

        helpers.insertionSort(array);

        System.out.println( "\nSorted Array: ");

        helpers.print(array);
    }

}
