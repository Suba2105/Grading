package com.revature.Grading.services;

import java.sql.SQLException;
import java.util.Scanner;
import com.revature.Grading.services.Details;
import com.revature.Grading.Dao.GradeDAO;
import com.revature.Grading.Dao.TopBottomDAO;

public class UserOperations {

	public static void function() throws SQLException {
		Scanner scn = new Scanner(System.in);

		System.out.println("1.Top to bottom Result");

		System.out.println("2.Grade Wise Result");

		System.out.println("3.Subject Wise Result");
		
		System.out.println("4.Exit");

		boolean quit = false;
		do {

			System.out.println("Enter The Choice: ");
			int Choice = scn.nextInt();
			switch (Choice) {

			case 1: {
				System.out.println("Top to Bottom");

				Details det = new Details();
				det = TopBottomDAO.login();

				break;

			}
			case 2:

			{
				System.out.println("Grade Wise");

				System.out.println("Enter the grade");
				String grade2 = scn.next();

				Details det = new Details();
				det = GradeDAO.login(grade2);

				break;
			}

			case 3: {
				System.out.println("Subject Wise");

				SubWiseRank.function();

			}

				break;

			case 4:

				quit = true;

				break;

			}

		} while (!quit);

	}

}
