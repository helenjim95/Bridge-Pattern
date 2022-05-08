package de.tum.in.ase.eist;

import java.nio.file.Path;

public final class ExamSystem {

	private ExamSystem() {
	}

	// TODO 5: Change signature, make use of the bridge pattern
	public static String hashFile(String document, HashFunction hashFunction) {
		return hashFunction.calculateHashCode(document);
	}

	public static void main(String[] args) {
		String file1 = readFile("exams/short_exam.txt");
		String file2 = readFile("exams/long_exam.txt");  //This file is too big for Preview Hashing

		// TODO 6: Change SimpleHash to PreviewHashing
		HashFunction simpleHash = new SimpleHashAlgorithm();

		System.out.println(hashFile(file1, simpleHash));
		try {
			System.out.println(hashFile(file2, simpleHash));
			throw new IllegalStateException("Hashing this file with preview hashing should not work!");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		// TODO 6: Change CryptoSecureHashAlgorithm to EnterpriseHashing
		HashFunction cryptoSecureHash = new CryptoSecureHashAlgorithm();

		System.out.println(hashFile(file1, cryptoSecureHash));
		System.out.println(hashFile(file2, cryptoSecureHash));
	}

	public static String readFile(String filepath) {
		Path path = Path.of(filepath);
		// TODO 4: Return the content of the passed file as a String.
		return null;
	}

}
