package com.revature.Grading.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.Grading.services.Details;
import com.revature.Grading.util.ConnectionUtil;

public class TopBottomDAO {

	public static Details login() throws SQLException {
		Connection con = ConnectionUtil.getConnection();
		String sql = "select Student_Name,Register_Number,Maths,Physics,Chemistry,Botany,Zoology,Total,Average,Grade from Admin ";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		Details det = null;

		if (rs.next()) {

			String s_name = rs.getString("Student_Name");
			Integer reg_no = rs.getInt("Register_Number");
			Integer mat = rs.getInt("Maths");
			Integer phy = rs.getInt("Physics");
			Integer che = rs.getInt("Chemistry");
			Integer bot = rs.getInt("Botany");
			Integer zoo = rs.getInt("Zoology");
			Integer total = rs.getInt("Total");
			Double avg = rs.getDouble("Average");
			String grade = rs.getString("Grade");

			det = new Details();

			det.setStudent_Name(s_name);
			det.setRegister_Number(reg_no);
			det.setMaths(mat);
			det.setPhysics(phy);
			det.setChemistry(che);
			det.setBotany(bot);
			det.setZoology(zoo);
			det.setTotal(total);
			det.setAverage(avg);
			det.setGrade(grade);

			System.out.print("REGISTER_NUMBER             ");
			System.out.print("GRADE         ");
			System.out.println("STUDENT_NAME             ");

			String sql1 = "select Student_Name,Register_Number,Maths,Physics,Chemistry,Botany,Zoology,Total,Average,Grade from Admin order by Total desc ";
			PreparedStatement pst1 = con.prepareStatement(sql1);

			ResultSet rs1 = pst1.executeQuery();
			while (rs1.next()) {

				String Grade = rs1.getString("Grade");
				String Sname = rs1.getString("Student_Name");
				int regno1 = rs1.getInt("Register_Number");

				System.out.println(regno1 + "                           " + Grade + "                   " + Sname);
			}

		}
		return det;

	}
}
