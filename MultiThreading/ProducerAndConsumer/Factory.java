package com.rk.ProducerAndConsumer;

public class Factory {

	private int q;
	
	/*
	 * If it is false, just now consumption completed now, produce
	 * If it is true, just now production completed now, consumption
	 */
	
	//producer
	public void setData(int x){
		q = x; 
		System.out.println("I HAVE PUT " + x + " IN QUEUE"); 
		
	}
	
	//consumer
	public void readData() {
		System.out.println("I HAVE GOT " + q + " FROM QUEUE");
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
