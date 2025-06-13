package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
	
	public static boolean insertStudentToDB(Student st)
	{
		boolean f=false;
		
		try {
			Connection con = CP.createC();
			
			String q= "insert into students(sname,sphone,scity)values(?,?,?)";
			//PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);
			
			//set the value of parameter
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudenPhone());
			pstmt.setString(3,st.getStudentCity());
			
			
			//execute
			pstmt.executeUpdate();
			f=true;
		}catch (Exception e) {
			
			//handle exception
			e.printStackTrace();
		}
		return f;

}
}
