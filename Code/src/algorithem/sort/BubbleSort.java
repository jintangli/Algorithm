package algorithem.sort;

/**
 * Created by Jin on 2/4/2019.
 */
public class BubbleSort {

    public static void main(String[] args){
        System.out.println("Bubble Sort");

        int[] array = new int[]{1, 3, 5, 2, 4, 6};
        bubbleSort(array);
        printArray(array);

        array = new int[]{1};
        bubbleSort(array);
        printArray(array);

        array = new int[]{};
        bubbleSort(array);
        printArray(array);

        array = new int[]{1, 2, 3};
        bubbleSort(array);
        printArray(array);

        array = new int[]{4, 2, 3};
        bubbleSort(array);
        printArray(array);
    }

    private static void bubbleSort(int[] array){
        boolean flag = true;
        int temp, j, len = array.length;

        while (flag) {
            flag = false;
            for(int i = 0; i < len - 1; i++){
                j = i+1;
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    flag = true;
                }
            }


        }

    }


    private static void printArray(int[] array){
        for(int i : array){
            System.out.print(i + ", ");
        }
        System.out.println("");

    }

}
