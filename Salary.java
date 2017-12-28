import java.util.Scanner;

public class Salary {
	public static void main(String args[]) {
		int salary;
		int deposit;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the salary: ");
		salary = input.nextInt();

		deposit = 10 * 12 * salary;
		System.out.printf("deposit of 10 years: %d\n", deposit);
	}
}