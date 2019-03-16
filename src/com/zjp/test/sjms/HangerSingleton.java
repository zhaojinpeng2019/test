package com.zjp.test.sjms;
/**
 * 单例模式
 * 饿汉式(立即加载)
 * @author zjp
 *
 */
public class HangerSingleton {

	private HangerSingleton() {}
	
	private static final HangerSingleton hanger = new HangerSingleton();
	
	public static HangerSingleton getInstance() {
		return hanger;
	}
}
