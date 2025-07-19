package myfirst;

import java.util.Scanner;

public class Finding_even_odd_null {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.print("enter a number");
int number=scanner.nextInt();
if(number>0) {
	System.out.println("positive number");
}else if(number<0) {
	System.out.println("negative number");
}else {
	System.out.println("zero number");
}
scanner.close();
	}

}
