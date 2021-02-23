package StringBufferDemo;

import java.util.Scanner;

public class AllSubset {
	public static void main(String [] arg) {
		Scanner n=new Scanner(System.in) ;
		System.out.println("enter String");
		String st=n.next();
		int lant=st.length();
		int temp=0;
		String arr[]=new String[lant*(lant+1)/2];
		for(int i=0;i<lant;i++) {
			for(int j=i;j<lant;j++) {
				arr[temp]=st.substring(i, j+1);
				temp++;
				
			}
		}
		System.out.println("sub sequance of String");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		n.close();
	}

}
