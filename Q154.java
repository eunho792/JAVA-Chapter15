import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열");
		String s = sc.next();
		
		System.out.print("반대로 읽으면");
		for (int i = s.length() - 1; i>=0; i--)
			System.out.println(s.charAt(i));
		System.out.println("입니다");
	}
}
