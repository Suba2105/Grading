package com.revature.Grading.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.revature.Grading.services.Details;
import com.revature.Grading.util.ConnectionUtil;

public class GradeDAO {

	public static Details login(String grade1) throws SQLException {
		Connection con = ConnectionUtil.getConnection();
		String sql = "select Student_Name,Maths,Physics,Chemistry,Botany,Zoology,Total,Average,Grade from Admin where Grade=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, grade1);
		ResultSet rs = pst.executeQuery();
		Details det = null;
		if (rs.next()) {
			
			String s_name = rs.getString("Student_Name");
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
			det.setMaths(mat);
			det.setPhysics(phy);
			det.setChemistry(che);
			det.setBotany(bot);
			det.setZoology(zoo);
			det.setTotal(total);
			det.setAverage(avg);
			det.setGrade(grade);

			System.out.println("---------------------------------");
			System.out.print("STUDENT_NAME           ");
			System.out.println("GRADE                  ");
			System.out.println("---------------------------------");

			String sql1 = "select Student_Name,Maths,Physics,Chemistry,Botany,Zoology,Total,Average,Grade from Admin where Grade=?";
			PreparedStatement pst1 = con.prepareStatement(sql1);

			pst1.setString(1, grade1);
			ResultSet rs1 = pst1.executeQuery();
			while (rs1.next()) {
				String student_name = rs1.getString("Student_Name");
				String grade2 = rs1.getString("Grade");

				System.out.println(student_name + "                     " + grade2 );
			}

		}
		return det;
	}
}
