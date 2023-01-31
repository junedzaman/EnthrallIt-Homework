package hw8Abstraction;

public abstract class MedicalSchool {
	//	We can create a constructor inside an abstract class.
	public MedicalSchool() {}
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("biochemistryLab is an non abstract method");
	}
}
