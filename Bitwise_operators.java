
import java.util.Scanner;

public class Bitwise_operators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Value 1: "+a);
		
		System.out.println("Enter second number:");
		int b = sc.nextInt();
		System.out.println("Value 2: "+b);
		
		int c=0;
		c=a&b;
		System.out.println("a&b=" +c);
		c=a|b;
		System.out.println("a|b=" +c);
		c=a^b;
		System.out.println("a^b=" +c);
		c=~a;
		System.out.println("~a=" +c);
		c=a<<2;
		System.out.println("a<<2=" +c);
		c=a>>2;
		System.out.println("a>>2=" +c);
		
	}

}
