package net.javaguides.lombok.cleanup;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import lombok.Cleanup;

public class BufferedReaderLombokExample {
	public static void main(String[] args) throws IOException {
		@Cleanup
		FileReader fr = new FileReader("sample.txt");
		
		@Cleanup
		BufferedReader br = new BufferedReader(fr);
		String sCurrentLine;

		while ((sCurrentLine = br.readLine()) != null) {
			System.out.println(sCurrentLine);
		}
	}
}
