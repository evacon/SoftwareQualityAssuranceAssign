//Package declaration - not default package name!
package codingStandardsExamples;

/*
 * @author evaconnolly
 * 
 * A guide for developers with examples of the coding practices and standards that they must adhere to while writing source code
 */

import java.util.*;

//UpperCamelCase class name, shorter than 30 symbols
public class SampleStandards {
	
	public SampleStandards() {
		
	}
	
	public static void main (String[] args) {
		
		System.out.println("What is your name?");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		
		//opening curly bracket on same line, closing curly bracket is on its own line
		if(name.equalsIgnoreCase("eva")) {
			System.out.println("You should already know these standards, you wrote them");
		}
		else {
			System.out.println("Hello "+ name);
		}
		
		secondSemesterModules();
		
		System.out.println("\nDo you remember what modules were year long? (y/n)");
		String usersReply = scanner.nextLine();
		
		//proper use of default in switch statement
		switch (usersReply) {
		case "y":
			System.out.println("Good.");
			break;
		case "n":
			System.out.println("You should probably find out.");
			break;
		default:
			System.out.println("Invalid choice.");
			break;
		}
		
		SecondSampleStandards samp = new SecondSampleStandards();
		samp.fyp();
		samp.exams();
		scanner.close();
	}

	//lowerCamelCase method name
	private static void secondSemesterModules() {
		
		System.out.println("\nAbout to print semester 2 modules from arraylist using a for loop..");
		
		ArrayList<String> modules = new ArrayList<String>();
		modules.add("\nSoftware Quality Assurance");
		modules.add("Software Development");
		modules.add("Strategic Information Systems");
		modules.add("Strategic Management");
		
		//acceptable use of single character variables
		for(int i=0; i<modules.size(); i++) {
			System.out.println(modules.get(i));
		}
	}
	
	//Interface using UpperCamelCase
	public interface CollegeStuff{
		public void exams();
		public void fyp();
	}
}
