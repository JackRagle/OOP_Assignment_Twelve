package passwordCheck;

import java.util.Scanner;
import passStorage.Password;

public class CheckPassword {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String password;
		
		System.out.println("Please enter your new password. It must be between 8 and 16 characters and include at least three of the following: An upper case letter, A lower case letter, A number, and a special character.");
		password = in.nextLine();
		if(password.length() < 8) {
			System.out.println("You new password is too short");
		}else if(password.length() > 16) {
			System.out.println("You new password is too long");
		}else {
			Password newPass = new Password(password.length());
			for(int i = 0;i < password.length();i++) {
				newPass.addChar(password.charAt(i));
			}
			if(newPass.checkPass()) {
				System.out.println("Sucess!");
			}else {
				System.out.println("The password that you have entered does not satisfy the requirements.");
			}
		}
		
		in.close();
		
	}

}
