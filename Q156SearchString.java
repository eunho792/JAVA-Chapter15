import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열s1:"); String s1 = sc.next();
		System.out.print("문자열s2:"); String s2 = sc.next();
		
		int idx = s1.indexOf(s2);
		if (idx ==-1)
				System.out.println("s1안에 s2가 포함돼 있지않습니다");
		else {
			System.out.println(s1);
			for(int i =0; i<idx; i++)
			System.out.print(' ');
			System.out.println(s2);
		
		
		
		}
	}
}
