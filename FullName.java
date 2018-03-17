import java.io.*;
import java.util.*;
public class FullName {
	public static void main(String args[]) {
		Scanner kbReader = new Scanner(System.in);
		System.out.print("What is your first name? ");
		String firstName = kbReader.next(); //gives keyboard input to firstName
		System.out.print("What is your last name? ");
		String lastName = kbReader.next(); //gives keyboard input to lastName
		String fullName = firstName + " " + lastName; //concatenates firstName and lastName
		System.out.println("Your full name is " + fullName + "."); 
	}
}
