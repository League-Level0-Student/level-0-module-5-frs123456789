import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPracticeWS {
public static void main(String[] args) {
	

		SkillPracticeWS skills = new SkillPracticeWS();
		          	skills.skill1();
		          	skills.skill2();
		          	skills.skill3();
		          	skills.skill4();
		          	skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
String dimeanswer = JOptionPane.showInputDialog("How many dimes do you have?");

int dmnsint = Integer.parseInt(dimeanswer);

		// Tell them how many cents they have (hint multiply by 10)

JOptionPane.showMessageDialog(null, "you have " + dmnsint*10 + " cents.");


		// Ask the user how tall they are (inches)

String height = JOptionPane.showInputDialog("How tall are y'all? (in inches)");

int tallness = Integer.parseInt(height);


		// If they are shorter than 36 inches, tell them to eat their Wheaties
if(tallness < 36) {
	JOptionPane.showMessageDialog(null,  "Y'ALL ARE TOO SHORT! EAT Y'ALL'S WHEATIES.");
}

else {
JOptionPane.showMessageDialog(null, "You can ride!");	
}



		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console 

for(int i =0; i <29; i++) {
	
	System.out.println(i%3);
}





		}

		void skill3() { // Get a random number that is less than 20 and print it to the console 
Random gen = new Random();
int num = gen.nextInt(20);

Random gen2 = new Random();
int num2 = gen2.nextInt(10);

int num3 = num - num2;

		// Get another random number that is less than 10 and print it to the console 

JOptionPane.showMessageDialog(null,"The difference between these two random numbers is" + num3 );

		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 



		}

		void skill4() { // In a pop-up, ask the user for the city they live in 
String answer = JOptionPane.showInputDialog("What city do you live in?");


		// If they answered "San Diego", tell them they live in America's Finest City 

if(answer == "San Diego") {
	System.out.println("YAY! You live in America's finest city.");
}

		// Otherwise, tell them to move to San Diego 
else {
	System.out.println("MOVE TO SAN DIEGO!");
}


		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 

int cars = 4;

		// If there is 1 car, use a pop-up to display the make/model of the car 
if(cars == 0) {
	JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
}
else if(cars == 1) {
	JOptionPane.showMessageDialog(null, "Maserati Ghibli?");
}

		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
else {
	JOptionPane.showMessageDialog(null, "14 Wheels. WOW!");
}


		}

		void skill5() { // In a pop-up, ask the user for the name of their school 

String school = JOptionPane.showInputDialog("What is the name of your school?");

		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
JOptionPane.showMessageDialog(null, school + " is a GREAT school!");


		}
		
		}
		
