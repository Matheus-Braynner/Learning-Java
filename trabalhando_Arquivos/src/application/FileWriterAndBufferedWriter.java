package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndBufferedWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night", "Good evening"};
		
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
