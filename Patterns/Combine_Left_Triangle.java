package Patterns;

public class Combine_Left_Triangle {
	
	static void Triangle(int num) {
		for(int i =1; i<=num;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
		System.out.println();
		}
		
		for(int i =1; i<=num;i++){
			for(int j=num-1;j>=i;j--){
				System.out.print("*");
			}
		System.out.println();
		}
	}

	public static void main(String[] args) {
		Combine_Left_Triangle.Triangle(5);
	}

}
