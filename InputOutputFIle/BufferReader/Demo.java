package com.rk.BufferReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo {

	public static void main(String[] args) {
		String path1 = "C:\\Users\\Dell\\eclipse-workspace\\InputOutput\\src\\com\\rk\\BufferReader\\input.txt";
		String path2 = "C:\\Users\\Dell\\eclipse-workspace\\InputOutput\\src\\com\\rk\\BufferReader\\output.txt";
		
		try {
		FileReader fr = new FileReader(path1);
		FileWriter fw = new FileWriter(path2);
		
		//taking input as String data
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String x;
		while((x = br.readLine()) != null) {
			bw.write(x);
		}
		
		bw.flush();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
