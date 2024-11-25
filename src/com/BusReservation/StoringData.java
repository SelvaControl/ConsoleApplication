package com.BusReservation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class StoringData {

	
	
 public void fileStoring(String userName, String userPassword) {
	
	 try {
		FileWriter fw = new FileWriter("userDetails.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(" userName: " + userName + " password: " + userPassword);
		bw.newLine();
		bw.close();
	} catch (IOException e) {
		 System.out.println("An error occurred while storing user details in file: " + e.getMessage());
	}
	 
 }

  public void viewFiles() {
	  
	  try {
		  FileReader fr = new FileReader("userDetails.txt");
		  BufferedReader br = new BufferedReader(fr);
		  String res = br.readLine();
		  while(res!= null) {
			  System.out.println(res);
			  res = br.readLine();
		  }
			 
	  } catch (IOException e) {
			 System.out.println("An error occurred while viewing user details in file: " + e.getMessage());
		}
	
}

  
  public void checkFile() {
	  try {
		  FileReader fr = new FileReader("userDetails.txt");
		  BufferedReader br = new BufferedReader(fr);
		  
		  
	  } catch (IOException e) {
		  System.out.println("An error occurred while viewing user details in file: " + e.getMessage());
	  }
  }

}
