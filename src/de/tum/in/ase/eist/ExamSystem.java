package de.tum.in.ase.eist;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class ExamSystem {
	private ExamSystem() {
	}

	// TODO 5: Change signature, make use of the bridge pattern - done
	public static String hashFile(String document, Hashing hashing) {
		return hashing.calculateHashCode(document);
	}

	public static void main(String[] args) throws IOException {
		String file1;
		String file2;
		try {
			file1 = readFile("exams/short_exam.txt");
		} catch (RuntimeException e) {
			throw new RuntimeException("Cannot read short exam file!");
		}
		try {
			file2 = readFile("exams/long_exam.txt");  //This file is too big for Preview Hashing
		} catch (RuntimeException e) {
			throw new RuntimeException("Cannot read short exam file!");
		}

		// TODO 6: Change SimpleHash to PreviewHashing - done
		Hashing simpleHash = new PreviewHashing();

		System.out.println(hashFile(file1, simpleHash));
		try {
			System.out.println(hashFile(file2, simpleHash));
			throw new IllegalStateException("Hashing this file with preview hashing should not work!");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		// TODO 6: Change CryptoSecureHashAlgorithm to EnterpriseHashing - done
		Hashing cryptoSecureHash = new EnterpriseHashing();

		System.out.println(hashFile(file1, cryptoSecureHash));
		System.out.println(hashFile(file2, cryptoSecureHash));
	}

	public static String readFile(String filepath) throws IOException {
		Path path = Path.of(filepath);
		// TODO 4: Return the content of the passed file as a String - done
		return Files.readString(path);
	}
}
