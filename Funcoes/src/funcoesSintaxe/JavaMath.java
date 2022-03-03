package funcoesSintaxe;

import java.util.Scanner;

public class JavaMath {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter with three numbers ");
		System.out.println();
		System.out.println(" - Enter with number one: ");
		int a = sc.nextInt();
		System.out.println(" - Enter with number two: ");
		int b = sc.nextInt();
		System.out.println(" - Enter with number three: ");
		int c = sc.nextInt();
//		
//		if (a > b && a > c) {
//			System.out.println("Number higher is = " + a);
//		}else if (b > c) {
//			System.out.println("Number higher is = " + b);
//		}else {
//			System.out.println("Number higher is = " + c);
//		}
		
		int higher = max(a, b, c);
		
		showResult(higher);
				
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}else if (y > z) {
			aux = y;
		}else{
			aux = z;
		}
		return aux;
		
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
