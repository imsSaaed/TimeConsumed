package tpg.au;

import java.time.Duration;
import java.time.Instant;

public class GetExecutionTime {


/*
 * Created by Rahimi, 7/5/2018 
 * Time Start : 11:25am 
 * Time Finish : 11:35am
 * 
 * Question 3
 * Design a comprehensive timing measure tool, which can be used to measure time consumed for
   any independent method in other class.
 * 
 * 
 */

	//main method
    public static void main(String [] args) {
    	//get current instant time
		Instant start = Instant.now();
		
		//run program
		//for example 
		for(int i=0; i < 10000; i++){
			System.out.println("i : "+i);
		}		
		
		//call method to capture time consumed
		timeConsumed(start);
    }
    
    public static void timeConsumed(Instant start) {
    	//get finish instant time
		Instant end = Instant.now();
		System.out.println("Duration Instant :: "+Duration.between(start, end)); // prints PT1M3.553S
		System.out.println("Duration Milis Instant :: "+Duration.between(start, end).toMillis()); // prints milisecond
		System.out.println("Duration Nanos Instant :: "+Duration.between(start, end).toNanos()); // prints nanos
	}
}
