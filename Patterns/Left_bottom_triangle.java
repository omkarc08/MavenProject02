package Patterns;

public class Left_bottom_triangle {
	
	void Triangle(int num) {
		for(int i =1; i<=num;i++){
			for(int j=num;j>=i;j--){
				System.out.print("*");
			}
		System.out.println();
		}
	}

	public static void main(String[] args) {
	Left_bottom_triangle obj = new Left_bottom_triangle();
	obj.Triangle(5);
	}

}

