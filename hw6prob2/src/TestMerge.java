//package merging;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;



public class TestMerge extends Merge
{

    public static void main(String args[])
    {
        File[] files = new File[2];
        files[0] = new File("C:\\Users\\Nicole\\IdeaProjects\\hw6prob2\\src\\alpha1");
        files[1] = new File("C:\\Users\\Nicole\\IdeaProjects\\hw6prob2\\src\\alpha2");
        File linkedfile = new File("C:\\Users\\Nicole\\IdeaProjects\\hw6prob2\\src\\newalpha");
        // declare variables for the files
        String[] sourca, sourcb, link;

        sourca = input(files[0]);
        sourcb = input(files[1]);

        String[] combine = compare(sourca, sourcb);
        // linkfiles(files, linkedfile); //files aren't sorted here

        writefile(combine); // file is sorted here


//        System.out.println("alpha1: " + sourca.toString());
//        System.out.println("alpha2: " + sourcb.toString());
        //System.out.println("newalpha" + Arrays.toString(combine));
        System.out.println("Printed?");

    }

    public static String[] input(File file) {
        String expression = "";
        try
        {
            //created a new File object

            //create a new Scanner
            Scanner read = new Scanner(file);

            //scans file and puts into string to convert.
            expression = read.nextLine();
        }
        catch (FileNotFoundException error)
        {
            //will print ONLY if the file is not found. Will print in RED
            System.err.println("Did not find file");
        }
        System.out.println(expression);
        //put read in string into string array and split
        String[] array = expression.split(" ");
        System.out.println(array);
        //return array of split string items.
        return array;
    }
}
