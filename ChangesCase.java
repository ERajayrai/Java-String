package StringBufferDemo;

import java.util.Scanner;

public class ChangesCase {
	public static void main(String [] argu) {
		Scanner nc=new Scanner(System.in);
		System.out.println("enter thr String");
		String str1=nc.nextLine();
		StringBuffer newStr=new StringBuffer(str1);
	        
         
	        for(int i = 0; i < str1.length(); i++) {    
	                    
	            if(Character.isLowerCase(str1.charAt(i))) {       
	                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
	            }        
	            else if(Character.isUpperCase(str1.charAt(i))) {        
	                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
	            }    
	        }    
	        System.out.println("String after case conversion : " + newStr);
	        nc.close();

	}
	
}
