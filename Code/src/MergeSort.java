import java.util.Arrays;

/**
 * Created by Jin on 2/4/2019.
 */
public class MergeSort {

    public static void main(String[] args){

        int[] array = new int[]{1};
        printArray(mergeSort(array));

        array = new int[]{};
        printArray(mergeSort(array));

        array = new int[]{1, 3, 5, 2, 4, 6};
        printArray(mergeSort(array));

        array = new int[]{1, 3, 5};
        printArray(mergeSort(array));

        array = new int[]{6, 5, 4, 3, 2, 1};
        printArray(mergeSort(array));

        array = new int[]{6, 5, 4, 3, 2, 1, 7};
        printArray(mergeSort(array));

        array = new int[]{1, 5, 3};
        printArray(mergeSort(array));

        array = new int[]{1, 5, 5};
        printArray(mergeSort(array));

    }

    public static int[] mergeSort(int[] array) {
        int len = array.length;
        if (len == 1 || len == 0) {
            return array;
        } else {
            int mid = len / 2;
            int[] first = Arrays.copyOfRange(array, 0, mid);

            int[] second = Arrays.copyOfRange(array, mid, len);

            return merge(mergeSort(first), mergeSort(second));
        }
    }

     public static int[] merge(int[] first, int[] second){
            int firstLen = first.length, secondLen = second.length;
            int i = 0,  j = 0, k = 0;
            int[] re = new int[firstLen + secondLen];
            while(i < firstLen && j < secondLen){
                if(first[i] <= second[j]){
                    re[k] = first[i];
                    ++i;
                }else{
                    re[k] = second[j];
                    ++j;
                }
                ++k;
            }
            while (i < firstLen){
                re[k] = first[i];
                ++k;
                ++i;
            }
            while(j < secondLen){
                re[k] = second[j];
                ++j;
                ++k;
            }
            return re;
    }

    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printArray(int[] array){
        for(int i : array) {
            System.out.print(String.valueOf(i) + ", ");
        }
        System.out.println("");
    }


}
