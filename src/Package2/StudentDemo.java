package Package2; // Creating package 2

public class StudentDemo { // Creating class 

	public static void main(String[] args) { // Main Method

		Package1.Student s = new Package1.Student(); /**Using fully qualified name to access 
		                                                 the class instead of using import keyword
		                                               **/

		s.display(); //Calling the display method of package 1
	}

}
