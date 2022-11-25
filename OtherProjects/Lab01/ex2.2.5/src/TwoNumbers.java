import java.util.Scanner;

public class TwoNumbers {
	public static void main(String[] args) {
		double a, b;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = input.nextDouble();
		System.out.println("Enter b: ");
		b = input.nextDouble();
		
		
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	}
}