package Patterns;

public class Right_Triangle {

	static void Triangle(int num) {
		for(int i=1; i<=num;i++) {	
			for(int j=num-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(k+" ");
			}
		System.out.println();
		}
	}
	
	public static void main(String[] args) {
Right_Triangle.Triangle(5);
	}

}
