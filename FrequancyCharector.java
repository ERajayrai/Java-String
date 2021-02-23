package StringBufferDemo;

import java.util.Scanner;

public class FrequancyCharector {
	public static void main(String[] argu) {
		Scanner n=new Scanner(System.in);
		System.out.println("enter the String");
		String str=n.nextLine();
		int freq[]=new int[str.length()];
		int i;
		int j;
		char string[]=str.toCharArray();
		//String convert to character
		for(i=0;i<str.length();i++) {
			freq[i]=1;
			for(j=i+1;j<str.length();j++) {
				if(string[i]==string[j]) {
					freq[i]++;
					string[j]='0';
				}
			}
		}
		System.out.println("Character and thier frequencs");
		for(i=0;i<freq.length;i++) {
			if(string[i] !=','&&string[i]!='0')
				System.out.println(string[i]+"-"+freq[i]);
		}
			
		
	}

}
