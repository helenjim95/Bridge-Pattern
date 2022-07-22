package de.tum.in.ase.eist;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class ExamSystem {
	private ExamSystem() {
	}

	// 5: Change signature, make use of the bridge pattern - done
	public static String hashFile(String document, Hashing hashing) {
		return hashing.calculateHashCode(document);
	}

	public static void main(String[] args) throws IllegalArgumentException {
		String file1 = readFile("exams/short_exam.txt");
		String file2 = readFile("exams/long_exam.txt");  //This file is too big for Preview Hashing

		// 6: Change SimpleHash to PreviewHashing - done
		Hashing previewHashing = new PreviewHashing();

		System.out.println(hashFile(file1, previewHashing));
		try {
			System.out.println(hashFile(file2, previewHashing));
			throw new IllegalStateException("Hashing this file with preview hashing should not work!");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		// 6: Change CryptoSecureHashAlgorithm to EnterpriseHashing - done
		Hashing enterpriseHashing = new EnterpriseHashing();

		System.out.println(hashFile(file1, enterpriseHashing));
		System.out.println(hashFile(file2, enterpriseHashing));
	}

	public static String readFile(String filepath) throws RuntimeException {
		Path path = Path.of(filepath);
		// 4: Return the content of the passed file as a String - done
		try {
			return Files.readString(path);
		} catch (IOException e) {
			throw new RuntimeException("Cannot read exam file!");
		}
	}
}
