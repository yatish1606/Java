import java.util.Scanner;

public class Arrays {
    private static Scanner scanner = new Scanner((System.in));
    public static void main (String[] args) {
    int[] array = readArray(5);
    printArray(array);
    printArray(sortArray(array,"ascending"));
    }

    public static int[] readArray(int number) {
        int[] myArray = new int[number];
        for(int i = 0; i < number; i ++) {
            System.out.println("Enter number : ");
            myArray[i] = scanner.nextInt();
        }
        return  myArray;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i ++) {
            System.out.print("\t" + array[i]);
        }
        System.out.println("\n");
    }

    public static int[] sortArray(int[] array , String type) {
        int[] newArray = new int[array.length];
        boolean flag = true;

        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        while (flag) {
            flag = false;
            for(int i = 0; i < newArray.length-1; i++) {
                if(newArray[i] < newArray[i+1]) {
                    int temp = newArray[i];
                    newArray[i] = newArray[i+1];
                    newArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        if(type == "ascending") {
            for(int i = 0; i < newArray.length-1; i++) {
                int temp = newArray[i];
                newArray[i] = newArray[newArray.length-i-1];
                newArray[newArray.length-i-1] = temp;
            }
        }

        return newArray;
    }
}
