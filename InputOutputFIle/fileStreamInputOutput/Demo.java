package com.rk.fileStreamInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo {

	public static void main(String[] args) {
		try
		{
			/*
			create 2 text files within a folder named => input.txt and output.txt
			and give the path to path1 and path2
			*/
			String path1 = "C:\\Users\\Dell\\eclipse-workspace\\InputOutput\\src\\com\\rk\\fileStreamInputOutput\\input.txt";
			String path2 = "C:\\Users\\Dell\\eclipse-workspace\\InputOutput\\src\\com\\rk\\fileStreamInputOutput\\output.txt";
			
			//copying the input file values through Stream
			FileInputStream fis = new FileInputStream(path1);
			//copying the input file values from x and send to Output file through Stream
			FileOutputStream fos = new FileOutputStream(path2);
			
              // int x = fis.read();
             // fos.write(x);
			
			//reading a data come from input stream
			int x;
			while((x = fis.read()) != -1) {
				//and writing a data to output stream
				fos.write(x);
			}	
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
