package control;

public class Continue {
	public static void main(String[] args) {
		int []n= {1,2,3,4,5};
		for(int i:n) {
		if(i==3) {
			continue;
		}
		System.out.println(i);
	}

}}
