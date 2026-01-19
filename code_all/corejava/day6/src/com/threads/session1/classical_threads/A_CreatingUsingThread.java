package com.threads.session1.classical_threads;

class Job implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread is running: "+ Thread.currentThread().getName());
	}
}
public class A_CreatingUsingThread {
    public static void main(String[] args) throws InterruptedException {
    	System.out.println("Thread is running: "+ Thread.currentThread().getName());
      System.out.println("start");
      Job job=new Job();
      
      Thread thread1 = new Thread(job,"A");
//      Thread thread2 = new Thread(job,"B");
//      Thread thread3 = new Thread(job,"C");

      thread1.run();
//      thread2.start();
//      thread3.start();

      thread1.join(500);
//      thread2.join();
//      thread3.join();

      System.out.println("end");
    	
    	
    	
    	
    	
//    	//5, 10
//    	System.out.println("Thread is running: "+ Thread.currentThread().getName());
//    	System.out.println("Thread is running: "+ Thread.currentThread().getThreadGroup());
//    	
//    	System.out.println("Thread is running: "+ Thread.currentThread().getId());
//    	System.out.println("Thread is running: "+ Thread.currentThread().getPriority());
//    	
    	


    }
}
