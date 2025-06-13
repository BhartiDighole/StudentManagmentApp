//package com.student.manage;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Star {
//
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		// TODO Auto-generated method stub
//  System.out.println("welcome to the student managment app");
//  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //obj get user use buffeReader
//   
//  while(true) {
//	  System.out.println("press 1 to add student");
//	  System.out.println("press 2 to delete student");
//	  System.out.println("press 3 to display student");
//	  System.out.println("press 4 to exit app");
//	  
//	  int c=Integer.parseInt(br.readLine()); //convert integer
//	  
//	  if(c==1)
//	  {
//		  //add student
//		  System.out.println("Enter user name :");
//		  String name = br.readLine();
//		  
//		  System.out.println("Enter user phone :");
//		  String phone=br.readLine();
//		  
//		  System.out.println("Enter user city");
//		  String city=br.readLine();
//		  
//		  //create student object to store  student
//		  Student st = new Student(name , phone , city);
//		  
//		 public static boolean answer = StudentDao.insertStudentToDB(st);
//		  if(answer) {
//			  System.out.println("student is added sucessfully...");
//			  
//		  }else
//		  {
//			  System.out.println();
//		  }
//		  
//		  System.out.println(st);
//		  
//	  }
//	  
//	  else if(c==2)
//	  {
//		  //delete student
//	  }
//	  
//	  else if(c==3)
//	  {
//		  //display student
//	  }
//	  
//	  else if(c==4)
//	  {
//		  
//		  //exit
//		  break;
//	  }
//	  else {
//		  
//	  }
//	  
//	  
//  }
//  System.out.println("thank you for using my application");
//	  }
//	  
//}
//    
//	
//
//

package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star {

    public static void main(String[] args) throws NumberFormatException, IOException {

        System.out.println("Welcome to the Student Management App");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Reader for user input

        while (true) {
            System.out.println("\nPress 1 to Add Student");
            
            System.out.println("Press 2 to Delete Student");
            System.out.println("Press 3 to Display Students");
            System.out.println("Press 4 to Exit App");

            int c = Integer.parseInt(br.readLine()); // Read user choice

            if (c == 1) {
                // Add student
                System.out.println("Enter user name:");
                String name = br.readLine();

                System.out.println("Enter user phone:");
                String phone = br.readLine();

                System.out.println("Enter user city:");
                String city = br.readLine();

                // Create Student object
                Student st = new Student(name, phone, city);

                // Insert student into DB
                boolean answer = StudentDao.insertStudentToDB(st);
                if (answer) {
                    System.out.println("Student added successfully.");
                } else {
                    System.out.println("Something went wrong... student not added.");
                }

                System.out.println(st); // Print student object info

//            } else if (c == 2) {
//                // Delete student
//                System.out.println("Enter student ID to delete:");
//                int userId = Integer.parseInt(br.readLine());
//
//                boolean answer = StudentDao.deleteStudent(userId);
//                if (answer) {
//                    System.out.println("Student deleted successfully.");
//                } else {
//                    System.out.println("Something went wrong... student not deleted.");
//                }
//
//            } else if (c == 3) {
//                // Display students
//                StudentDao.showAllStudents();
//
//            } else if (c == 4) {
//                // Exit app
//                System.out.println("Thank you for using the application.");
//                break;
//
//            } else {
//                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

