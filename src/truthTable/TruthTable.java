package truthTable;

import java.util.Scanner;

public class TruthTable {
	public static void main(String [] args) {
		byte vertAxis;
		byte horizAxis;
		Scanner scan=new Scanner(System.in);
		
		//reading input
		System.out.println("Enter first number:");
		vertAxis=scan.nextByte();
		System.out.println("Enter the second number:");
		horizAxis=scan.nextByte();
		
		//bitwise and, then logical
		int bitAnd= (vertAxis&horizAxis);
		boolean logB= (vertAxis !=0 && horizAxis !=0);
		int logAnd=0;
		if(logB) {
			logAnd=1;
		}
		
		System.out.print(bitAnd+" "+logAnd);
		
	}
}
