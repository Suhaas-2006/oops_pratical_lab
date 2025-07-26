
import java.util.Scanner;

public class Assignement_operators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a= sc.nextInt();
		System.out.println("Value 1:"+a);
		int var;
	    var = a;
	    System.out.println("var using =: " + var);
	    var += a;
	    System.out.println("var using +=: " + var);	   
	    var *= a;
	    System.out.println("var using *=: " + var);
	}
}
