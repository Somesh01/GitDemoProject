package com.somesh;

public class FirstNonDupCharFinder {

	public static void main(String args[]) {

		String str = "ABCCBDAF";
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {

				if (charArray[i] == charArray[j]) {
					count = 1;
					charArray[j]='0';
				}
			}
			if (count == 0) {
				System.out.println("1st not Duplicate char is :: " + charArray[i]);
			break;
			}
			count=0;
		}

	}

}
