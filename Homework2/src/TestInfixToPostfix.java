import java.io.File;


public class TestInfixToPostfix extends PostfixEvaluate {

    public static void main(String[] args)
    {
        //created a new File object
        File file = new File("input.txt");

        //create string to hold string from the file
        String expression = InfixToPostfix(file);

        //debugg line to check the right file was received
        //System.out.println("The original expression is: "+ expression);

        //send input into convert function
        String convert = convert(expression);

        //prints out the converted expression
        System.out.println("The postfix expression is: "+convert);

        //send result of conversion into evaluate
        int results = evaluatePostfix(convert);

        //print result
        System.out.println("The result is: " + results);
    }

}
