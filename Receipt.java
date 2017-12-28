import java.util.Scanner;

public class Receipt {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int given;
		int total;
		int tax;
		int leave;

		System.out.print("Enter the given money: ");
		given = input.nextInt();

		System.out.print("Enter the price of product: ");
		total = input.nextInt();

		leave = given - total;
		tax = total / 10;

		System.out.println("Tax: " + tax);
		System.out.println("Leave: " + leave);
	}
}