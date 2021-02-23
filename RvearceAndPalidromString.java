import java.util.Scanner;

public class RvearceAndPalidromString {
	public static void main(String [] arg) {
	Scanner n=new Scanner(System.in);
	System.out.println("enter string");
	String st=n.nextLine();
	int lenth=st.length();
	String	rev="";
	for(int i=lenth-1;i>=0;i--) {
		rev=rev+st.charAt(i);
	}
	System.out.println("revese of   "+st+"  is  "+rev);
	
	
	
	if(st.equals(rev)) {
		System.out.println("String is palidrom String");
	}
	else
		System.out.println("this is not palidrom String");
	
	
	n.close();
	}
}
