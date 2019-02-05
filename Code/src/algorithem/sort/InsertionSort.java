package algorithem.sort;

/**
 * Created by Jin on 2/4/2019.
 */
public class InsertionSort {

    public static void main(String[] args){
        System.out.println("Insertion Sort");
        int[] array = new int[]{1, 3, 5, 2, 4, 6};
        insertionSort(array);
        printArray(array);

        array = new int[]{1};
        insertionSort(array);
        printArray(array);

        array = new int[]{};
        insertionSort(array);
        printArray(array);

        array = new int[]{1, 2, 3};
        insertionSort(array);
        printArray(array);

        array = new int[]{4, 2, 3};
        insertionSort(array);
        printArray(array);
    }


    public static void insertionSort(int[] array){
        int temp, len = array.length;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < i; j++){
                if( array[j] > array[i]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }


    }



    public static void printArray(int[] array){
        for(int i : array){
            System.out.print(i + ", ");
        }
        System.out.println("");

    }

}
