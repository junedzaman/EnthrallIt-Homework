package hw8Inheritance;

//Here Reptile extends Animal, also Snake extends Reptile in Snake class, again Snake extends Cobra in Cobra class, This chain is called Multilevel Inheritance
public class Reptile extends Animal{
	public void reptileInfo() {
		System.out.println("This method is from Reptile Class");
	}
}
