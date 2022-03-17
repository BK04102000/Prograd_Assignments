/*
 * ArithmeticException
 * InvalidOperatorException
 * ArrayLengthException
 * NumberFormatException
 */
import java.util.*;
class InvalidOperatorException extends Exception{
	public InvalidOperatorException(String args){
		System.out.println("Invalid Operator");
	}
}
class ArrayLengthException extends Exception{
	public ArrayLengthException(int args){
		System.out.println("Invalid array length");
	}
}
public class Homework1 {
	public static void main(String[] args){
		String a[] = new String[3];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input: ");
		String[] s = sc.nextLine().split(" ");
		System.out.println(Arrays.toString(s));
		if (s.length !=3)
			try {
				throw new ArrayLengthException(0);
			}
		catch(ArrayLengthException ale) {
			System.out.println(ale + " Enter 3 space separated inputs.");
			System.exit(0);
		}
		for(int i=0;i<a.length;i++) {
		a[i] = s[i];
		}
		int b = 0;
		int c = 0;
		try {
			b = Integer.parseInt(a[0]);
			c = Integer.parseInt(a[2]);}
		catch(NumberFormatException n) {
			System.out.println("NumberFormatException: Invalid operand");
			System.out.print("Enter the input in correct format.");
			System.exit(0);
		}
		String operator = a[1];
		switch(operator){
		case("+"):
		{
			System.out.println(b + c);
			break;
		}
		case("-"):
		{
			System.out.println(b-c);
			break;
		}
		case("*"):
		{
			System.out.println(b*c);
			break;
		}
		case("/"):
		{
			try{System.out.println(b/c);}
			catch(ArithmeticException are) {
				System.out.println("ArithmeticException: Do not divide by zero.");
				System.exit(0);
			}
			break;
		}
		default:
		try
		{
			throw new InvalidOperatorException(" ");
		}
		catch(InvalidOperatorException e) {
			System.out.println(e + " Enter the appropriate operator");
		}
		}
	}
}



