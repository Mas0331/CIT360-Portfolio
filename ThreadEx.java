package threads;

public class ThreadEx {

	public static class MyRunnable implements Runnable {
		@Override
		public void run() {
			System.out.println("This is a Threads and Runnables test!");
		}
	}
	
	public static void main(String[] args) {
		Thread myThread= new Thread(new MyRunnable());
		
		myThread.start();
	}
}
