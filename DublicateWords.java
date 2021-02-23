package StringBufferDemo;

import java.util.Scanner;

public class DublicateWords {
	public static void main(String[] argu) {
		Scanner n=new Scanner(System.in);
		System.out.println("enter words");
		String str=n.nextLine();
		int count;
		str=str.toLowerCase();
		String w[]=str.split("");
		System.out.println("Dublicate element is");
		for(int i=0;i<w.length;i++) {
			count=1;
			for(int j=i+1;j<w.length;j++) {
				if(w[i].equals(w[j])) {
					count++;
					w[j]="0";
				}
			}
			if(count>1&&w[i]!="0")
				System.out.println(w[i]);
		}
		n.close();
	} 

}
