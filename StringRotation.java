package StringBufferDemo;

import java.util.Scanner;

public class StringRotation {
	public static void main(String[] argu) {
		Scanner nc=new Scanner(System.in);
		System.out.println("enter the first String");
		String string1=nc.nextLine();
		System.out.println("enter the second string");
		String string2=nc.nextLine();
		if(string1.length()!=string2.length()) {
			System.out.println("string first not equal string to second");
		}
		else
			string1=string1.concat(string1);
		if(string1.indexOf(string2)!=-1) {
			System.out.println("second string is rotation of fist string");
		}
		else
			System.out.println("first string is rotation of second string");
		nc.close();
	}

}
