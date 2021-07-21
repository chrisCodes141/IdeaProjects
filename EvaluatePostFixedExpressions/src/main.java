import java.util.Stack;

class Test
{
    // A utility function to return precedence of a given operator 
    // Higher returned value means higher precedence 
    static int Prec(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    // The main method that converts given infix expression 
    // to postfix expression.  
    static String infixToPostfix(String exp)
    {
        // initializing empty String for result 
        String result = new String("");

        // initializing empty stack 
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);

            // If the scanned character is an operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;

                // If the scanned character is an '(', push it to the stack.
            else if (c == '(')
                stack.push(c);

                //  If the scanned character is an ')', pop and output from the stack
                // until an '(' is encountered.
            else if (c == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();

                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression"; // invalid expression                 
                else
                    stack.pop();
            }
            else // an operator is encountered 
            {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){
                    if(stack.peek() == '(')
                        return "Invalid Expression";
                    result += stack.pop();
                }
                stack.push(c);
            }

        }

        // pop all the operators from the stack 
        while (!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }
        return result;
    }

    // Driver method  
    public static void main(String[] args)
    {
        String exp = "1+2-3*4";
        String exp2 = "1+2-3*4/5";
        String exp3 = "3*(6+9)-2";

        System.out.println(infixToPostfix(exp3));
        char c = '1';
        //System.out.println(isOperand(c));
        //System.out.println(EvaluateSingleDigitPostfixExp(infixToPostfix(exp)));
        System.out.println(EvaluateSingleDigitPostfixExp(infixToPostfix(exp2)));
    }

    //first not gona assume only single digit

    public static int EvaluateSingleDigitPostfixExp(String Pfe){
        int Result = 0;
        int a, b;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < Pfe.length(); i++){

            if(Character.isDigit(Pfe.charAt(i))){     // if(isDigit(Pfe.charAt(i))){ <<<<<<<<<<<<<<<,had
                System.out.println("IN IF, OPERAND: " + Pfe.charAt(i));
                stack.push(((int)Pfe.charAt(i))-48);
                System.out.println("stack = " + stack +"\n");
            }
            else{
                System.out.println("IN ELSE, Operator is = "+Pfe.charAt(i));
                b = stack.pop();
                System.out.println("b = "+b);
                a = stack.pop();
                System.out.println("a = "+a);
                stack.push(Evaluate(Pfe.charAt(i), a, b));
                System.out.println("stack = " + stack +"\n");
            }
        }
        return stack.pop();
    }
    // Tried making my own is Digit <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< ask hhashim

    public static boolean isDigit(char c){

        return ('0' <= (int) c && (int) c <= '9'); //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<,issue??????????????
    }

    /*public static boolean isOperand(char c){

        return (!('a' <= c && c <= 'z') ||
                !('A' <= c && c <= 'Z'));
    }*/

    public static int Evaluate(char c, int a, int b){
        int ans;

        if (c == '^'){
            ans = a;
            while (b != 1){
                ans *= a;
                b--;
            }
        }
        else if (c == '*'){
            ans = a*b;
        }
        else if (c == '/'){
            ans = a/b;
        }
        else if (c == '+'){
            ans = a+b;
        }
        else if (c == '-'){
            ans = a-b;
        }
        else{
            ans = -1;
        }

        return ans;
    }
} 