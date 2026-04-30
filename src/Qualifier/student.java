package Qualifier;
import java.util.*;
import java.io.*;
public class student {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	HashMap<String,Integer>map=new HashMap<String,Integer>();
	List<String>names=new ArrayList<String>();
	System.out.println("Enter number of students");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		String name=sc.next();
		int marks=sc.nextInt();
		map.put(name, marks);
	}
	for(Map.Entry<String,Integer>entry:map.entrySet()) {
		System.out.println(entry);
	}
	System.out.println("Highest score with name");
	String topper="";
	int max=0;
	for(Map.Entry<String,Integer>data:map.entrySet()) {
		if(data.getValue()>max) {
			max=data.getValue();
			topper=data.getKey();
		}
	}
		System.out.println("Topper:"+topper+" "+"Marks:"+max);
		for(Map.Entry<String,Integer>data:map.entrySet()) {
			names.add(data.getKey());
		}
		Collections.sort(names);
		for(String p:names) {
			System.out.println(p);
		}
	}
}
