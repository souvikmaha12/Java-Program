package Qualifier;
import java.util.*;
public class Anagram {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 strings");
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	char[]ch1=s1.toCharArray();
	char[]ch2=s2.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	System.out.println(Arrays.equals(ch1, ch2));
	
}
}
