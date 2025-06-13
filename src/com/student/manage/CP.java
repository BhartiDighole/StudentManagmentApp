package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection Con;
	
  public static Connection createC() // method  createC for connection always create connection
  
 {
	  try {
		  //load driver
		 Class.forName("com.mysql.jdbc.Driver");
		 // Class.forName("com.mysql.cj.jdbc.Driver");

		  		
		 //create connection
				  String user ="root";
				  String Password ="root";
				  String url = "jdbc:mysql://localhost:3306/student_manager";
				  
				  Con =DriverManager.getConnection(url,user,Password);
				  
	  }catch (Exception e) {
		  e.printStackTrace();
	  }
	return Con;
				  
	 
	
	
}
}
