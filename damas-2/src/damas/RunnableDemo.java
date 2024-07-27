package damas;

class RunnableDemo implements Runnable {
  private Thread t;
  private String threadName;

  RunnableDemo(String name) {
     threadName = name;
     System.out.println("Creating " +  threadName );
  }
  
  public void run() {
     System.out.println("Running " +  threadName );
     
     try {
     
        for(int i = 4; i > 0; i--) {
           System.out.println("Thread: " + threadName + ", " + i);
           double q1 =0;
           for(long j=0;j<999999999;j++) {
             System.out.print("." );
           }

           
           // Let the thread sleep for a while.
//           Thread.sleep(5000);
        }
     } catch (Exception e) {
        System.out.println("Thread " +  threadName + " interrupted.");
     }
     System.out.println("Thread " +  threadName + " exiting.");
  }
  
  public void start () {
     System.out.println("Starting " +  threadName );
     
     if (t == null) {
        t = new Thread (this, threadName);
        t.start ();
     }
  }
}

