package com.thoughtfocus.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileTimeException {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		try {
			FileReader filereader = new FileReader("c:||text");
			BufferedReader bufferedreader = new BufferedReader(filereader);
			bufferedreader.readLine();
			}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		}

}
