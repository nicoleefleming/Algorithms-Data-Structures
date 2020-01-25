import java.io.*;
import java.util.Scanner;

public class hw1_Q4
{
    public static void main(String[] args) throws IOException
    {
        final int ARRAY_SIZE = 100; // the fixed size of an array we will use

        int[] A = new int[ARRAY_SIZE];

        int n = 0;// the number of elements stored in A
        String inputFile = "hw1_Q4_input.txt"; // the name of the input file
        String outputFile = "hw1_Q4_output.txt"; // the name of the output file

        //read the numbers from the input file to array A in a function input(), which will return the number of elements of A; you do not need to change anything in the function
        n = input(A, inputFile);

        //call the selection sort procedure
        selectionSort(A, n);

        //print the numbers of A out in the screen/console
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + "  ");

        System.out.println();

        //output the sorted numbers in A to output file; this is done in a function input(); you do not need to change anything in the function
        output(A, n, outputFile);
    }

    //read the numbers from the input file to array A; the function will return the number of elements of A; you do not need to change anything in the function
    private static int input(int[] A, String inputFile) throws IOException
    {
        File myFile = new File(inputFile);
        Scanner input = new Scanner(myFile);

        int i = 0;

        while(input.hasNext())
        {
            int value = input.nextInt();
            A[i] = value;
            i++;
        }

        input.close();

        return i;
    }

    //output the sorted numbers in A to output file; you do not need to change anything in the function
    private static void output(int[] A, int n, String outputFile) throws IOException
    {
        PrintWriter output = new PrintWriter(outputFile);
        for(int i = 0; i < n; i++)
            output.print(A[i] + " ");
        output.close();
    }

    //please finish the following function
    private static void selectionSort(int[] A, int n)
    {
        n = A.length;
        //one by one movement of unsorted sub-array(when its smaller parts)
        for(int sub = 0; sub < (n - 1); sub++)
        {
            //need to find minimum element in unsorted array
            int min = sub;
            for (int index = (sub + 1); index < n; index++)
            {
                if(A[index] < A[min])
                {
                    min = index;
                }
            }
            //get new minimum element by swapping elements
            int temp = A[min];
            A[min] = A[sub];
            A[sub] = temp
        }
    }
}