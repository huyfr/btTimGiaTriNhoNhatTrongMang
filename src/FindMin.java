import java.util.Scanner;

public class FindMin {

    public static int sizeArray() {
        Scanner sc = new Scanner(System.in);
        int size;

        do {
            System.out.print("Enter a size of array: ");
            size = sc.nextInt();
            if (size > 10) {
                System.out.println("Array does not exceed 10");
            }
        } while (size > 10);
        return size;
    }

    public static void enterValue(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
    }

    public static void display(int[] array, String type) {
        if (type.equals("display")) {
            System.out.print("Array: ");
            for (int value : array) {
                System.out.print(value + "\t");
            }
            System.out.println();
        } else if (type.equals("minValue")) {
            int min = findMinValue(array);
            System.out.print("Min value in array: " + min);
            System.out.println();
        }
    }

    public static int findMinValue(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (min > value) {
                min = value;
            }
        }
        return min;
    }
}