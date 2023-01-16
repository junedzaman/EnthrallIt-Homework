package hw3JavaVariables;

public class AboutMe {
	public int myNumber; // Variables are declared

	// Variables are initialized
	public String name = "Juned Zaman";
	public byte age = 33;
	public short aprtmentRent = 2645;
	public int phonenumber = 1545460;
	public long l = 465354355l;
	public float f = 3.858f;
	public double d = 3.8584587455;
	public char c = 'A';
	public boolean positive = true;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println("My name is " + aboutMe.name + ", I am " + aboutMe.age + ", My apartment rent is "
				+ aboutMe.aprtmentRent);
	}

}
