import java.util.Scanner;


public class Conversations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//variables
		String name;
		String noun;
		String verb;
		int int1 = 1;
		double double1;
		//variables end
		
		
		System.out.print("Type your name and press Enter: ");
		name = input.nextLine();
		
		System.out.print("Type a noun and press Enter: ");
		noun = input.nextLine();
		
		System.out.print("Type a verb and press Enter: ");
		verb = input.nextLine();
		
		//
		
		System.out.print("Type a number and press Enter: ");
		if ( input.hasNextInt());
		{
			int1 = input.nextInt();
		}
		input.nextLine();
		
		//
		
		System.out.print("Type a decimal number and press Enter: ");
		if ( input.hasNextDouble());
		{
			double1 = input.nextDouble();
		}
		input.nextLine();
		
		//
		
		String story = "One day, " + name + " picked up a " + noun;
		story += " and decided to " + verb + " it.\n";
		story += "After getting arrested, spending " + int1;
		story += " days in jail, and paying a $" + double1 + " fine,\n";
		story += name + " decided that was a bad idea!";
		
		//
		
		System.out.print(story);
	}

}
