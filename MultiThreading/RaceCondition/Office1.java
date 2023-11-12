package com.rk.RaceCondition;

public class Office1{
	// For this particular problem use "DAEMON THREAD" is used to  solve race condition

	public static void main(String[] args) {
		MSWord_SolvingRaceCond msw1 = new MSWord_SolvingRaceCond();
		MSWord_SolvingRaceCond msw2 = new MSWord_SolvingRaceCond();
		MSWord_SolvingRaceCond msw3 = new MSWord_SolvingRaceCond();
		
		// 1. setName();
		msw1.setName("type"); 	
		msw2.setName("spellCheck");
		msw3.setName("autoSave");
		
		/*
	    2. find foreground and background activities
	    => typing : foreground activity
	    => spell checking and autoSaving : background activity
	    
		3. set background activity as setDaemon(true) thread, which runs infinite times, 
		   until the foreground activity is executed
	    */
		
		msw2.setDaemon(true);
		msw3.setDaemon(true);
		
		//4. set low priority for background activities
		//5. make background activities runs infinitely. by changing in methods of spell check and autosave
		msw2.setPriority(6);
		msw3.setPriority(10);
		
		
		//6. link with thread scheduler
		msw1.start();
		msw2.start();
		msw3.start();
	
	}
}
