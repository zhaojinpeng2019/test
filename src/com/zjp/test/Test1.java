package com.zjp.test;

import java.lang.invoke.VolatileCallSite;

/**
 * i++ ：先运算后增1 ++i ： 先增1后运算
 * 
 * @author zjp
 *
 */
public class Test1 {
	public static void main(String[] args) {
		/*
		 * int x = 5; //int y = x++; 
		 * int y = ++x; System.out.println("x = " + x + ", y = " +y);
		 */
		String a = "Programming";
		String b = new String("Programming");
		String c = "Program" + "ming";
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.intern() == b.intern());
	}
}
