package hw4JavaVariables;

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