package com.rk.ProducerAndConsumer1;

public class Factory {

	private int q;
	
	/*
	 * If it is false, just now consumption completed now, produce again
	 * If it is true, just now production completed now, consume it
	 */
	
	boolean produceorconsume = false;
	
	//producer
	synchronized public void setData(int x) throws InterruptedException{
		if(produceorconsume == true) {
			wait();
		}
		q = x; 
		System.out.println("I HAVE PUT " + x + " IN QUEUE"); 
		notify();
		produceorconsume = true;
		
	}
	
	//consumer
	synchronized public void readData() throws InterruptedException {
		if(produceorconsume == false) {
			wait();
		}
		System.out.println("I HAVE GOT " + q + " FROM QUEUE");
		notify();
		produceorconsume = false;
	}	
}

          /* OUTPUT
          I HAVE GOT 123566 FROM QUEUE
          I HAVE GOT 123566 FROM QUEUE
          I HAVE GOT 123566 FROM QUEUE
          I HAVE GOT 123566 FROM QUEUE
          I HAVE GOT 123566 FROM QUEUE
          I HAVE PUT 123566 IN QUEUE
          I HAVE PUT 123567 IN QUEUE
          I HAVE PUT 123568 IN QUEUE
          I HAVE PUT 123569 IN QUEUE
          I HAVE PUT 123570 IN QUEUE
          I HAVE PUT 123571 IN QUEUE
          
          Continuously executing..........
           */
