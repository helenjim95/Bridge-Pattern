package de.tum.in.ase.eist;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// TODO: Client class
public final class ExamSystem {

	private static Hashing hashGenerator;
	private ExamSystem() {
	}

	// TODO: 5: delegate method calls to the abstraction class
	public static String hashFile(String document) {
		return hashGenerator.hashDocument(document);
	}

	public static void main(String[] args) throws IllegalArgumentException {
		String file1 = readFile("exams/short_exam.txt");
		String file2 = readFile("exams/long_exam.txt");  //This file is too big for Preview Hashing

		// TODO: 6: Implement methods from Concrete Abstraction class
		hashGenerator = new PreviewHashing();
		System.out.println(hashFile(file1));
		try {
			System.out.println(hashFile(file2));
			throw new IllegalStateException("Hashing this file with preview hashing should not work!");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		// TODO: 6: Implement methods from Concrete Abstraction class
		hashGenerator = new EnterpriseHashing();
		System.out.println(hashFile(file1));
		System.out.println(hashFile(file2));
	}

	public static String readFile(String filepath) throws RuntimeException {
		Path path = Path.of(filepath);
		// TODO 5: Return the content of the passed file as a String.
		try {
			return Files.readString(path);
		} catch (IOException e) {
			throw new RuntimeException("Cannot read exam file!");
		}
	}
}
