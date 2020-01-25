//package merging;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Merge {

    public static void linkfiles(File[] files, File linkedfile)
    {
        //compare, and merge



        FileWriter out = null;

        BufferedWriter result = null;

        try
        {
            out = new FileWriter(linkedfile, true);
            result = new BufferedWriter(out);
        }
        catch(IOException a1)
        {
            a1.printStackTrace();
        }

        //System.out.print("When merging both the contents of " +
                //"the files, the Merged content in teh third file will be... \n");

        for(File q : files)
        {
            FileInputStream finst;

            //where do I or can I use the compare function for alphabetizing??

            try
            {
                finst = new FileInputStream(q);
                BufferedReader input = new BufferedReader(new InputStreamReader(finst));

                String third;

                while((third = input.readLine()) != null)
                {

                    result.write(third);
                    result.flush();
                    result.newLine();
                    System.out.print(third);
                }
                input.close();

            }
            catch(IOException m)
            {
                m.printStackTrace();
            }
        }
        //System.out.print("\n The two inputs successfully merged into the thrid.");

        try
        {
            result.close();
        }
        catch(IOException n)
        {
            n.printStackTrace();
        }
    }

    public static String[] compare(String[] first, String[] second)
    {
        int lenA = first.length;
        int lenB = second.length;
        int startA = 0;
        int startB = 0;
        int start = 0;

        String[] combined  = new String[lenA + lenB];

        while(startA < lenA && startB <lenB)
        {
            //check if current element in first array is smaller than the first in the second array.
            // if so, print to third array.




            //if I use the .compareTo() where and how??
            if(first[startA].compareTo(second[startB]) < 0) //It doesn't like the < operator..... how else could I do this?
            {
                combined[start] = first[startA]; //the index of the third should be equal to the same index in the first.
                                                    // or would the start++s go in the indecies??
                start++;
                startA++;

            }
            else if(first[startA].compareTo(second[startB]) > 0)
            {
                combined[start] = second[startB];
                start++;
                startB++;
            }
            else
            {
                combined[start] = first[startA];
                start++;
                combined[start] = second[startB];

                startA++;
                startB++;
                start++;
            }

            System.out.println("--------------------");
            System.out.println("alpha1: " + Arrays.toString(first));
            System.out.println("alpha2: " + Arrays.toString(second));
            System.out.println("newalpha: " + Arrays.toString(combined));
        }
        while(startA < lenA)
        {
            combined[start++] = first[startA];
            startA++;
        }
        while(startB < lenB)
        {
            combined[start++] = second[startB++];
            startB++;
        }

        return combined;
    }

    public static void writefile(String[] toPrint)
    {
        try
        {
            FileWriter fw = new FileWriter("C:\\Users\\Nicole\\IdeaProjects\\hw6prob2\\newalpha.txt");
            BufferedWriter br = new BufferedWriter(fw);

//            PrintWriter out = new PrintWriter(br);
//
            for (int index = 0; index < toPrint.length; index++)
            {
                if(toPrint[index] != null)
                {
                    br.write(toPrint[index] + " ");
                }
            }
 //           out.close();
            br.close();
  //          fw.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
