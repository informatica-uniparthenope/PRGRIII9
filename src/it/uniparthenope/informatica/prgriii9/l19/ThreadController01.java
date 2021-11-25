package it.uniparthenope.informatica.prgriii9.l19;

public class ThreadController01 {
    private Runner r = new Runner();
    private Thread t = new Thread(r);

    public void startThread() {
        t.start();
      }

      public void stopThread() {
     // use specific instance of Runner
     r.stopRunning();
   }
   public static void main(String[] args) {

        ThreadController01 threadController01 = new ThreadController01();

        threadController01.startThread();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       threadController01.stopThread();
   }

}
