import java.util.Scanner;

public class Sphere {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double radius;
		double volume;

		System.out.print("Enter the radius: ");
		radius = input.nextDouble();

		volume = radius * radius * radius * 4 / 3;
		System.out.println("Volume of sphere: " + volume);
	}
}