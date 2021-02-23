import java.util.Arrays;
import java.util.Scanner;

public class TwoStringIsAnagram {
	public static void main(String [] arg) {
		Scanner q=new Scanner(System.in);
		System.out.println("enter the first string");
		String s=q.next();
		System.out.println("enter the second string");
		String t=q.next();
		s=s.toLowerCase();
		t=t.toLowerCase();
		if(s.length()!=t.length()) {
			System.out.println("first String is not equal to second String");
		}
		else {
			char[] string1=s.toCharArray();
			char[] string2=t.toCharArray();
			Arrays.sort(string1);  
            Arrays.sort(string2);
            if(Arrays.equals(string1, string2)==true) {
            	System.out.println("Both String are equal");
            }
            else {
            	System.out.println("Both are not anagram");
            }
		}
		q.close();
	}

}
