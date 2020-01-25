import java.util.Scanner;
import java.lang.String;
import java.util.Stack;
import java.io.File;
import java.io.FileNotFoundException;

class InfixToPostfix
{
    public static String InfixToPostfix(File file)
    {
        //create new string variable to store input file contents
        //outside of try/catch to stay in scope for lower prompts
        String expression = "";

        //Put try/catch block to catch FileNotFound exception
        try
        {
            //created a new File object

            //create a new Scanner
            Scanner read = new Scanner(file);

            //scans file and puts into string to convert.
            while(read.hasNext())
            {
                //.next() will not allow for spaces in the input file, and still copy the expression
                //if there are spaces in the input file, will need to create a case in conversion of how to handle.
                //.nextLine() will read as it is, but won't extract the spaces.
                expression = read.next();
            }
        }
        catch(FileNotFoundException error)
        {
            //will print ONLY if the file is not found. Will print in RED
            System.err.println("Did not find file");
        }
        //handles deleting all of the spaces but it doesn't quite work. Not sure why
        //expression.replaceAll(" ","");

        return expression;
    }


    public static int Prec(char curr)
    {
        //deals with the weight of each opperand
        switch (curr)
        {
            //heavy
            case '+':
            case '-':
                return 1;

            //light
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }


    public static String convert(String expression)
    {

        //initializing empty String for result
        String result = new String ("");

        //initializing empty stack
        Stack<Character> stack = new Stack<>();

        for (int index = 0; index<expression.length(); index++)
        {
            char inReview = expression.charAt(index); // what the character is at the specific point.

            //if the scanned character is an operand, add it to output.
            if (Character.isLetterOrDigit(inReview))
                result += inReview;

                //if the scanned character is an '(', push it to the stack.
            else if (inReview == '(')
                stack.push(inReview);

                //if the scanned character is an ')', pop and output from the stack until an '(' is encountered.
            else if (inReview == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();

                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression"; // invalid expression
                else
                    stack.pop();
            }

            //if an operator is encountered
            else
            {
                while (!stack.isEmpty() && Prec(inReview) <= Prec(stack.peek()))
                    result += stack.pop();
                stack.push(inReview);
            }

        }

        //pop all the operators from the stack
        while (!stack.isEmpty())
            result += stack.pop();

        return result;
    }

}

