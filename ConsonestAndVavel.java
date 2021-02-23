package StringBufferDemo;

public class ConsonestAndVavel {
	public static void main(String [] argu) {
		
		int vcount=0, cCount=0;
		String s="ajay out of bound";
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				vcount++;
				
			}
			else if(s.charAt(i) >= 'a' && s.charAt(i)<='z') {
				cCount++;
			}
			
		}
		System.out.println("vowel is    "+vcount);
		System.out.println("consonent is    "+cCount);
	}

}
