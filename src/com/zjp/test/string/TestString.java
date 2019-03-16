package com.zjp.test.string;

public class TestString {
	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		String c = "a";
		String d = "bc";
		String e = c + d;
		String f = "a" + "bc";
		System.out.println(a == b);
		System.out.println(a == e);
		System.out.println(a == f);
		System.out.println(e == f);
	}
}
