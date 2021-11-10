package Patterns;

public class Left_triangle {

	static void Triangle(int num) {
		for(int i =1; i<=num;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
				}
	}
	public static void main(String[] args) {
Left_triangle.Triangle(6);
	}

}
