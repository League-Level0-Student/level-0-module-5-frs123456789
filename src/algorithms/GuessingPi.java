package algorithms;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GuessingPi {
	// 1. Make a main method and make sure your program can run
	public static void main(String[] args) {

		// 2. Make a String variable to hold the value of Pi.
		// Get the first few digits from http://www.piday.org/million/.
		String pie = "3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862803482534211706798214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196442881097566593344612847564823378678316527120190914564856692346034861045432664821339360726024914127372458700660631558817488152092096282925409171536436789259036001133053054882046652138414695194151160943305727036575959195309218611738193261179310511854807446237996274956735188575272489122793818301194912983367336244065664308602139494639522473719070217986094370277053921717629317675238467481846766940513200056812714526356082778577134275778960917363717872146844090122495343014654958537105079227968925892354201995611212902196086403441815981362977477130996051870721134999999837297804995105973173281609631859502445945534690830264252230825334468503526193118817101000313783875288658753320838142061717766914730359825349042875546873115956286388235378759375195778185778053217122680661300192787661119590921642019893809525720106548586327886593615338182796823030195203530185296899577362259941389124972177528";
		// 3. Print out the first 3 digits of Pi to the console.
		System.out.println(pie);
		// The first value is "pi.charAt(0)", the second is "pi.charAt(1)", etc.
		// Run your program to see how this works.

		// 9. If you want to give the user more than one chance to guess,
		// put a for loop around steps 4-8.

		// 4. Create a for loop that will step through each digit of pi (steps 5-8)
		// NOTE: The number of digits in your string will be
		// yourStringVariable.length()
		for (int i = 0; i < 100; i++) {
			// 5. Ask the user for the NEXT digit of pi.
			String pieanswer = JOptionPane.showInputDialog("What is the next digit of pi?");
			// 6. Compare the user's input to the next digit of your pi variable
			// (look at step 3 for a clue).
			// HINT: use charAt(0) to get 1st char of user input String
			if (pieanswer.equals(pie.charAt(i)+"")) {
				// 7. If they are correct, print out "correct".
				JOptionPane.showMessageDialog(null, "Correct!");
			} else {
				JOptionPane.showMessageDialog(null, "Y'all are dumb!");
				break;
			}
			// 8. If they are not, print out "incorrect" and tell them
			// to start over. Use 'break;' to break out of the loop.
		}
	}
}
