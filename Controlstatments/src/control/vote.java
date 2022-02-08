package control;

import java.util.Scanner;

public class vote {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
	    int a=s.nextInt();
	    if(a>18) {
	    	System.out.println("Eleigible for vote");}
	    	else {
	    		System.out.println("Not eleigble for vote");
	    	}
	    
	}

}
