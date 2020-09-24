import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.print("문자열");	
	String s = sc.next();
	for(int i = 0; i<s.length(); i++)
	  System.out.printf("s[%d] = %c %d\n",i,s.charAt(i),(int)s.charAt(i));
		
	}
}
