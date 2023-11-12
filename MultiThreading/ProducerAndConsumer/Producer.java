package com.rk.ProducerAndConsumer;

public class Producer extends Thread {

	//in order to access 'q' from factory
	Factory ref;
	//Constructor
	public Producer(Factory ref) {
		this.ref = ref;
	}
	
	@Override
	public void run() {
		//production should happen infinitely 
		int x = 0;
		while(true) {
			ref.setData(x++);
		}
	}
	

	
	
	
}
