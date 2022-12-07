import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		String generatedEmail;
		String generatedPassword;
		CredentialService credentialService = new CredentialService();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first name : ");
		String firstName = sc.nextLine();
		System.out.print("Enter last name : ");
		String lastName = sc.nextLine();

		Employee employee = new Employee(firstName, lastName);
//		Employee employee = new Employee(Rajiv Kumar, rajiv kumar);

		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		int choice;
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			generatedEmail = credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"tech");
			generatedPassword = credentialService.generatePassword();
			credentialService.showCredentials(employee, generatedEmail, generatedPassword);
			break;

		case 2:
			generatedEmail = credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"admin");
			generatedPassword = credentialService.generatePassword();
			credentialService.showCredentials(employee, generatedEmail, generatedPassword);
			break;
			
		case 3:
			generatedEmail = credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"hr");
			generatedPassword = credentialService.generatePassword();
			credentialService.showCredentials(employee, generatedEmail, generatedPassword);
			break;
			
		case 4:
			generatedEmail = credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"legal");
			generatedPassword = credentialService.generatePassword();
			credentialService.showCredentials(employee, generatedEmail, generatedPassword);
			break;
			
		case 5:
			System.out.println("please enter valid dept#");
			break;
		}
		sc.close();
	}
}