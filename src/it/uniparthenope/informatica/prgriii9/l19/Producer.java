package it.uniparthenope.informatica.prgriii9.l19;

public class Producer implements Runnable {
    private SyncStack theStack;
    private int num;
    private static int counter = 1;

    private int items = 200;

    public Producer (SyncStack s) {
        theStack = s;
        num = counter++;
    }

    public Producer (SyncStack s, int items) {
        theStack = s;
        num = counter++;
        this.items = items;
    }

    @Override
    public void run() {
        char c;

        for (int i = 0; i < items; i++) {
            c = (char)(Math.random() * 26 +'A');
            theStack.push(c);
            System.out.println("Producer" + num + ": " + c);
            try {
                Thread.sleep((int)(Math.random() * 300));
            } catch (InterruptedException e) {
                // ignore it
            }
        }
    }
}
