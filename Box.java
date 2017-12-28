import java.util.Scanner;

public class Box {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		double w;
		double h;
		double perimeter;
		double area;

		System.out.print("Enter the width: ");
		w = input.nextDouble();

		System.out.print("Enter the height: ");
		h = input.nextDouble();

		perimeter = 2 * (w + h);
		area = w * h;

		System.out.println("perimeter: " + perimeter);
		System.out.println("area: " + area);
	}
}