
/**
 *  If you use fully qualified name then only declared class of the current package will
 *  be accessible.   
 *  Use fully qualified name every time when you are accessing the class .
 *  there is no need to use import keyword.
 */

package Package1; // Creating package 1

public class Student { // Creating a class
	String name = "Nitish Negi"; // Declaring String variable
	int roll = 111; // Declaring integer variable

	public void display() { // display method

		System.out.println(name + " " + roll);

	}
}