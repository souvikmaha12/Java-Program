package Qualifier;
import java.util.*;
public class WordCount {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter sentence");
	String input=sc.nextLine();
	String[]parts=input.split(":");
	System.out.println("Words count:"+parts.length);
}
}
