package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("What number do you want to see if it is prime?");

		int num = Integer.parseInt(answer);

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				System.out.println("Your number is not prime.");
				System.exit(0);
			}

		}
		System.out.println("You number is prime.");
	}
}
