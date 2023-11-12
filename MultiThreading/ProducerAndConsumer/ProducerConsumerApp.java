package com.rk.ProducerAndConsumer;

public class ProducerConsumerApp {

	public static void main(String[] args) {
		Factory ref = new Factory();
		
		Producer producer = new Producer(ref);
		Consumer consumer = new Consumer(ref);
		
		producer.start();
		consumer.start();
		
		
	}

}
