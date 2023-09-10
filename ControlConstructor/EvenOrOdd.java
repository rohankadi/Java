//Given number is Even or Odd
package ControlConstructor;
import java.util.Scanner;
public class EvenOrOdd {
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Entered num is EVEN");
		}else {
			System.out.println("Entered num is ODD");
		}

		scan.close();
		 
	}
}
