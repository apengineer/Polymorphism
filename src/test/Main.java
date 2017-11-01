package test;

public class Main {
	public static void main(String[] args) {
		SoftwareEngineer jeedeveloper = new JEEDeveloper();
		SoftwareEngineer javaFEDeveloper = new JavaFEDeveloper();
		polymorphism(jeedeveloper);
		polymorphism(javaFEDeveloper);
	}

	public static void polymorphism(SoftwareEngineer engineer){
		engineer.knowsCoding();
	}
}
