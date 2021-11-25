package it.uniparthenope.informatica.prgriii9.l19;

public class Consumer implements Runnable {
    private SyncStack theStack;
    private int num;
    private static int counter = 1;

    private int items = 200;

    public Consumer (SyncStack s) {
        theStack = s;
        num = counter++;
    }

    public Consumer (SyncStack s, int items) {
        theStack = s;
        num = counter++;
        this.items = items;
    }


    @Override
    public void run() {
        char c;
        for (int i = 0; i < items; i++) {
            c = theStack.pop();
            System.out.println("Consumer" + num + ": " + c);

            try {
                Thread.sleep((int)(Math.random() * 300));
            } catch (InterruptedException e) {
                // ignore it
            }
        }
    }
}
