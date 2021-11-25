package it.uniparthenope.informatica.prgriii9.l19;

public class ThreadTester02 {
    public static void main(String args[]) {
        ThreadTester02.HelloRunner r = new ThreadTester02.HelloRunner();
        Thread t = new Thread(r);
        t.start();
    }

    static class HelloRunner implements Runnable {

        @Override
        public void run() {
            int i = 0;
            while (true) {
                System.out.println("Hello " + i++);
                if ( i == 50 ) {
                    break;
                }
            }

        }
    }
}


