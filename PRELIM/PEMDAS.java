import java.util.Scanner;

public class PEMDAS {

    public static void main(String[] args) {

    	double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");


        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();
        
               System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)414
        {
            case '+':
            output = num1 + num2;
            break;

            case '-':
            output = num1 - num2;
            break;
           
            case '*':
            output = num1 * num2;
            break;
            
            case '/':
            output = num1 / num2;
            break;
            
            default:
            System.out.printf("You Entered Wrong Operator");
            return;
            }
            System.out.println(num1+" "+operator+" "+num2+" "+output);
            }
            }            