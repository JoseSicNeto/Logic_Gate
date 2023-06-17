package algebra;

import java.util.Scanner;

public class Linear {

	public static void main(String[] args) {
		
		/*Scalar Product   -> (x,x,x)*(y,y,y) = n. --- SP
		  Vector Modulus   -> sqrt(x+x+x)^2 = n.   --- VM */
		
		Scanner type_it = new Scanner(System.in);

		System.out.print("Indicate the Dimensions of the Vectors: "); 
		int Dimension = type_it.nextInt();		//Dimension = (x1, x2, ... , xN) Simple.
		
		int[] vector1 = new int[Dimension];			
												//Asks to Enter Values.		
		for (int i = 0; i < Dimension; i++) {
			System.out.print("Enter the Values " + (i+1) + " of the First Vector: "); vector1[i] = type_it.nextInt();
		}		
		
		//================================================Separation===============================================\\
		
		int [] vector2 = new int[Dimension];
												//Asks to Enter Values.
		for (int i = 0; i < Dimension; i++) {
			System.out.print("Enter the Values " + (i+1) + " of the Second Vector: "); vector2[i] = type_it.nextInt();	
		}
		
		type_it.close();
		
		int result_scalar = 0;
		
		//Calculate the Scalar Product.
		for (int i = 0; i < Dimension; i++) {
			result_scalar = result_scalar + vector1[i] * vector2[i];	//It could also be: r_scalar += v1[i] * v2[i];
		}
		int Scalar_Product = result_scalar;

		//================================================Separation===============================================\\
		
		int vector1_modulus = 0;	int vector2_modulus = 0;
		
		//Calculate the Vector Modulus.
		for (int i = 0; i < Dimension; i++) {
			vector1_modulus = vector1_modulus + vector1[i] * vector1[i];
			vector2_modulus = vector2_modulus + vector2[i] * vector2[i];
		}
		Double Modulus1 = Math.sqrt(vector1_modulus);	Double Modulus2 = Math.sqrt(vector2_modulus);
		
		System.out.println();		//Skip a Line;
		
		System.out.println("Result of Scalar Product: " + Scalar_Product);		
		System.out.println("Result of Vector 1 Modulus: " + Modulus1 + " and Vector 2 Modulus " + Modulus2);

		
	}
}