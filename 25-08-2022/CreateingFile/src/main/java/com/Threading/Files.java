package com.Threading;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner ck=new Scanner(System.in);
	File f1=new File("d:Chaithra.txt");	
	System.out.println("Enter the data into the file");
	String data=ck.nextLine();
	FileWriter fw=new FileWriter(f1);
	fw.write(data);
	System.out.println("Entry done");
	
	}

}
