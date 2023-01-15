package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe aboutJuned = new AboutMe(); // Constructor is initialized here
		//	Variables initialized here
		aboutJuned.nameString = "Juned Zaman";
		aboutJuned.myAge = 33;
		aboutJuned.myHeight = 5.60f;
		aboutJuned.sex = 'M';
		aboutJuned.myHouesRent = 24500;
		aboutJuned.myMonthlyIncome = 548555;
		aboutJuned.myBankBalance = 547651215;
		aboutJuned.myGrade = 3.4554654466;
		aboutJuned.usCitizen = false;
		aboutJuned.aboutMe();//Method is initialized here

		System.out.println("\n-------------------------------------------------------\n");

		AboutMe aboutAlex = new AboutMe();
		aboutAlex.nameString = "Alex";
		aboutAlex.myAge = 28;
		aboutAlex.myHeight = 6.60f;
		aboutAlex.sex = 'M';
		aboutAlex.myHouesRent = 4500;
		aboutAlex.myMonthlyIncome = 234555;
		aboutAlex.myBankBalance = 458751215;
		aboutAlex.myGrade = 3.0454654466;
		aboutAlex.usCitizen = true;
		aboutAlex.aboutMe();

	}
}