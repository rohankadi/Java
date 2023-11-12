package com.rk.RaceCondition;

public class MSWord_SolvingRaceCond extends Thread {

	@Override
	public void run() {

		try {
			if (Thread.currentThread().getName().equals("type")) 
			{
				typing();
			} 
			else if (Thread.currentThread().getName().equals("spellCheck"))
			{
				spellChecking();
			}
			else 
			{
				autoSaving();
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public void typing() throws InterruptedException {
		for (int i = 0; i <= 4; i++) {
			System.out.println("Typing....");
			Thread.sleep(5000);
		}
	}

	// 5. make background activities runs infinitely.
	public void spellChecking() throws InterruptedException {
		for ( ; ; ) {
			System.out.println("Spell Checking....");
			Thread.sleep(5000);
		}
	}

	// 5. make background activities runs infinitely.
	public void autoSaving() throws InterruptedException {
		for ( ; ; ) {
			System.out.println("Auto-Saving....");
			Thread.sleep(5000);
		}
	}
}
