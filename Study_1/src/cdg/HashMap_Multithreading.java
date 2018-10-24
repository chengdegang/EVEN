package cdg;

import java.util.HashMap;

public class HashMap_Multithreading {
	public static final HashMap<String, String> HashMap = new HashMap<String, String>();

	public static void main(String[] args) throws InterruptedException {

		// 线程一
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 25; i++) {
					HashMap.put(String.valueOf(i), String.valueOf(i));
				}
			}
		};

		// 线程二
		Thread t2 = new Thread() {
			public void run() {
				for (int j = 25; j < 50; j++) {
					HashMap.put(String.valueOf(j), String.valueOf(j));
				}
			}
		};

		t1.start();
		t2.start();

		// 主线程休眠1秒钟，以便t1和t2两个线程将firstHashMap填装完毕。
		Thread.currentThread().sleep(1000);

		for (int l = 0; l < 50; l++) {
			// 如果key和value不同，说明在两个线程put的过程中出现异常。
			
//			if (!String.valueOf(l).equals(HashMap.get(String.valueOf(l)))) {
//				System.err.println(String.valueOf(l) + ":" + HashMap.get(String.valueOf(l)));
//			}
			
			//打印put的所有值
			
				System.out.println("key:"+l+"   value:"+HashMap.get(String.valueOf(l)));
			
		}
//		System.out.println(firstHashMap.size());
//		System.out.println(firstHashMap.get(String.valueOf(5)));
	}
}
