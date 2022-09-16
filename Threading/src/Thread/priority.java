package Thread;

public class priority {
	public void run()
    {
          System.out.println("run() method");
          String threadName = Thread.currentThread().getName();
          Integer threadPrio = Thread.currentThread().getPriority();
          System.out.println(threadName + " has priority " + threadPrio);
    }

	public static void main(String[] args)throws InterruptedException {
		 priority t1 = new priority();
         priority t2 = new priority();
         priority t3 = new priority();
         
         t1.setPriority(Thread.MAX_PRIORITY);
         t2.setPriority(Thread.MIN_PRIORITY);
         t3.setPriority(Thread.NORM_PRIORITY);
         
         t1.start();
         t2.start();
         t3.start();

       
		// TODO Auto-generated method stub

	}

}
