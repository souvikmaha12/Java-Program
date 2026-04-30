package Qualifier;
import java.util.*;
public class Duplicate {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int i,j;
	System.out.println("Enter number of elements");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter elements");
	for(i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	for(i=0;i<n;i++) {
		for(j=i+1;j<n;j++) {
			if(a[i]==a[j]) {
				System.out.println(a[i]);
			}
		}
	}
}
}
