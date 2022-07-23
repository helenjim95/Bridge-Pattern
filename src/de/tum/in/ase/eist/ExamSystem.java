package de.tum.in.ase.eist;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// TODO: Client class
public final class ExamSystem {
	private ExamSystem() {
	}

	// TODO: 5: delegate method calls to the abstraction class
	public static String hashFile(String document, Hashing hashing) {
		return hashing.calculateHashCode(document);
	}

	public static void main(String[] args) throws IllegalArgumentException {
		String file1 = readFile("exams/short_exam.txt");
		String file2 = readFile("exams/long_exam.txt");  //This file is too big for Preview Hashing

		// TODO: 6: Implement methods from Concrete Abstraction class
		Hashing previewHashing = new PreviewHashing();
		HashFunction simpleHashAlgorithm = new SimpleHashAlgorithm();
		previewHashing.setImplementation(simpleHashAlgorithm);

		System.out.println(hashFile(file1, previewHashing));
		try {
			System.out.println(hashFile(file2, previewHashing));
			throw new IllegalStateException("Hashing this file with preview hashing should not work!");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		// TODO: 6: Implement methods from Concrete Abstraction class
		Hashing enterpriseHashing = new EnterpriseHashing();
		HashFunction cryptoSecureHashAlgorithm = new CryptoSecureHashAlgorithm();
		enterpriseHashing.setImplementation(cryptoSecureHashAlgorithm);

		System.out.println(hashFile(file1, enterpriseHashing));
		System.out.println(hashFile(file2, enterpriseHashing));
	}

	public static String readFile(String filepath) throws RuntimeException {
		Path path = Path.of(filepath);
		try {
			return Files.readString(path);
		} catch (IOException e) {
			throw new RuntimeException("Cannot read exam file!");
		}
	}
}
