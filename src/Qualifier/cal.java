package Qualifier;
import java.util.*;
public class cal {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter numbers");
	String ch=sc.nextLine();
	String[]num=ch.split(",");
	int a[]=new int[num.length];
	int sum=0;
	for(int i=0;i<num.length;i++) {
		a[i]=Integer.parseInt(num[i]);
		  
	}
	for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	System.out.println("Sum:"+sum);
}
}