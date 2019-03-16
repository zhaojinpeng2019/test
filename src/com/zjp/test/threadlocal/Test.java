package com.zjp.test.threadlocal;

public class Test {
	
	ThreadLocal<Long> longThreadLocal = new ThreadLocal<>();
	ThreadLocal<String> stringThreadLocal = new ThreadLocal<>();
	
	public void set() {
		longThreadLocal.set(Thread.currentThread().getId());
		stringThreadLocal.set(Thread.currentThread().getName());
	}
	
	public Long getLong() {
		return longThreadLocal.get();
	}
	
	public String getString() {
		return stringThreadLocal.get();
	}

	public static void main(String[] args) throws InterruptedException{
		final Test t = new Test();
		t.set();
		
		System.out.println(t.getLong());
		System.out.println(t.getString());
		
		Thread thread2 = new Thread() {
			public void run() {
				t.set();
				System.out.println(t.getLong());
				System.out.println(t.getString());
			}
		};
		thread2.start();
		thread2.join();
		
		System.out.println(t.getLong());
		System.out.println(t.getString());
	}

}
