

public class ExecutionWithThreads {
	
	public static void main(String[] args) throws InterruptedException {
		int counter, sum = 0, number = 10;
		double average = 0;
		long startTime = System.currentTimeMillis();
		
		//starting first thread
			ThreadExample thread1 = new ThreadExample("Thread-1", 0, 5000);
			ThreadExample thread2 = new ThreadExample("Thread-2", 5000, 10000);
			ThreadExample thread3 = new ThreadExample("Thread-3", 10000, 15000);
			ThreadExample thread4 = new ThreadExample("Thread-4", 15000, 20000);
			thread1.start();
			thread2.start();
			thread3.start();
			thread4.start();
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime- startTime;
		
		System.out.println("Time passed(in milliseconds): " + elapsedTime + " \n");

	}
	


	

}
class ThreadExample extends Thread{
    int number, sum = 0, start, i;
    double average;
    String threadName;
    
    ThreadExample(String threadName, int start,int number) {
        this.number = number;
        this.start = start;
        this.threadName = threadName;
    }

    public void run() {
    	System.out.println(threadName + " starting. \n");
    	
    	
    	for(i = start; i<=number; i++)
    	{
    		sum = sum + i;
    	}
    	average = sum/number;
        System.out.println(threadName + ": \t Average is: " + average + "\n");
        System.out.println(threadName + " ending. \n");
    }
}
