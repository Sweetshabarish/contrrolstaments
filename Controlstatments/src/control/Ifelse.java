package control;

import java.util.Scanner;

public class Ifelse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String p="";
		int month=s.nextInt();
		if(month==12||month==1||month==2)
			p="winter";
		else if(month==3||month==4||month==5)
			p="Spring";
		else if(month==6||month==7||month==8)
			p="Spring";
		else if(month==9||month==10||month==11)
			p="Autumn";
		else
			p="mental";
		System.out.println(p);
	}

}
