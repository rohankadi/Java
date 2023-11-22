package com.rk.fileReader;

import java.io.FileReader;
import java.io.FileWriter;

public class Demo {

	public static void main(String[] args) {
		String path1 = "C:\\Users\\Dell\\eclipse-workspace\\InputOutput\\src\\com\\rk\\fileReader\\input.txt";
		String path2 = "C:\\Users\\Dell\\eclipse-workspace\\InputOutput\\src\\com\\rk\\fileReader\\output.txt";

		try {
			FileReader fr = new FileReader(path1);
			FileWriter fw = new FileWriter(path2);
			
			int x;
			while((x = fr.read()) != -1) {
				fw.write(x);
			}
			
		//flush cz, of insufficient data
		fw.flush();
		}
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}