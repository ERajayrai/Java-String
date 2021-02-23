package StringBufferDemo;

import java.util.Scanner;

public class DublicateString {
	public static void main(String[] argu) {
		Scanner n=new Scanner(System.in);
		System.out.println("enter the string");
		String str=n.nextLine();
		  int count;    
       
	        char s[] = str.toCharArray();    
	            
	        System.out.println("Duplicate characters in a given string: ");    
	            
	        for(int i = 0; i <s.length; i++) {    
	            count = 1;    
	            for(int j = i+1; j <s.length; j++) {    
	                if(s[i] == s[j] && s[i] != ' ') {    
	                    count++;    
	                      
	                    s[j] = '0';    
	                }    
	            }    
	                
	            if(count > 1 && s[i] != '0')    
	                System.out.println(s[i]);    
	        }
		n.close();
	}
}
