package cdg;

import java.util.HashMap;

public class HashMap_Multithreading {
	public static final HashMap<String, String> HashMap = new HashMap<String, String>();

	public static void main(String[] args) throws InterruptedException {

		// �߳�һ
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 25; i++) {
					HashMap.put(String.valueOf(i), String.valueOf(i));
				}
			}
		};

		// �̶߳�
		Thread t2 = new Thread() {
			public void run() {
				for (int j = 25; j < 50; j++) {
					HashMap.put(String.valueOf(j), String.valueOf(j));
				}
			}
		};

		t1.start();
		t2.start();

		// ���߳�����1���ӣ��Ա�t1��t2�����߳̽�firstHashMap��װ��ϡ�
		Thread.currentThread().sleep(1000);

		for (int l = 0; l < 50; l++) {
			// ���key��value��ͬ��˵���������߳�put�Ĺ����г����쳣��
			
//			if (!String.valueOf(l).equals(HashMap.get(String.valueOf(l)))) {
//				System.err.println(String.valueOf(l) + ":" + HashMap.get(String.valueOf(l)));
//			}
			
			//��ӡput������ֵ
			
				System.out.println("key:"+l+"   value:"+HashMap.get(String.valueOf(l)));
			
		}
//		System.out.println(firstHashMap.size());
//		System.out.println(firstHashMap.get(String.valueOf(5)));
	}
}
