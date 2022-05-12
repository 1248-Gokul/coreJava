package com.chainsys.strings;

import java.util.Scanner;

public class StringLessonB {

	public static void reversee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String first = sc.nextLine();
		String sentence = "";
		try {
			sentence = sc.nextLine();
		} finally {
			sc.close();
		}
		for (int i = first.length() - 1; i >= 0; i--) {
			sentence += first.charAt(i);
		}
		System.out.println(sentence);

	}

}
