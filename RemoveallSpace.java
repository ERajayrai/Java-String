package StringBufferDemo;

import java.util.Scanner;

public class RemoveallSpace { 
	public static void main(String [] argu) {
		Scanner n=new Scanner(System.in);
		System.out.println("enter the string with speace");
		String str=n.nextLine();
		str=str.replaceAll("\\s+","");
		System.out.println(str);
		n.close();
	}

}
