package hw3JavaVariables;

public class AboutMe {
	// Declared a integer
	public int myNumber;

	// Declared and initialized a string
	public String name = "Juned Zaman";

	// Declared and initialized a byte
	public byte age = 33;

	// Declared and initialized a short
	public short aprtmentRent = 2645;

	// Declared and initialized an integer
	public int phonenumber = 1545460;

	// Declared and initialized a long
	public long l = 465354355;

	// Declared and initialized float
	public float f = 3.858f;

	// Declared and initialized double
	public double d = 3.8584587455;

	// Declared and initialized a Char
	public char c = 'A';

	// Declared and initialized boolean
	public boolean positive = true;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println("My name is " + aboutMe.name + ", I am " + aboutMe.age + ", My apartment rent is "
				+ aboutMe.aprtmentRent);
	}

}
