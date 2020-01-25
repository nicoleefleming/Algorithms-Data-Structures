import java.io.*;
import java.util.Scanner;

public class TestSortandMerge extends QuickSort
{

    public static void main(String[] args) throws IOException
    {

        //open and assign file input to be read in
        File file = new File("C:\\Users\\Nicole\\IdeaProjects\\hw6_7.49\\src\\input");


        //File alpha1 = new File("C:\\Users\\Nicole\\IdeaProjects\\hw6_7.49\\src\\alpha1");
        //File alpha2 = new File("C:\\Users\\Nicole\\IdeaProjects\\hw6_7.49\\src\\alpha2");

        //get the data into an integer array from the file.
        int[] data = input(file);

        //get the data from the string files into an array of strings.
        //String[] toMerge1 = input2();
        //String[] toMerge2 = input2();


        //Preform Quicksorts
        //median of 3(?)
        //quicksort(data, data[0], data[18]);

        //median of 5


        //middle variable


        //first variable


        //Random variable



        //Print out results:

        System.out.println("Quicksort Fist variable: ");
        System.out.println();
        System.out.println("Quicksort Middle variable: ");
        System.out.println();
        System.out.println("Quicksort Random variable: ");
        System.out.println();
        System.out.println("Quicksort Median of 3: ");
        System.out.println();
        System.out.println("Quicksort Median of 5: ");
        System.out.println();


    }


    public static int[] input(File file)
    {
        String expression = "";
        try
        {
            //created a new File object

            //create a new Scanner
            Scanner read = new Scanner(file);

            //scans file and puts into string to convert.
            expression = read.nextLine();
        }
        catch(FileNotFoundException error)
        {
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
        for (int num=0; num < toInt.length; num++) {
            ints[num] = Integer.parseInt(toInt[num]);
        }

        //return array of integers
        return ints;
    }

    //read the numbers from the input file to array A; the function will return the number of elements of A; you do not need to change anything in the function
//    private static String input2(String inputFile) throws IOException
//    {
//
//
////        Scanner s = new Scanner(System.in);
////        String[] array;
////
////        System.out.println("Please enter 20 names to sort");
////
////        for (int i = 0; i < array.length; i++) {
////            array[i] = s.nextLine();
//        }
//
//        //Just to test
//        System.out.println(array[0]);
//
//        //create new string variable to store input file contents
//        //outside of try/catch to stay in scope for lower prompts
//        String expression = "";
//
//        //Put try/catch block to catch FileNotFound exception
//        try
//        {
//            //created a new File object
//
//            //create a new Scanner
//            Scanner read = new Scanner(file);
//
//            //scans file and puts into string to convert.
//            while(read.hasNext())
//            {
//                //.next() will not allow for spaces in the input file, and still copy the expression
//                //if there are spaces in the input file, will need to create a case in conversion of how to handle.
//                //.nextLine() will read as it is, but won't extract the spaces.
//                expression = read.next();
//            }
//        }
//        catch(FileNotFoundException error)
//        {
//            //will print ONLY if the file is not found. Will print in RED
//            System.err.println("Did not find file");
//        }
//        //handles deleting all of the spaces but it doesn't quite work. Not sure why
//        //expression.replaceAll(" ","");
//
//        return expression;
//
//
////        File myFile = new File(inputFile);
////        Scanner input = new Scanner(myFile);
////
////        int i = 0;
////
////        while(input.hasNext())
////        {
////            int value = input.nextInt();
////            A[i] = value;
////            i++;
////        }
////
////        input.close();
////
////        return i;
//    }
//    //output the sorted numbers in A to output file; you do not need to change anything in the function
//    private static void output(int[] A, int n, String outputFile) throws IOException
//    {
//        PrintWriter output = new PrintWriter(outputFile);
//        for(int i = 0; i < n; i++)
//            output.print(A[i] + " ");
//        output.close();
//    }
}
