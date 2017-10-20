/* **********************************************************
 * Programmer:	Caleb Beynon
 * Class:		CS30S
 * 
 * Assignment:	Exercise 2
 *
 * Description:	describe the class you are creating
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class AlarmClock
 {  // begin class
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
 	
	 private int currentTime[] = new int[3];	// the current time on the clock
	 private int alarmTime[] = new int[3];
 	// ********** constructors ***********
	 
	 /*******************************************************
	  *Purpose: 	create alarm clock with
	  *				default settings
	  *Interface:
	  *	in:			none
	  *	out:		none
	  *******************************************************/
	 public AlarmClock() {
		 currentTime[0] = 0;
		 currentTime[1] = 0;
		 currentTime[2] = 0;
		 
		 alarmTime[0] = 0;
		 alarmTime[1] = 0;
		 alarmTime[2] = 0;
	 } // end default constructor
	 
	 /*******************************************************
	  *Purpose: 	create alarm clock with
	  *				initialized settings
	  *Interface:
	  *	in:			current time (int[])
	  *				alarm time (int[])
	  *	out:		none
	  *******************************************************/
	 public AlarmClock(int[] current, int[] alarm) {
		 currentTime[0] = current[0];
		 currentTime[1] = current[1];
		 currentTime[2] = current[2];;
		 
		 alarmTime[0] = alarm[0];
		 alarmTime[1] = alarm[1];
		 alarmTime[2] = alarm[2];
	 } // end initialized constructor
 	
 	// ********** accessors **********
	 
	 /*******************************************************
	  *Purpose: 	returns current time as a string
	  *Interface:
	  *	in:			none
	  *	out:		current time (String)
	  *******************************************************/
	 public String getCurrent() {
		 String currentStr;
		 
		 String current[] = new String[3];
		 
		 current[0] = "" + currentTime[0];
		 current[1] = "" + currentTime[1];
		 current[2] = "" + currentTime[2];
		 
		 for (int idx = 0; idx < currentTime.length; idx++) {
			 if (currentTime[idx] < 10) {
				 current[idx] = "0" + currentTime[idx];
				 
			 }
			 
		 }
		 
		 currentStr = current[0] + ":" + current[1]
				 + ":" + current[2] + "\n";
		 
		 return currentStr;
	 } // end getCurrent()
	 
	 /*******************************************************
	  *Purpose: 	returns alarm time as a string
	  *Interface:
	  *	in:			none
	  *	out:		alarm time (String)
	  *******************************************************/
	 public String getAlarm() {
		 String alarmStr;
		 
		 String alarm[] = new String[3];
		 
		 alarm[0] = "" + alarmTime[0];
		 alarm[1] = "" + alarmTime[1];
		 alarm[2] = "" + alarmTime[2];
		 
		 for (int idx = 0; idx < alarmTime.length; idx++) {
			 if (alarmTime[idx] < 10) {
				 alarm[idx] = "0" + alarmTime[idx];
				 
			 }
			 
		 }
		 
		 alarmStr = alarm[0] + ":" + alarm[1]
				 + ":" + alarm[2] + "\n";
		 
		 return alarmStr;
	 } // end getAlarm()
	 
	 /*******************************************************
	  *Purpose: 	returns alarm time
	  *Interface:
	  *	in:			none
	  *	out:		alarm and current times (String)
	  *******************************************************/
	 public String toString() {
		 String clockTimes;		// initialize output string
		 
		 clockTimes = "Current Time:	" + this.getCurrent();
		 clockTimes += "Alarm Times:	" + this.getAlarm();
		 
		 return clockTimes;
	 } // end toString()
 	
 	// ********** mutators **********
	 
	 /*******************************************************
	  *Purpose: 	returns alarm time
	  *Interface:
	  *	in:			none
	  *	out:		alarm and current times (String)
	  *******************************************************/
 
 }  // end class