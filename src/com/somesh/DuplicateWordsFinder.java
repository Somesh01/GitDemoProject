package com.somesh;

public class DuplicateWordsFinder {

	public static void main(String[] args) {

		String str = "I am Out of Town, Am am out of India";
		int count = 0;
		String s[] = str.split(" ");

		System.out.println(str + " = Lenth = " + s.length );
		for (int i = 0; i < s.length; i++) {
			count = 0;
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].equalsIgnoreCase(s[j])&& s[i]!="") {
					count++;
					s[j] = "0";
				}
			}
			if (count >= 1 && s[i] != "0")
				System.out.println(s[i] + " = " + count);

		}

	}

}
