package com.home.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

public class compileException {

	public void CreateAndWriteTxt() throws IOException, SQLException, FileNotFoundException {
		FileWriter FW = new FileWriter("G:\\Mohan\\Learnings\\Test.txt");
		FW.write("File Created");
		FW.close();
		FileReader FR = new FileReader("G:\\Mohan\\Learnings\\Test.txt");
		throw new IOException("Exception Thrwon");
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
		new compileException().CreateAndWriteTxt();
	}
	
}
