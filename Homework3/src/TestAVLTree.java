import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class TestAVLTree extends AVLTree
{
    public static void main(String[] args)
    {
        //open and assign file input to be read in
        File file = new File("C:\\Users\\Nicole\\IdeaProjects\\Homework3\\src\\input");

        //get the data into an integer array from the file.
        int[] data = input(file);


        AVLTree myTree = new AVLTree();
        //send the numbers into the AVL Tree one at a time
        for(int index = 0; index < data.length; index++)
        {
            myTree.insert(data[index]);
            //myTree.inorder();
        }
//        System.out.println("InOrder: ");
       myTree.inorder();
//        System.out.println();
        System.out.println("PreOrder: ");
        myTree.preorder();


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
}
