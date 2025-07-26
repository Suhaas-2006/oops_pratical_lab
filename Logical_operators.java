
import java.util.Scanner;

public class Logical_operators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a= sc.nextInt();
		System.out.println("Value 1:"+a);
		
		System.out.println("Enter second number: ");
		int b= sc.nextInt();
		System.out.println("Value 2:"+b);
		
		System.out.println((5 > 3) && (8 > 5));  
	    System.out.println((5 > 3) && (8 < 5));  
	    System.out.println((5 < 3) || (8 > 5));  
	    System.out.println((5 > 3) || (8 < 5));  
	    System.out.println((5 < 3) || (8 < 5));  
	    System.out.println(!(5 == 3));  
	    System.out.println(!(5 > 3));  

	}
	

}
