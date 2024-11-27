class MyRunnable implements Runnable {
       public void run() {
           System.out.println("Runnable thread is running");
       }
   }

   public class RunnableExample {
       public static void main(String[] args) {
           MyRunnable myRunnable = new MyRunnable();
           Thread t = new Thread(myRunnable);
           t.start(); // Start the thread
       }
   }
