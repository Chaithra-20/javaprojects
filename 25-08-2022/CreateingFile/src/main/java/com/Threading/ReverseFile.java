package com.Threading;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReverseFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("d:Chaithra.txt");
		Scanner ck=new Scanner(f1);
		
		while(ck.hasNextLine()) {
			System.out.println(ck.nextLine());
		}
	}

}
