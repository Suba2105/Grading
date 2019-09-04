package com.revature.Grading.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import com.revature.Grading.util.ConnectionUtil;

public class SubWiseRank {

	public static void function() throws SQLException {
	    Scanner scn = new Scanner(System.in);

		System.out.println("---------");
		System.out.println("1.Maths");
		System.out.println("2.Physics");
		System.out.println("3.Chemistry");
		System.out.println("4.Botany");
		System.out.println("5.Zoology");
		System.out.println("----------");
		boolean quit = true;
		do {

			System.out.println("Enter Your Choice: ");
			int Choice = scn.nextInt();
			switch (Choice) {

			case 1: {

				Connection con = ConnectionUtil.getConnection();

				System.out.print("Maths      ");
				System.out.print("Register_Number          ");
				System.out.print("Grade        ");
				System.out.println("Student_Name    ");

				String sql1 = "select Student_Name,Maths,Register_Number,Grade from Admin order by Maths desc";
				PreparedStatement pst1 = con.prepareStatement(sql1);
				ResultSet rs1 = pst1.executeQuery();
				while (rs1.next())
				{
					int mat = rs1.getInt("Maths");
					int reg_no = rs1.getInt("Register_Number");
					String grade2 = rs1.getString("Grade");
					String s_name = rs1.getString("Student_Name");

					System.out.println(mat + "           " + reg_no + "                       " + grade2 + "                  " + s_name);
				}

				UserOperations.function();

				break;

			}
			case 2:

			{

				Connection con = ConnectionUtil.getConnection();

				System.out.print("Physics    ");
				System.out.print("Register_Number       ");
				System.out.print("Grade    ");
				System.out.println("Student_Name    ");

				String sql1 = "select Student_Name,Physics,Register_Number,Grade from Admin order by Physics desc";
				PreparedStatement pst1 = con.prepareStatement(sql1);
				ResultSet rs1 = pst1.executeQuery();
				while (rs1.next())
				{

					int phy = rs1.getInt("Physics");
					int reg_no = rs1.getInt("Register_Number");
					String grade2 = rs1.getString("Grade");
					String s_name = rs1.getString("Student_Name");

					System.out.println(phy + "             " + reg_no + "                   " + grade2 + "           " + s_name);
				}

				UserOperations.function();

				break;
			}

			case 3: {

				Connection con = ConnectionUtil.getConnection();

				System.out.print("Che    ");
				System.out.print("Register_Number       ");
				System.out.print("Grade    ");
				System.out.println("Student_Name    ");

				String sql1 = "select Student_Name,Chemistry,Register_Number,Grade from Admin order by Chemistry desc";
				PreparedStatement pst1 = con.prepareStatement(sql1);

				ResultSet rs1 = pst1.executeQuery();
				while (rs1.next())

				{

					int che = rs1.getInt("Chemistry");
					int reg_no = rs1.getInt("Register_Number");
					String grade2 = rs1.getString("Grade");
					String s_name = rs1.getString("Student_Name");

					System.out.println(che + "           " + reg_no + "                " + grade2 + "            " + s_name);
				}

			}
				UserOperations.function();

				break;

			case 4: {

				Connection con = ConnectionUtil.getConnection();

				System.out.print("Botany     ");
				System.out.print("Register_Number        ");
				System.out.print("Grade       ");
				System.out.println("Student_Name    ");

				String sql1 = "select Student_Name,Botany,Register_Number,Grade from Admin order by Botany desc";
				PreparedStatement pst1 = con.prepareStatement(sql1);

				ResultSet rs1 = pst1.executeQuery();
				while (rs1.next())

				{

					int bot = rs1.getInt("Botany");
					int reg_no = rs1.getInt("Register_Number");
					String grade2 = rs1.getString("Grade");
					String s_name = rs1.getString("Student_Name");

					System.out.println(bot + "           " + reg_no + "                     " + grade2 + "            " + s_name);
				}

			}
				UserOperations.function();

				break;
			case 5: {

				Connection con = ConnectionUtil.getConnection();

				System.out.print("Zoology    ");
				System.out.print("Register_Number    ");
				System.out.print("Grade    ");
				System.out.println("Student_Name    ");

				String sql1 = "select Student_Name,Zoology,Register_Number,Grade from admin order by Zoology desc";
				PreparedStatement pst1 = con.prepareStatement(sql1);

				ResultSet rs1 = pst1.executeQuery();
				while (rs1.next())

				{

					int zoo = rs1.getInt("Zoology");
					int reg_no = rs1.getInt("Register_Number");
					String grade2 = rs1.getString("Grade");
					String s_name = rs1.getString("Student_Name");

					System.out.println(zoo + "           " + reg_no + "                " + grade2 + "            " + s_name);
				}

			}
				UserOperations.function();

				break;

			case 6: {
				quit = true;

				break;

			}

			}

		} while (!quit);

	}

}
