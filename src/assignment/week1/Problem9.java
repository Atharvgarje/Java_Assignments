package assignment.week1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {

		int count = 0;

		try {
			File file = new File("src/doc/input.txt");
			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {
				String line = sc.nextLine();

				for (int i = 0; i < line.length(); i++) {
					char ch = line.charAt(i);

					if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
						count++;
					}
				}
			}
			sc.close();

			System.out.println("Lowercase vowels count: " + count);

		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
