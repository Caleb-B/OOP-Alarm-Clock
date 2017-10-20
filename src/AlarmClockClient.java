// **********************************************************************
// Programmer:	Caleb Beynon
// Class:		CS30S
//
// Assignment:	Exercise 2
//
// Description:	a brief description of the program goes here
//
//
//	Input:		describe any input from keyboard or file
//
//  Output:		describe the result of your program
// ***********************************************************************

import javax.swing.*;
import java.text.DecimalFormat;

public class AlarmClockClient/*CHANGE THIS TO THE NAME OF THE FILE*/
{  // begin class
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
	// ***** create objects *****
		
		ProgramInfo InfoPrinter = new ProgramInfo();
		
		AlarmClock Clock = new AlarmClock();
		
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		InfoPrinter.printBanner("Exercise 2");
		
	// ***** get input *****
	
		// all input is gathered in this section
		// remember to put ConsoleReader.class into the
		// same folder.
	
	// ***** processing *****
	
		
	// ***** output *****
	
		System.out.println(Clock.getCurrent());
		System.out.println(Clock.getAlarm());
		System.out.println(Clock.toString());
		
	// ***** closing message *****
	
		InfoPrinter.printClosing();
	
	}  // end main	
}  // end class