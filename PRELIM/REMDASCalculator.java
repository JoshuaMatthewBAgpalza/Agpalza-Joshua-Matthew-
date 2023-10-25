import java.util.*;

public class REMDASCalculator
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an equation: ");
        String equation = scanner.nextLine();

        try 
        {
            double result = calculateEquation(equation);
            System.out.println("Result: " + result);
        } 
        catch (Exception e) 
        {
            System.out.println("Error: Invalid equation.");
        }
    }

    public static double calculateEquation(String equation) 
    {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < equation.length(); i++) 
        {
            char c = equation.charAt(i);

            if (Character.isDigit(c)) 
            {
                StringBuilder numBuilder = new StringBuilder();
                while (i < equation.length() && (Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.')) 
                {
                    numBuilder.append(equation.charAt(i));
                    i++;
                }
                i--;

                double num = Double.parseDouble(numBuilder.toString());
                numbers.push(num);
            } 
            else if (c == '(') 
            {
                operators.push(c);
            } 
            else if (c == ')') 
            {
                while (!operators.isEmpty() && operators.peek() != '(') 
                {
                    performOperation(numbers, operators);
                }
                operators.pop();            } 
            else if (isOperator(c)) 
            {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(c)) 
                {
                    performOperation(numbers, operators);
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty()) 
        {
            performOperation(numbers, operators);
        }

        return numbers.pop();
    }

    public static boolean isOperator(char c) 
    {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static int precedence(char operator) 
    {
        if (operator == '+' || operator == '-') 
        {
            return 1;
        } else if (operator == '*' || operator == '/') 
        {
            return 2;
        }
        return 0;
    }

    public static void performOperation(Stack<Double> numbers, Stack<Character> operators) 
    {
        char operator = operators.pop();
        double operand2 = numbers.pop();
        double operand1 = numbers.pop();

        double result;
        switch (operator) 
        {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                result = operand1 / operand2;
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
                }
                numbers.push(result);

}
}