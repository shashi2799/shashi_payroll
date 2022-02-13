package Com.myfssbeans;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class TypesOfUsers {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException, NumberFormatException, SQLException {
		//scanning input values
		Scanner scan = new Scanner(System.in);
		System.out.println("WELCOME TO THE PMS SYSTEM");

		System.out.println("PLEASE CHOOSE ONE FROM IT:\n 1.ADMINSTRATOR\n 2.EMPLOYEE \n 3.ACCOUNTANT");
		int a = scan.nextInt();
		User_Login u = new User_Login();
		//condition checking
		if (a == 1) {
			
			System.out.println("WELCOME ADMINSTRATOR");
			
			User_Actions.Admin();
			System.out.println("CONFIRM LOGOUT..! PRESS ANY KEY");
			int r = scan.nextInt();
			if (r == 10) {
				System.exit(0);
			} else {
				System.exit(0);
			}
		} 
			//condition checking
			else if (a == 2) {
			System.out.println("WELCOME EMPLOYEE");
			
			User_Actions.Employee();
			System.out.println("CONFIRM LOGOUT..! PRESS ANY KEY");
			int r = scan.nextInt();
			if (r == 10) {
				System.exit(0);
			} else {
				System.exit(0);
			}
		} else if (a == 3) {

			System.out.println("WELCOME EMPLOYEE");
			
			User_Actions.Accountant();
			System.out.println("CONFIRM LOGOUT..! PRESS ANY KEY");
			int r = scan.nextInt();
			if (r == 10) {
				System.exit(0);
			} else {
				System.exit(0);
			}
		}
		else {
			System.out.println("INVALID DATA\n PRESS 0 TO RE-ENTER THE DATA OR PRESS PRESS ANY KEY TO LOGOUT");
			int r = scan.nextInt();
			if (r == 0) {
				//Turn to main menu..
				TypesOfUsers c = new TypesOfUsers();
				c.main(args);
			} else {
			
				//LOG-OUT
				System.exit(0);
			}

		}
	}

}



