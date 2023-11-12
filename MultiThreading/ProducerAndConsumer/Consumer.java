package com.rk.ProducerAndConsumer;

public class Consumer extends Thread {

	Factory ref;
	public Consumer(Factory ref) {
		this.ref = ref;
	}
	
	@Override
	public void run() {
		while(true) {
			ref.readData();
		}
	}
	
}
