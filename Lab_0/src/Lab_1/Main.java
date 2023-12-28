package Lab_1;

public class Main {

	public static void main(String[] args) {
		// Task 2 
		LabClass person = new LabClass("Arlan", 19);
		
		System.out.println(person.toString());
		
		person.change("Linara");
		person.change(20);
		person.gender = Gender.FEMALE;
		
		System.out.println(person.toString());
		
		person.showPrivateData();
		
		
		LabClass.showBankName();
		
		// Task 3
		
		Temperature temperatureInAlmaty = new Temperature(21);
		Temperature temperatureInPavlodar = new Temperature('C');
		Temperature temperatureTest = new Temperature(45, 'F');
		
		
		temperatureInAlmaty.showInCelcium();
		temperatureInPavlodar.showInFarenheit();
		temperatureTest.showInCelcium();
		

	}

}
