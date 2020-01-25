import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class QuickSort {
    /*returns index of element with median value of beginning, middle and end elements
sorts beginning, middle and end element relative to each other*/
    private static int medianOf3(int[] arr, int beginning, int end) {
        int mid = (beginning + end) / 2;

        if (arr[mid] < arr[beginning]) {
            swap(arr, mid, beginning);
        }

        if (arr[end] < arr[beginning]) {
            swap(arr, end, beginning);
        }

        if (arr[mid] > arr[end]) {
            swap(arr, mid, end);
        }

        swap(arr, mid, end - 1);

        return arr[end - 1];

    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void sortMedThreePivot(int[] arr, int beginning, int end) {
        int size = arr[end] - arr[beginning] + 1;
        if (size <= 3) {
            manualsort(arr, beginning, end);
        }
        else {
            double pivot = medianOf3(arr, beginning, end);
            System.out.println("Pivot is: " + pivot);

            int partition = partition(arr, beginning, end);
            System.out.println("The p_index is: " + partition);

            sortMedThreePivot(arr, beginning, partition - 1);
            sortMedThreePivot(arr, partition + 1, end);
        }
    }

//    private static int partition(int[] arr, int beginning, int end, int pivot) {
//       // int index = 0;
//
//        while (true) {
//            while (beginning > pivot)
//                pivot++;
//            while (end < pivot)
//                pivot++;
//            if (beginning <= end)
//            {
//                break;
//            }
//            else
//            {
//                swap(arr, beginning, end);
//            }
//        }
//       // swap(arr, left, right - 1);
//        return beginning;
//
////        while(left < right)
////        {
////            while(arr[left] < pivot)
////            {
////                left++;
////            }
////            while(arr[right] > pivot)
////            {
////                right--;
////            }
////            if(left < right)
////            {
////                swap(arr, left, right);
////            }
////        }
////
////        swap(arr, left, end - 1);
////        return left;
//    }


    public static void manualsort(int[] arr, int start, int end)
    {
        int size = (end - start) + 1;

        if (size <= 1)
        {
            return;
        }
        if (size == 2)
        {
            if (arr[end] < arr[start])
            {
                swap(arr, start, end);
                return;
            }
        }
        else
        {
            if (arr[end - 1] < arr[start])
            {
                swap(arr, end - 1, start);
            }
            if (arr[end] < arr[start])
            {
                swap(arr, end, start);
            }
            if (arr[end - 1] > arr[end])
            {
                swap(arr, end - 1, end);
            }
            return;
        }
    }

//    /* The main function that implements QuickSort()
//      arr[] --> Array to be sorted,
//      low  --> Starting index,
//      high  --> Ending index */

    public static int partition_f(int arr[], int left, int right)
    {
        int pivot = arr[left];
        while(left<=right) {
            while(arr[left] < pivot)
                left++;
            while(arr[right] > pivot)
                right--;
            if(left<=right)
            {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }
        return left;
    }
    public static void sortFirstPivot(int arr[], int low, int high) {
        if (low < high) {

                /* pi is partitioning index, arr[pi] is
              now at right place */

            //double pivot = (high + low) / 2;

            //get the int conversion to pass into the
            int pivot = 3;

            int pi = partition_f(arr, low, high);

            // Recursively sort elements before
            // partition and after partition

            sortFirstPivot(arr, low, pi - 1);
            sortFirstPivot(arr, pi + 1, high);
        }
        if(low == high)
        {
                /* pi is partitioning index, arr[pi] is
              now at right place */

            //double pivot = (high + low) / 2;
            int pivot = 3;
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition

            sortFirstPivot(arr, low, pi - 1);
            sortFirstPivot(arr, pi + 1, high);
        }
    }

    public static void sortRandPivot(int[] arr, int low, int high) {
        if (low < high) {

        /* pi is partitioning index, arr[p] is now
        at right place */
            int pi = partition_r(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            sortRandPivot(arr, low, pi - 1);
            sortRandPivot(arr, pi + 1, high);
        }
    }
    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; // pivot
        int i = (low - 1); // Index of smaller element

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot) {

                i++; // increment index of smaller element
                swap(arr, arr[i], arr[j]);
            }
        }
        swap(arr, arr[i + 1], arr[high]);
        return (i + 1);
    }

    // Generates Random Pivot, swaps pivot with
// end element and calls the partition function
    public static int partition_r(int arr[], int low, int high)
    {
        // Generate a random number in between
        // low .. high
        int rand = new Random().nextInt();
        int random = low + rand % (high - low);

        // Swap A[random] with A[high]
        swap(arr, arr[random], arr[high]);

        return partition(arr, low, high);
    }

    private static int medianOf5(int[] arr, int beginning, int end)
    {
        int mid = (beginning + end) / 2;
        int firstmid = (beginning + mid) / 2;
        int secmid = (mid + end) / 2;

        if (arr[mid] < arr[firstmid]) {
            swap(arr, mid, firstmid);
        }

        if(arr[firstmid] < arr[beginning])
        {
            swap(arr, firstmid, beginning);
        }

        if(arr[end] < arr[secmid])
        {
            swap(arr, end, secmid);
        }

        if (arr[end] < arr[beginning]) {
            swap(arr, end, beginning);
        }

        if (arr[mid] > arr[end]) {
            swap(arr, mid, end);
        }

        swap(arr, mid, end - 1);

        return arr[end - 1];
    }

    public static void sortMedFivePivot(int[] arr, int low, int high) {
        int size = arr[high] - arr[low] + 1;
        if (size <= 5)
        {
            manualsort(arr, low, high);
        }
        else
        {
            double pivot = medianOf5(arr, low, high);
            //System.out.println("Pivot is: " + pivot);

            int partition = partition(arr, low, high);
            //System.out.println("The p_index is: " + p_index);

           sortMedFivePivot(arr, low, partition - 1);
           sortMedFivePivot(arr, partition + 1, high);
        }
    }

    public static void sortMiddlePivot ( int[] arr, int low, int high)
    {
        if(low < high)
        {
            // pick the pivot
            int middle = low + (high - low) / 2;
            int pivot = arr[middle];

            // make left < pivot and right > pivot
            int left = low;
            int right = high;
            while (left <= right)
            {
                while (arr[left] < pivot)
                {
                    left++;
                }

                while (arr[right] > pivot)
                {
                    right--;
                }

                if (left <= right)
                {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }

            // recursively sort two sub parts
            sortMiddlePivot(arr, low, right);
            sortMiddlePivot(arr, left, high);
        }
    }
}
