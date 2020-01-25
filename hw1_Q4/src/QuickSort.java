import java.io.*;
import java.util.Scanner;


public class QuickSort
{
    /*returns index of element with median value of beginning, middle and end elements
sorts beginning, middle and end element relative to each other*/
    private static int medianOf3(int[] arr, int beginning, int end) {
        int middle = (beginning + end) >>> 1;//>>> prevents overflow error where / wouldn't
        /*following 3 lines may cause side effects*/
        if(arr[beginning] > arr[middle])
            swap(arr, beginning, middle);

        if(arr[beginning] > arr[end])
            swap(arr, beginning, end);

        if(arr[middle] > arr[end])
            swap(arr, middle, end);

        swap(arr, middle, end-1);
        return arr[end-1];

    }

    private static void swap(int[] arr, int start, int end)
    {
        int[] reorder = arr;
        int begin = start;
        int fin = end;


        for (int a = 0; a <= fin; a++)
        {
            if (reorder[a] < reorder[begin])
            {
                //logic??
            }
            else if(reorder[a] > reorder[fin])
            {
                //logic??
            }
            else if (reorder[a] == reorder[begin])
            {
                //logic??
            }
            else
            {
                //logic??
            }
            a++;
        }


    }
    public static void quicksort(int[] arr, int beginning, int end) {

        if(end-beginning >= 1) {
            int partition = partition(arr, beginning, end);
            quicksort(arr, beginning, partition);//note sure if this should be partition-1
            quicksort(arr, partition + 1, end);
        }
    }
    private static int partition(int[] arr, int beginning, int end) {
        //int pivot = arr[beginning];
        int pivot = medianOf3(arr, beginning, end);
        int lftPtr = beginning-1;
        int rhtPtr = end+1-1;//-1 for last swap in median()
        for(;;) {
            lftPtr = lftPtr + 1;
            while(arr[lftPtr] < pivot && lftPtr < end)
                lftPtr = lftPtr + 1;

            rhtPtr = rhtPtr - 1;
            while(arr[rhtPtr] > pivot && rhtPtr > beginning)
                rhtPtr = rhtPtr -1;

            if(rhtPtr > lftPtr)
                swap(arr, lftPtr, rhtPtr);
            else
                return lftPtr;
        }
    }



//    //basic Quick Sort function
// /* This function takes last element as pivot,
//       places the pivot element at its correct
//       position in sorted array, and places all
//       smaller (smaller than pivot) to left of
//       pivot and all greater elements to right
//       of pivot */
//    int partition(int arr[], int low, int high)
//    {
//        int pivot = arr[high];
//        int i = (low-1); // index of smaller element
//        for (int j=low; j<high; j++)
//        {
//            // If current element is smaller than or
//            // equal to pivot
//            if (arr[j] <= pivot)
//            {
//                i++;
//
//                // swap arr[i] and arr[j]
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//
//        // swap arr[i+1] and arr[high] (or pivot)
//        int temp = arr[i+1];
//        arr[i+1] = arr[high];
//        arr[high] = temp;
//
//        return i+1;
//    }
//
//
//    /* The main function that implements QuickSort()
//      arr[] --> Array to be sorted,
//      low  --> Starting index,
//      high  --> Ending index */
//
//    void quickSortF(int arr[], int low, int high)
//    {
//        if (low < high)
//        {
//            /* pi is partitioning index, arr[pi] is
//              now at right place */
//            int pi = partition(arr, low, high);
//
//            // Recursively sort elements before
//            // partition and after partition
//            quickSortF(arr, low, pi-1);
//            quickSortF(arr, pi+1, high);
//        }
//    }
//
//    void quickSortM(int arr[], int low, int high)
//    {
//
//
//
//    }
//
//    void quickSortR(int arr[], int low, int high)
//    {
//
//
//
//    }
//
//    void quickSortMed3(int arr[])
//    {
//
//
//
//    }
//
//    void quickSortMed5(int arr[])
//    {
//
//
//    }

}