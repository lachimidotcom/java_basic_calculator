import java.util.Scanner;

public class CalculatorUsingIfElse {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the first number: ");
double num1 = scanner.nextDouble();

System.out.println("Enter the second number: ");
double num2 = scanner.nextDouble();

System.out.println("Chose a Math operation +  -  *  / ");
char operator = scanner.next().charAt(0);

double result = 0.0;

if(operator == '+'){
result = num1 + num2;
}else if(operator == '-'){
result = num1 - num2;
}else if(operator == '*'){
result = num1 * num2;
}else if(operator == '/'){
result = num1 / num2;
}

System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
}
}