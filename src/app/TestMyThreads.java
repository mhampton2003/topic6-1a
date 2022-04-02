package app;

/**
 * @author Maya
 */
public class TestMyThreads {

	/**
	 * creates two threads and starts them
	 * @param args Takes any number of values
	 */
	public static void main(String args[]) {
		//starts and creates a thread using the Thread class
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		
		//starts and creates a thread using the Runnable Interface
		Runnable runnable = new MyThread2();
		Thread thread2 = new Thread(runnable);
		thread2.start();
	}
}
