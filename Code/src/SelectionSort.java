/**
 * Created by Jin on 2/4/2019.
 */
public class SelectionSort {

    public static void main(String[] args){

        int[] array = new int[]{1, 3, 5, 2, 4, 6};
        selectionSort(array);
        printArray(array);

        array = new int[]{1};
        selectionSort(array);
        printArray(array);

        array = new int[]{};
        selectionSort(array);
        printArray(array);

        array = new int[]{1, 2, 3};
        selectionSort(array);
        printArray(array);

        array = new int[]{4, 2, 3};
        selectionSort(array);
        printArray(array);
    }

    public static void selectionSort(int[] array){
        int len = array.length;
        int temp;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(array[i] >= array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }



    }

    public static void printArray(int[] array){
        for (int i : array){
            System.out.print(i + ", ");
        }
        System.out.println("");
    }

}
