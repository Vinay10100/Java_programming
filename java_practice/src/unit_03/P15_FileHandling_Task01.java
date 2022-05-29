package unit_03;

import java.io.*;

public class P15_FileHandling_Task01 {
	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Users\\VINAY\\git\\Java_programming\\java_practice\\src\\unit_03\\readfile.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line;
		int wordCount = 0;

		while ((line = bufferedReader.readLine()) != null) {
			String words[] = line.split("\\s+");
			wordCount += words.length;
		}
		System.out.println("\n Number of words in file: " + wordCount);
		bufferedReader.close();
	}
}