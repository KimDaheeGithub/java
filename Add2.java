import java.util.Scanner;

public class Add2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int x;
		int y;
		int sum;

		System.out.print("Enter the first number: ");
		x = input.nextInt();

		System.out.print("Enter the secomd number: ");
		y = input.nextInt();

		sum = x + y;

		System.out.println(sum);
	}
}