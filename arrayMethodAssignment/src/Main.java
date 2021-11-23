import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*

        For this assignment you are to write several static methods that will be able to:

        Add values to the end of an array.
        Delete values from the end of an array (often referred to as pop).
        Insert values into an array at chosen index position. (Increases the size of the array by 1 Ex. array 2, 3, 5. Insert 4 into position 2 gives 2,3,4,5)
        You can choose any data type for your array that you like.Each one of the problems above should have its own method.

        Tip:
        Since Array's index numbers are fixed if you want to add an element to an array you will need an entirely different array with 1 more index position.
        Use iterations to copy array data from one to another.

         */

        int[] list1 = {1,2,3,4,5};
        int listLength = list1.length;

//        System.out.println(Arrays.toString(addToEnd(6, listLength, list1)));
//        System.out.println(Arrays.toString(backspace(listLength,list1)));

//        System.out.println(Arrays.toString(addAnywhere(6, listLength, list1, 2)));



    }


    public static int[] addToEnd(int num, int arrLength, int[] arr){
        int[] newList = new int[arrLength+1];
        for (int i = 0; i < arrLength; i++) {
            newList[i] = arr[i];
        }
        newList[arrLength] = num;
        return newList;

    }

    public static int[] backspace(int arrLength, int[] arr){
        int[] newList = new int[arrLength - 1];
        for (int i = 0; i < arrLength - 1; i++) {
            newList[i] = arr[i];
        }
        return newList;

    }

    public static int[] addAnywhere(int num, int arrLength, int[] arr, int index){
        int[] newList = new int[arrLength+1];
        for (int i = 0; i < arrLength; i++) {
            newList[i] = arr[i];
        }
        newList[index] = num;
        return newList;

    }


}
