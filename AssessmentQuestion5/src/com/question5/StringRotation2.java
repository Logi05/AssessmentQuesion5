package com.question5;

public class StringRotation2 {
	public static void main(String[] args) {
	String First = "XYZ", Last = "ZXY";

	if (First.length() != Last.length()) {

		System.out.println("False");
	}

	else {

		First = First.concat(First);
		if (First.indexOf(Last) != -1)
			System.out.println("True");
		else
			System.out.println("False");
	}
	}
}
