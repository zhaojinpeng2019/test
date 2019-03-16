package com.zjp.test.sjms;
/**
 * 懒汉式单例
 * 
 * @author zjp
 *
 */
public class LazySingleton {
	private static volatile LazySingleton lazySingleton;
	
	private LazySingleton() {}
	
	private static LazySingleton getInstance() {
		if(null == lazySingleton) {
			synchronized (LazySingleton.class) {
				if(null == lazySingleton) {
					lazySingleton = new LazySingleton();
				}
			}
		}
		return lazySingleton;
	}
}
