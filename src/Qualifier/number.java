package Qualifier;
import java.util.*;
public class number {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n,i,j;
	System.out.println("Enter number of elements");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter elements");
	for( i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	for(i=0;i<n;i++ ) {
		for(j=i+1;j<n;j++) {
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("Sorted array");
	for(i=0;i<n;i++) {
		System.out.println(a[i]);
	}
	System.out.println("Palindrome");
	for(i=0;i<n;i++) {
		int rev=a[i];
		int sum=0;
		while(rev>0) {
			sum=sum*10+(rev%10);
			rev=rev/10;
		}
		if(sum==a[i]) {
			System.out.println(a[i]);
		}
	}
		
	}
}

