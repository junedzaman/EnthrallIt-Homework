package hw4JavaVariables;

/*
 * Create a package name "hw4JavaVariables" inside the HW project. Create a Class name "AboutMe". Declare String and other 8 types of variable. Create a constructor and Give a sysout inside Constructor which will print "This is all about us: ". Then Create a method name aboutMe. Inside the method -use String and the other 8 types of variables inside sysout to define a person's meaningful info.
Create another class AboutMeTest. Instantiate AboutMe class inside the main method. Initialize variables and call the method by the object. I expect print outcome for 2 people, one for you and another for your best friend Alex. give a single line comment where a variable is declared and initialized, the constructor is declared and initialized, and the method is implemented and initialized.
Follow indentation by Organizing the code and push to GitHub and paste the link of GitHub below. [Mark distribution (100): using variable --10, Create a method and constructor - 20, instantiate class - 10, initialize variables and call methods for you and Alex= 15  variable is declared and initialized, the constructor is declared and initialized, the method is implemented and initialized -- 10, organize code and other-- 25]. push your code to Git Hub -- 10. Share the package link below.
 */

public class AboutMe {

	// Variables
	public String nameString;

	// 8 types of primitive data types.
	public byte myAge;
	public short myHouesRent;
	public int myMonthlyIncome;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;
//	Constructor declared
	public AboutMe() {
		System.out.println("This is all about us: ");
	}
//Method implemented.
	public void aboutMe() {
		System.out.println("My Name: " + nameString + '\n' + "My age is: " + myAge + '\n' + "My height: " + myHeight
				+ '\n' + "Sex: " + sex + '\n' + "My House Rent: " + myHouesRent + '\n' + "My Monthly Income: "
				+ myMonthlyIncome + '\n' + "My Bank Balance: " + myBankBalance + '\n' + "My Grade: " + myGrade + '\n'
				+ "US Citizen? Ans: " + usCitizen);
	}
}