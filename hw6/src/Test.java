import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Test extends QuickSort {

    public static void main(String[] args) throws IOException {

        //open and assign file input to be read in
        File file = new File("C:\\Users\\Nicole\\IdeaProjects\\hw6\\src\\pi" );



        //get the data into an integer array from the file.
        int[] data = input(file);
        int[] data1 = input(file);
        int[] data2 = input(file);
        int[] data3 = input(file);
        int[] data4 = input(file);


        //get the data from the string files into an array of strings.
        //String[] toMerge1 = input2();
        //String[] toMerge2 = input2();

        int lengthOfData = data.length;
        System.out.println(lengthOfData);


        //Preform Quicksorts
        //median of 3(?)
        sortMedThreePivot(data, data[0], data[18]);
        System.out.println("Quicksort Median of 3: " + Arrays.toString(data));
        System.out.println();

        //median of 5
        sortMedFivePivot(data1, data1[0], data1[18]);
        System.out.println("Quicksort Median of 5: "  + Arrays.toString(data1));
        System.out.println();

        //middle variable
        sortMiddlePivot(data2, data2[0], data2[18]);
        System.out.println("Quicksort Middle variable: " + Arrays.toString(data2));
        System.out.println();

        //first variable
        sortFirstPivot(data1, data1[0], data1[18]);
        System.out.println("Quicksort Fist variable: " + Arrays.toString(data1));
        System.out.println();

        //Random variable
        sortRandPivot(data4, data4[0], data4[18]);
        System.out.println("Quicksort Random variable: " + Arrays.toString(data4));
        System.out.println();

    }


    public static int[] input(File file) {
        String expression = "";
        try {
            //created a new File object

            //create a new Scanner
            Scanner read = new Scanner(file);

            //scans file and puts into string to convert.
            expression = read.nextLine();
        } catch (FileNotFoundException error) {
            //will print ONLY if the file is not found. Will print in RED
            System.err.println("Did not find file");
        }
        //put read in string into string array and split
        String[] toInt = expression.split(" ");

        // Create new array to store integers from conversion of string array
        int[] ints = new int[toInt.length];

        //Debugging to make sure it is correct
        //System.out.println(ints);

        //convert string to array of integers
       for(int i = 0;i < toInt.length;i++)
       {
           try
           {
               ints[i] = Integer.parseInt(toInt[i]);
               ints[i] = ints[i];
           }
           catch (NumberFormatException nfe)
           {
               ints[i] = Integer.parseInt(null);
           }
        }

        //return array of integers
        return ints;
    }
}
