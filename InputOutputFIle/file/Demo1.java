package com.rk.file;

import java.io.File;

public class Demo1 {
	public static void main(String[] args) {

		// String path = "E:\\input.txt";
		// or
		String path = "C:\\Users\\Dell\\eclipse-workspace\\InputOutput\\src\\com\\rk\\file\\input.txt";
		File file = new File(path);

		try {
			System.out.println(file.getAbsolutePath()); // E:\input.txt
			System.out.println(file.getCanonicalPath()); // E:\input.txt
			System.out.println(file.getName()); // input.txt
			System.out.println(file.getParent()); // E:\
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
