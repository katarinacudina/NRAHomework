
public class ExecutionNoThreads {

	public static void main(String[] args) {
		int i = 0, number = 20000, sum = 0; 
		float average;
		
		System.out.println("Process starting... \n");
		
		long startTime = System.currentTimeMillis();
		
		for(i = 0; i<=number; i++)
    	{
    		sum = sum + i;
    	}
    	average = sum/number;
    	System.out.println(" \t Average is: " + average + "\n");
    	
    	long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime- startTime;
		
		System.out.println("Time passed(in milliseconds): " + elapsedTime + " \n");
    	System.out.println("Process ended. \n");
    	

	}

}
