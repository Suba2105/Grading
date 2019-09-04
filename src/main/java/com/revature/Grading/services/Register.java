package com.revature.Grading.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import com.revature.Grading.util.ConnectionUtil;

public class Register {

	static Scanner sc = new Scanner(System.in);

	public static void register(String s_name, int mat, int phy, int che, int bot, int zoo, int total, double avg,
			String grade) throws SQLException, ClassNotFoundException {

		Connection con = ConnectionUtil.getConnection();

		String sql = "insert into Admin(Student_Name,Maths,Physics,Chemistry,Botany,Zoology,Total,Average,Grade) values ( ?,?,?,?,?,?,?,?,?)";

		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, s_name);
		pst.setInt(2, mat);
		pst.setInt(3, phy);
		pst.setInt(4, che);
		pst.setInt(5, bot);
		pst.setInt(6, zoo);
		pst.setInt(7, total);
		pst.setDouble(8, avg);
		pst.setString(9, grade);

		int rows = pst.executeUpdate();
		System.out.println("Number Of Rows Inserted    " + rows);

	}
}
