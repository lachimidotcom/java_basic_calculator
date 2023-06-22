import java.util.Scanner;

public class CalculatorUsingSwitch{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the first number: ");
double num1 = scanner.nextDouble();

System.out.println("Enter the second number: ");
double num2 = scanner.nextDouble();

System.out.println("Chose a Math operation +  -  *  / ");
char operator = scanner.next().charAt(0);

double result = 0.0;

switch(operator){

case '+':
result = num1 + num2;
break;

case '-':
result = num1 - num2;
break;

case '*':
result = num1 * num2;
break;

case '/':
if(num2 != 0){
result = num1 / num2;}
else{
System.out.println("Error: Division by zero is not allowed");
return;
}
break;

default:
System.out.println("Error: Invalida operator");
return;
}

System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
}
}

//Time Complexity: O(1)

//Auxiliary Space: O(1)
