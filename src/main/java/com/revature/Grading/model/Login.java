package com.revature.Grading.model;

import java.util.Scanner;
import com.revature.Grading.services.Register;
import com.revature.Grading.services.UserOperations;
import com.revature.Grading.Dao.UserDAO;
import com.revature.Grading.services.Details;
public class Login {
	public static void main(String args[]) throws Exception {

		Login.WelcomePage();

	}

	public static void WelcomePage() throws Exception, ClassNotFoundException

	{
		System.out.println("--------------------------------");
		System.out.println("1.ADMIN LOGIN   or   2.STUDENT LOGIN");
		System.out.println("--------------------------------");
		Scanner scn = new Scanner(System.in);

		boolean quit = false;
		do {
			System.out.println("Enter The Option:");
			int Choice = scn.nextInt();
			switch (Choice)

			{
			case 1:

			{

				System.out.println("Enter The Admin ID ");
				String uname = scn.next();
				System.out.println("Enter the Password");
				String pass = scn.next();

				if (uname.equals("3120") && pass.equals("pass"))

				{

					System.out.println("_____________________________");
					System.out.println("ENTER THE STUDENT INFORMATION");
					System.out.println("_____________________________");

					System.out.println("Enter Student name:");
					String s_name = scn.next();

					System.out.println("Enter Maths Mark:");
					int mat = scn.nextInt();

					System.out.println("Enter Physics Mark:");
					int phy = scn.nextInt();

					System.out.println("Enter Chemistry Mark:");
					int che = scn.nextInt();

					System.out.println("Enter Botany Mark:");
					int bot = scn.nextInt();

					System.out.println("Enter Zoology Mark:");
					int zoo = scn.nextInt();

					int total = mat + phy + che + bot + zoo;
					double avg = (double) (total / 5);

					System.out.println("Total Marks:" + total);
					System.out.println("Average:" + avg);
					String grade;
					{
						if (total > 470 && total <= 500) {
							grade = "A";

						} else if (total > 430 && total <= 470) {
							grade = "B";

						} else if (total > 390 && total <= 430) {
							grade = "C";

						} else {
							grade = "U";
						}

						System.out.println("GRADE: " + grade);

						Register.register(s_name, mat, phy, che, bot, zoo, total, avg, grade);

					}
				} else {

					System.out.println("INVALID DETAILS ");

				}

				break;

			}
			case 2:

			{

				System.out.println("**********");
				System.out.println("Login");
				System.out.println("**********");

				System.out.println("Student_Name");
				String s_name = scn.next();

				System.out.println("Enter the Register_Number");
				int reg_no = scn.nextInt();

				Details det = new Details();

				det = UserDAO.login(s_name, reg_no);

				if (det != null) {
					System.out.println("Login Successfull");

					UserOperations.function();

				} else
					System.out.println("Incorrect STUDENT_NAME AND REGISTER_Number");

				break;

			}

			case 3:

				quit = true;

				break;

			}
		} while (!quit);

	}

}

