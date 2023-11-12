package com.rk.ProducerAndConsumer1;

public class Consumer extends Thread {

	Factory ref;

	public Consumer(Factory ref) {
		this.ref = ref;
	}

	@Override
	public void run() {
		try {
			while (true) {
				ref.readData();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
