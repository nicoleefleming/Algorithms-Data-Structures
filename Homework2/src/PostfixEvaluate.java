import java.util.Scanner;
//import java.lang.String[];
import java.lang.String;
import java.util.Stack;

class PostfixEvaluate extends InfixToPostfix{

//    public void PostfixEvaluate(String expression)
//    {
//        InfixToPostfix(expression);
//    }


    // Method to evaluate value of a postfix expression
    static int evaluatePostfix(String expression)
    {
        //create a stack
        Stack<Integer> stack=new Stack<>();

        // Scan all characters one by one
        for(int index=0;index<expression.length(); index++)
        {
            char curr =expression.charAt(index);

            // If the scanned character is an operand (number here),
            // push it to the stack.
            if(Character.isDigit(curr))
                stack.push(curr - '0');

                //  If the scanned character is an operator, pop two
                // elements from stack apply the operator
            else
            {
                int value1 = stack.pop();
                int value2 = stack.pop();

                switch(curr)
                {
                    case '+':
                        stack.push(value2+value1);
                        break;

                    case '-':
                        stack.push(value2- value1);
                        break;

                    case '/':
                        stack.push(value2/value1);
                        break;

                    case '*':
                        stack.push(value2*value1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
