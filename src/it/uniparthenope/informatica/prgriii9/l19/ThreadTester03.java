package it.uniparthenope.informatica.prgriii9.l19;

public class ThreadTester03 {
    public static void main(String args[]) {

        Thread t = new Thread(new Runnable() {
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
        });
        t.start();
    }
}
