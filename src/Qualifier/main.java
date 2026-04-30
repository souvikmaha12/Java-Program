package Qualifier;
import java.util.*;
public class main {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int id=sc.nextInt();
	sc.nextLine();
	String n=sc.nextLine();
	double s=sc.nextDouble();
	sc.nextLine();
	String dept=sc.nextLine();
	Manager ob=new Manager(id,n,s,dept);
	ob.display();
}
}
