package StringBufferDemo;

import java.util.Scanner;

public class ReaplaceSpeace {
	public static void main(String [] argu){
		Scanner ns=new Scanner(System.in);
		System.out.println("enter the String with Spaces");
		String s=ns.nextLine();
		char ch='-';
		s= s.replace(' ', ch);
		System.out.println(s);
		ns.close();
		
	}

}
