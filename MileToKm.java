import java.util.Scanner;

public class MileToKm {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int mile;
		double km;

		System.out.print("Enter the Mile: ");
		mile = input.nextInt();

		km = 1.609 * mile;

		System.out.println(mile + "mile is " + km + "km.");
	}
}