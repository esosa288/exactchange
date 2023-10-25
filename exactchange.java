import java.util.Scanner;
public class LabProgram {
	public static void exactChange(int userTotal, int[] coinVals) {
		coinVals[3] = userTotal / 25;
		userTotal %= 25;
		coinVals[2] = userTotal / 10;
		userTotal %= 10;
		coinVals[1] = userTotal / 5;
		userTotal %= 5;
		coinVals[0] = userTotal;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] coinVals = new int[4];
		int totalAmount = sc.nextInt();
		if (totalAmount <= 0) {
			System.out.println("no change");
		} else {
			exactChange(totalAmount, coinVals);
			if (coinVals[0] != 0) System.out.println(coinVals[0] + (coinVals[0] == 1 ? " penny" : " pennies"));
			if (coinVals[1] != 0) System.out.println(coinVals[1] + (coinVals[1] == 1 ? " nickel" : " nickels"));
			if (coinVals[2] != 0) System.out.println(coinVals[2] + (coinVals[2] == 1 ? " dime" : " dimes"));
			if (coinVals[3] != 0) System.out.println(coinVals[3] + (coinVals[3] == 1 ? " quarter" : " quarters"));
		}
	}
}
