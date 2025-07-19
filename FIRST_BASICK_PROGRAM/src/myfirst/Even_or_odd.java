package myfirst;

import java.util.Scanner;

public class Even_or_odd {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
System.out.print("enter a number:");
int number=scanner.nextInt();
if(number%2==0) {
	System.out.println("even number");
}else {
	System.out.println("odd number");
}
scanner.close();
	}

}
