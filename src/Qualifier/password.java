package Qualifier;
import java.util.*;

import javax.management.InvalidAttributeValueException;

import java.io.*;
public class password {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	try {
		String pass=sc.nextLine();
		boolean v=false;
		boolean iv=false;
		for(int i=0;i<pass.length();i++) {
			char ch=pass.charAt(i);
			if(Character.isUpperCase(ch)) {
				v=true;
			}
			if(Character.isDigit(ch)) {
				iv=true;
			}
		}
			if(pass.length()>=8 && v && iv) {
				System.out.println("Valid password");
		}else {
			System.out.println("Invalid ");
		}
	}catch(Exception e ) {
		System.out.println("InValid password");
	}
}
}
